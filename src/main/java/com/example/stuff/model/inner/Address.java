package com.example.stuff.model.inner;

import lombok.Data;

@Data
public class Address {
    private int id;
    private String country;
    private String city;
    private String street;
    private Integer homeNumber;
    private Integer companyCount;
    private Integer peopleCount;
}
