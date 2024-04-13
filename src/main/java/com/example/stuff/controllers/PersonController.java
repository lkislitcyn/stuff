package com.example.stuff.controllers;

import com.example.stuff.model.dto.PersonDTO;
import com.example.stuff.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/stuff/person")
public class PersonController {
    private final PersonService personService;

    @GetMapping("/list")
    public List<PersonDTO> getAllPerson() {
        return personService.getAllPerson();
    }

    @PostMapping("/")
    public long savePerson(@RequestBody PersonDTO personDTO) {
        return personService.savePerson(personDTO);
    }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable("id") long id)
    {
        return personService.findByIdPerson(id);
    }

    @PutMapping("/")
    public long update(@RequestBody PersonDTO personDTO)
    {
        return personService.updateAddress(personDTO.getId(), personDTO);
    }

    @DeleteMapping("/{id}")
    public void update(@PathVariable("id") long id) {
        personService.deletePerson(id);
    }
}
