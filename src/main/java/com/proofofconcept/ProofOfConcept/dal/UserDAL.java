package com.proofofconcept.ProofOfConcept.dal;

import com.proofofconcept.ProofOfConcept.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserDAL extends JpaRepository<User, Integer> {



}
