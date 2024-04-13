package com.example.stuff.mapper;

import com.example.stuff.model.dto.AddressDTO;
import com.example.stuff.model.dto.ShortAddressDTO;
import com.example.stuff.model.entities.AddressEntity;
import com.example.stuff.model.inner.Address;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address fromDTO(AddressDTO addressDTO);

    AddressEntity toEntity(Address address);

    Address fromEntity(AddressEntity addressEntity);

    AddressDTO toDTO(Address address);

    @Mapping(target = "place", ignore = true)
    ShortAddressDTO toDTOShort(Address address);

    @AfterMapping
    default void mapPlace(Address address, @MappingTarget ShortAddressDTO target) {
        target.setPlace(String.format("%s %s %s %s", address.getCountry(), address.getCity(), address.getStreet(), address.getHomeNumber()));

    }
}



