package com.example.kk.restapi.versioning;

public class PersonV2 extends Person{
    
    private Name name;

    public PersonV2() {

    }

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
