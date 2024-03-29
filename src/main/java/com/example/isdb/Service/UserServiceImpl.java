package com.example.isdb.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import com.example.isdb.Repository.UserRepository;
import com.example.isdb.model.Role;
import com.example.isdb.model.User;
import com.example.isdb.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Lazy
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

//      public User(String firstName, String lastName, String user_name, String email, String user_type,
//                String state, String qualification, String occupation, String company, String password, Collection<Role> roles) {
    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getUser_name(),registrationDto.getEmail(),
                registrationDto.getUser_type(),registrationDto.getState(), registrationDto.getQualification(),
                registrationDto.getOccupation(), registrationDto.getCompany(),
                passwordEncoder.encode(registrationDto.getPassword()),  Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role-> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }


}