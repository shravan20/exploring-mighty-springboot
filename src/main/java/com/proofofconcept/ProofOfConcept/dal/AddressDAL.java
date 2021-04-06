package com.proofofconcept.ProofOfConcept.dal;
import com.proofofconcept.ProofOfConcept.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressDAL extends MongoRepository<Address,String> {

}
