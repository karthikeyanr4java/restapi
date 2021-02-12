package com.example.kk.restapi.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping("v1/person")
    public PersonV1 personv1() {
        return new PersonV1("person v1");
    }

    @GetMapping("v2/person")
    public PersonV2 personv2() {
        return new PersonV2(new Name("name1", "name2"));
    }
}
