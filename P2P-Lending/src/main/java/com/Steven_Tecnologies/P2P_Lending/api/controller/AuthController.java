package com.Steven_Tecnologies.P2P_Lending.api.controller;


import com.Steven_Tecnologies.P2P_Lending.api.dto.UserRegistrationRequestDto;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserResponseDto;
import com.Steven_Tecnologies.P2P_Lending.api.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {



    private final AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> register(@Valid @RequestBody UserRegistrationRequestDto dto){


        try{


        }catch(Exception e){


        }
        return ResponseEntity.status(HttpStatus.CREATED).body(authService.register(dto));
    }
}
