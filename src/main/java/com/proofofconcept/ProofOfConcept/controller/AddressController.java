package com.proofofconcept.ProofOfConcept.controller;


import com.proofofconcept.ProofOfConcept.entity.Address;
import com.proofofconcept.ProofOfConcept.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/address")

public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        System.out.println(address+"Data Received");
        return new ResponseEntity<>(addressService.createAddress(address), HttpStatus.OK);
    }

}
