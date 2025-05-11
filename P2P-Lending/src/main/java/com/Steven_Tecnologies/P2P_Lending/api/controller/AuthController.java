package com.Steven_Tecnologies.P2P_Lending.api.controller;


import com.Steven_Tecnologies.P2P_Lending.api.controller.InterfaceApi.AuthApi;
import com.Steven_Tecnologies.P2P_Lending.api.dto.JwtAuthenticationResponse;
import com.Steven_Tecnologies.P2P_Lending.api.dto.Request.RefreshTokenRequest;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserLoginRequestDto;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserRegistrationRequestDto;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserResponseDto;
import com.Steven_Tecnologies.P2P_Lending.api.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController implements AuthApi {



    private final AuthService authService;

    @Override
    public ResponseEntity<UserResponseDto> register(UserRegistrationRequestDto dto) {
        try {
            log.info("📥 Registering user with email: {}", dto.getEmail());
            UserResponseDto response = authService.register(dto);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            log.error(" Registration failed: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @Override
    public ResponseEntity<JwtAuthenticationResponse> refreshToken(
        RefreshTokenRequest request
    ){

        return null;
    }

    @Override
    public ResponseEntity<JwtAuthenticationResponse> login(
          UserLoginRequestDto request
    ){

        return null;
    }


    @Override
    public ResponseEntity<Void> logout(
             RefreshTokenRequest request
    ){
        return null;
    }
}
