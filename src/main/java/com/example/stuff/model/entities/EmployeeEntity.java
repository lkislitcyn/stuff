package com.example.stuff.model.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "employee")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "salary")
    private int salart;

    @Column(name = "person_id")
    private int person_id;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Employee_Person_Rel",
            joinColumns = {@JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "person_id")}
    )
    Set<Person> projects = new HashSet<>();


}
