package com.ms.brand_influencer.service;

import com.ms.brand_influencer.model.bean.AuthenticationResponse;
import com.ms.brand_influencer.model.db.Token;

import com.ms.brand_influencer.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    //private final TokenRepository tokenRepository;
    private final AuthenticationManager authenticationManager;


    public ApiService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService, AuthenticationManager authenticationManager){
        this.userRepository= userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
        //this.tokenRepository = tokenRepository;
        this.authenticationManager = authenticationManager;
    }

    /*public Users onboardUser(Users users) {
        return userRepository.save(users);
    }*/


    /*public Users loadUserByuserName(String username) {
    }*/


}
