package com.proofofconcept.ProofOfConcept.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.proofofconcept.ProofOfConcept.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/{userId}")
    public ResponseEntity getUser(@PathVariable String userId) {
        User userObject = new User();
        userObject.setUsername("Shravan Kumar B");
        userObject.setUserId(213);
        return new ResponseEntity<>(userObject, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User userDetails){
        return new ResponseEntity<>(userDetails, HttpStatus.CREATED);
    }


}
