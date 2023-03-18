package com.mryzhan.model;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
