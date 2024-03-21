package com.ms.brand_influencer.controller;

import com.ms.brand_influencer.model.db.User;
import com.ms.brand_influencer.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/app")
public class AppApi {

    private final UserRepository userRepository;

    public AppApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello from secured url");
    }

    @GetMapping("/admin_only")
    public ResponseEntity<String> adminOnly() {
        return ResponseEntity.ok("Hello from admin only url");
    }



}
