package com.proofofconcept.ProofOfConcept.dal;
import org.apache.tomcat.jni.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressDAL extends MongoRepository<Address,String> {

}
