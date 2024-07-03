package com.admin.dto;

import lombok.Data;

@Data
public class RegisterUserRequestDto {
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String phoneNo;
    private String role;
    private String street;
    private String city;
    private int pincode;
    private int sellerId;
    private String status;

   
}
