package com.example.isdb.auth;



import java.util.*;

import com.example.isdb.model.Role;
import com.example.isdb.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class IsdbUserDetail implements UserDetails {
    private User user;

    public IsdbUserDetail(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Role> roles = (Set<Role>) user.getRoles();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }


    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public Long getId() {
        return user.getId();
    }

//    @Override
    public boolean isEnabled() {
        return true;
    }


    public String getFirstName() {
        return user.getFirstName();
    }
    public Long getUserId() {
        return user.getId();
    }
    public User getUser(){
        return this.user;
    }



}