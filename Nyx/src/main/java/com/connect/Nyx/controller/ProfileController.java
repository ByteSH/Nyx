package com.connect.Nyx.controller;

import com.connect.Nyx.io.ProfileRequest;
import com.connect.Nyx.io.ProfileResponse;
import com.connect.Nyx.service.ProfileServices;
import com.connect.Nyx.service.ProfileServicesImp;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1.0")
@AllArgsConstructor
@RestController
public class ProfileController {

    private final ProfileServicesImp profileServicesImp;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse register(@Valid @RequestBody ProfileRequest profileRequest){
        ProfileResponse response = profileServicesImp.createProfile(profileRequest);
        return response;
    }
}
