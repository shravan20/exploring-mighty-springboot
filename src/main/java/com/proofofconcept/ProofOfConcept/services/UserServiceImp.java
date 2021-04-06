package com.proofofconcept.ProofOfConcept.services;

import com.proofofconcept.ProofOfConcept.dal.UserDAL;
import com.proofofconcept.ProofOfConcept.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    //@service|@repository|@configuration-> will provide a bean/component
    //@Autowired => performs component scan and load respective bean

    @Autowired
    private UserDAL userDal;

    @Override
    public User addUser(User user) {
        return userDal.save(user);
    }

    @Override
    public User getUser(int id) {
        Optional<User> data = userDal.findById(id);
        if(data.isPresent())
            return data.get();
        else
            return null;
    }

}
