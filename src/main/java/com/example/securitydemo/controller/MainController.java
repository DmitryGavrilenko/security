package com.example.securitydemo.controller;

import com.example.securitydemo.dto.UserDto;
import com.example.securitydemo.repository.RoleRepository;
import com.example.securitydemo.service.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private Register register;

    @GetMapping(value = "/home")
    public ResponseEntity<String> home(){

        return new ResponseEntity<>("Hello", HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<String> register(UserDto userDto){
        register.registerNewUserAccount(userDto);
        return new ResponseEntity<>("User created", HttpStatus.OK);
    }

    @GetMapping(value = "/look")
    private ResponseEntity<String> look(){
        return new ResponseEntity<>("Look", HttpStatus.OK);
    }

    @GetMapping(value = "/login")
    public void login(){

    }


}
