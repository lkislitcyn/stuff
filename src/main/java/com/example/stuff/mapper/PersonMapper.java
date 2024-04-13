package com.example.stuff.mapper;

import com.example.stuff.model.dto.PersonDTO;
import com.example.stuff.model.entities.PersonEntity;
import com.example.stuff.model.inner.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    Person fromDTO(PersonDTO personDTO);

    PersonDTO toDTO(Person person);

    PersonEntity toEntity(Person person);

    Person fromEntity(PersonEntity personEntity);


}
