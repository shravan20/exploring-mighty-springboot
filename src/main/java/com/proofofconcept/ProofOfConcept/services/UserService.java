package com.proofofconcept.ProofOfConcept.services;

import com.proofofconcept.ProofOfConcept.entity.User;

public interface UserService {

    public User addUser(User user);
    public User getUser(int id);

}

