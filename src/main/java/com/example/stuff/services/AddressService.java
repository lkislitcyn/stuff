package com.example.stuff.services;


import com.example.stuff.model.entities.AddressEntity;
import com.example.stuff.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
//    private final AddressMapper addressMapper;

//    public List<Address> getAllAddresses() {
//        return addressRepository.findAll().stream().map(addressMapper::fromEntity).map(address -> {
//            address.setCompanyCount((int) (Math.random() * 100));
//            return address;
//        }).toList();
//    }

    public List<AddressEntity> getAllAddreess()
    {
        return addressRepository.findAll();
    }
    public Optional<AddressEntity> getAddress(Long id) {
        return addressRepository.findById(id);
    }

    public Optional<AddressEntity> getAddress1(Long id) {
        return getAddress(id);
    }
}
