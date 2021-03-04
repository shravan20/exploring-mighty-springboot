package com.proofofconcept.ProofOfConcept.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "UserInfo")
public class User {
    /**
     * User Entity
     */
    private String username;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
}
