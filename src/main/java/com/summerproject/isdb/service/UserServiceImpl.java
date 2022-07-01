package com.summerproject.isdb.service;

import com.summerproject.isdb.dto.UserRegistrationDto;
import com.summerproject.isdb.models.UserModel;
import com.summerproject.isdb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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
        UserModel user = new UserModel(registrationDto.getUser_id(), registrationDto.getfName(),
                registrationDto.getlName(), registrationDto.getPhone(),registrationDto.getEmail(),
                registrationDto.getState(), registrationDto.getUserType(), registrationDto.getUserName(),
                registrationDto.getDob(), registrationDto.getPassword());
        return userRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
