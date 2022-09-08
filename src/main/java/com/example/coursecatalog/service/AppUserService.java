package com.example.coursecatalog.service;

import org.springframework.stereotype.Service;

import com.example.coursecatalog.entity.AppUser;
import com.example.coursecatalog.entity.AppUserRole;
import com.example.coursecatalog.repository.AppUserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;

    //private final String USER_NOT_FOUND_MSG = "user with email is not found";

    public String register(AppUser appUser) {
        boolean userExists = appUserRepository.findByEmail(appUser.getEmail()).isPresent();
        if (userExists){
            throw new IllegalStateException("Email is already used");
        }

        appUser.setRole(AppUserRole.USER);
        appUserRepository.save(appUser);        
        return "Registered";
    }
}
