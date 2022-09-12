package com.example.isdb.Service;

import com.example.isdb.model.User;
import com.example.isdb.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);

//    User getByEmail(String email);
}