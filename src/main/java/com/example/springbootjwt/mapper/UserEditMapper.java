package com.example.springbootjwt.mapper;

import com.example.springbootjwt.dto.UserRequest;
import com.example.springbootjwt.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UserEditMapper {
    public Users create(UserRequest request) {
        Users user = new Users();
        user.setEmail(request.getEmail());
        user.setAddress(request.getAddress());
        user.setEnabled(user.isEnabled());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());
        return user;
    }
}