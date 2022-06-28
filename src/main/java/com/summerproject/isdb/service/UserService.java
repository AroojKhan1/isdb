package com.summerproject.isdb.service;

import com.summerproject.isdb.dto.UserRegistrationDto;
import com.summerproject.isdb.models.UserModel;

public interface UserService {
    UserModel save (UserRegistrationDto registrationDto);

}
