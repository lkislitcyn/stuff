package com.example.stuff.model.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity(name = "address")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "home_number")
    private long homeNumber;
}

