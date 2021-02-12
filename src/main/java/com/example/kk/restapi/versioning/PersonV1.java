package com.example.kk.restapi.versioning;

public class PersonV1 extends Person{
    private String name;

    public PersonV1() {

    }
    
    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
