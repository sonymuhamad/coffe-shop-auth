package com.sony.coffeshopauth.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates a constructor with all fields
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String email;
    private String password;
    private String fullName;
}
