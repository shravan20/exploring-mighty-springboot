package com.proofofconcept.ProofOfConcept.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "/{userId}")
    public ResponseEntity getUser(@PathVariable String userId) {
        String user = "Shravan Kumar B";
        HashMap <String, String> userData = new HashMap<>();
        userData.put("name", user);
        userData.put("id", userId);

        return new ResponseEntity<>(userData, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody HashMap<String,String> userDetails){
        return new ResponseEntity<>(userDetails, HttpStatus.CREATED);
    }


}
