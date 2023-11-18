package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.AuthenticationService;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/admin")
@RequiredArgsConstructor
public class AdminController {
    @Autowired
    private final AuthenticationService authenticationService;
    @Autowired
    private UserService userService;
    @GetMapping(value = "/home")
    public String getListAccount() {
        return "Hi admin";
    }

    @GetMapping(value = "/getlistuser")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Users> getlistUser() {
        return userService.getListUser();
    }
}