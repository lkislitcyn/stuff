package com.example.stuff.model.inner;

import com.example.stuff.model.entities.AddressEntity;
import lombok.Data;

@Data
public class Person {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private AddressEntity addressByAddressId;
}
