package com.example.stuff.services;


import com.example.stuff.mapper.AddressMapper;
import com.example.stuff.model.dto.AddressDTO;
import com.example.stuff.model.entities.AddressEntity;
import com.example.stuff.model.inner.Address;
import com.example.stuff.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll().stream().map(addressMapper::fromEntity).map(address -> {
            address.setCompanyCount((int) (Math.random() * 100));
            return address;
        }).toList();
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll().stream().map(addressMapper::fromEntity).toList();
    }


    public long saveAddress(AddressDTO addressDTO) {
        var saved = addressRepository.save(addressMapper.toEntity(addressMapper.fromDTO(addressDTO)));
        return saved.getId();
    }

    public AddressDTO findByIdAddress(long id) {
        return addressMapper.toDTO(addressMapper.fromEntity(addressRepository.findById(id).get()));
    }

    public void deleteAddress(long id) {

        addressRepository.deleteById(id);
    }

    public long updateAddress(long id, AddressDTO addressDTO) {
        AddressEntity addressEntity = addressRepository.findById(id).get();
        addressEntity.setCity(addressDTO.getCity());
        addressEntity.setCountry(addressDTO.getCountry());
        addressEntity.setStreet(addressDTO.getStreet());
        addressEntity.setHomeNumber(addressDTO.getHomeNumber());
        addressRepository.save(addressEntity);
        return addressEntity.getId();
    }

}
