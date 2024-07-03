package com.admin.dto;

import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private long phoneNo;
    private String role;
    private String status;
    private AddressDto address;

    
}
