package com.example.stuff.services;

import com.example.stuff.mapper.PersonMapper;
import com.example.stuff.model.dto.PersonDTO;
import com.example.stuff.model.entities.PersonEntity;
import com.example.stuff.repositories.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public List<PersonDTO> getAllPerson() {
        return personRepository.findAll().stream().map(personMapper::fromEntity).map(personMapper::toDTO).toList();
    }

    public long savePerson(PersonDTO personDTO) {
        var saved = personRepository.save(personMapper.toEntity(personMapper.fromDTO(personDTO)));
        return saved.getId();
    }


    public PersonDTO findByIdPerson(long id) {
        return personMapper.toDTO(personMapper.fromEntity(personRepository.findById(id).get()));
    }

    public void deletePerson(long id) {
        personRepository.deleteById(id);
    }

    public long updateAddress(long id, PersonDTO personDTO) {
        PersonEntity personEntity = personRepository.findById(id).get();
        personEntity.setFirstName(personDTO.getFirstName());
        personEntity.setMiddleName(personDTO.getMiddleName());
        personEntity.setLastName(personDTO.getLastName());
        personEntity.setAddressByAddressId(personDTO.getAddressByAddressId());
        return personEntity.getId();
    }
}
