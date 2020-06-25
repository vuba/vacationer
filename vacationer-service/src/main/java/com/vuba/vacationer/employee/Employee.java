package com.vuba.vacationer.employee;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
@Data
public class Employee {

    @MongoId
    private String id;

    private String username;

    private String companyEmail;

    private String personalEmail;

    private String firstName;

    private String lastName;

    private String companyPhoneNumber;

    private String personalPhoneNumber;

    private List<Address> addresses;
}
