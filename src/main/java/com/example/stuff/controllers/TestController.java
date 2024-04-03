package com.example.stuff.controllers;

import com.example.stuff.mapper.AddressMapper;
import com.example.stuff.model.entities.AddressEntity;
import com.example.stuff.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class TestController {

    private final AddressService addressService;

    private final AddressMapper addressMapper;


//    @GetMapping("/index")
//    public List<AddressDTO> test() {
//         return addressService.getAllAddresses().stream().map(addressMapper::toDTO).toList();
//
//    }
//
//    @GetMapping("/index1")
//    public List<ShortAddressDTO> test1() {
//        return addressService.getAllAddresses().stream().map(addressMapper::toDTOShort).toList();
//
//    }

    @GetMapping("/index1")
    public List<AddressEntity> test1() {
        return addressService.getAllAddreess();
    }

}
