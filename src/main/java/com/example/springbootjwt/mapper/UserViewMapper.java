package com.example.springbootjwt.mapper;

import com.example.springbootjwt.dto.UserResponse;
import com.example.springbootjwt.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UserViewMapper {
    public UserResponse viewUser(Users user) {
        if (user == null) {
            return null;
        }
        UserResponse userResponse = new UserResponse();
        if (user.getId() != null) {
            userResponse.setId(String.valueOf(user.getId()));
        }
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setAddress(user.getAddress());
        userResponse.setEnabled(user.isEnabled());
        return userResponse;
    }
}