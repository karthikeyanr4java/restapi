FROM openjdk:8
EXPOSE 8000
ADD target/restapi-0.0.1-SNAPSHOT.jar restapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/restapi-0.0.1-SNAPSHOT.jar"]