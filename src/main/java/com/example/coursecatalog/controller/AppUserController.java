package com.example.coursecatalog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursecatalog.entity.AppUser;
import com.example.coursecatalog.service.AppUserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AppUserController {
    private final AppUserService appUserService;

    @PostMapping("/api/v1/course/registration")
    public String register(@RequestBody AppUser appUser){
        return appUserService.register(appUser);
    }
}
