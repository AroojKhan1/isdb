package com.summerproject.isdb.service;

import com.summerproject.isdb.dto.UserRegistrationDto;
import com.summerproject.isdb.models.UserModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserModel save (UserRegistrationDto registrationDto);

}
