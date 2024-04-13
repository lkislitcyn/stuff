package com.example.stuff.controllers;

import com.example.stuff.mapper.AddressMapper;
import com.example.stuff.model.dto.AddressDTO;
import com.example.stuff.model.dto.ShortAddressDTO;
import com.example.stuff.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/stuff/address")
public class AddressController {
    private final AddressService addressService;

    private final AddressMapper addressMapper;
    @GetMapping("/list")
    public List<AddressDTO> test() {
        return addressService.getAllAddresses().stream().map(addressMapper::toDTO).toList();
    }

    @GetMapping("/short-data-list")
    public List<ShortAddressDTO> test1() {
        return addressService.getAllAddresses().stream().map(addressMapper::toDTOShort).toList();
    }

    @PostMapping("/")
    public long saveAddress(@RequestBody AddressDTO addressDTO) {
        return addressService.saveAddress(addressDTO);
    }

    @GetMapping("/{id}")
    public AddressDTO findById(@PathVariable("id") long id) {
        return addressService.findByIdAddress(id);
    }

    @PutMapping("/")
    public long update(@RequestBody AddressDTO addressDTO) {
        return addressService.updateAddress(addressDTO.getId(), addressDTO);
    }

    @DeleteMapping("/{id}")
    public void update(@PathVariable("id") long id) {
        addressService.deleteAddress(id);
    }
}
