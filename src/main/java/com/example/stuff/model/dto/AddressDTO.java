package com.example.stuff.model.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private int id;
    private String country;
    private String city;
    private String street;
    private Integer homeNumber;
}



