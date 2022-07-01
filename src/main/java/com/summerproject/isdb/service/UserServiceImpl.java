package com.summerproject.isdb.service;

import com.summerproject.isdb.dto.UserRegistrationDto;
import com.summerproject.isdb.models.UserModel;
import com.summerproject.isdb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @Override
    public UserModel save(UserRegistrationDto registrationDto) {
        UserModel user = new UserModel(registrationDto.getfName(), registrationDto.getlName(), registrationDto.getEmail(), registrationDto.getPassword());
        return userRepo.save(user);
    }
}
