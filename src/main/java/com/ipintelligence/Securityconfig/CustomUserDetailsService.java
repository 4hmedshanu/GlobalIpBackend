package com.ipintelligence.Securityconfig;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ipintelligence.model.User;
import com.ipintelligence.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByEmail(username).orElse(null);
        if(user==null) {
        	return null;
        }

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())            // login with email
                .password(user.getPassword())         // encrypted password stored in DB
                .roles(user.getRole())                // example: ROLE_USER
                .build();
    }
}
