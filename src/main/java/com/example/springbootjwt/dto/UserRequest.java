package com.example.springbootjwt.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserRequest {
    @NonNull
    private String email;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private String password;
    private String repeatPassword;
    private String address;
}