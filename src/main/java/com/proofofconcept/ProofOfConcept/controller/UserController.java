package com.proofofconcept.ProofOfConcept.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.proofofconcept.ProofOfConcept.entity.User;
import com.proofofconcept.ProofOfConcept.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/{userId}")
    public ResponseEntity getUser(@PathVariable int userId) {
        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User userDetails){
        return new ResponseEntity<>(userService.addUser(userDetails), HttpStatus.CREATED);
    }


}
