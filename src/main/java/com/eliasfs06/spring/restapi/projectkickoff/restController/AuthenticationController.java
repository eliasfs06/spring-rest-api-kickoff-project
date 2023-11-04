package com.eliasfs06.spring.restapi.projectkickoff.restController;

import com.eliasfs06.spring.restapi.projectkickoff.model.dto.AuthenticationDTO;
import com.eliasfs06.spring.restapi.projectkickoff.model.dto.RegisterDTO;
import com.eliasfs06.spring.restapi.projectkickoff.service.security.AuthenticationService;
import com.eliasfs06.spring.restapi.projectkickoff.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthenticationController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){
        Authentication auth = authenticationService.authenticateUser(data);
        String token = authenticationService.getToken(auth);

        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterDTO> register(@RequestBody @Valid RegisterDTO userData){
        userService.registerUser(userData);
        return new ResponseEntity<>(userData, HttpStatus.CREATED);
    }

}


