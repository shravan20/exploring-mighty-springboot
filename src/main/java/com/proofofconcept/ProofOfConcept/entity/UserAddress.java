package com.proofofconcept.ProofOfConcept.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Collection;

@Getter
@Setter
@Document(collection = "UserAddress")
public class UserAddress {

    @Id
    private String id;
    private String locationName;

}
