package com.dossantoscarlos.auth.modules.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(value = "api/v1/auth")
public class AuthResource {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping
    public String authenticate(
            Authentication authentication) {
        return authenticationService.authenticate(authentication);
    }
}