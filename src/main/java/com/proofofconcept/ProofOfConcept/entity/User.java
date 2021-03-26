package com.proofofconcept.ProofOfConcept.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "UserInfo")
@ToString
public class User {
    /**
     * User Entity
     */
    private String username;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
}
