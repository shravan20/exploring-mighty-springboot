package com.proofofconcept.ProofOfConcept.services;

import com.proofofconcept.ProofOfConcept.dal.AddressDAL;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class AddressImpl implements AddressService {

    @Autowired
    AddressDAL addressDAL;

    public Address createAddress(Address addressObj){
        return addressDAL.save(addressObj);
    }

    /*
    @Override
    public Address getAddress() {
        return null;
    }
    */


}
