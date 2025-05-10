package com.Steven_Tecnologies.P2P_Lending.api.controller.InterfaceApi;


import com.Steven_Tecnologies.P2P_Lending.api.dto.ErrorResponse;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserRegistrationRequestDto;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public interface AuthApi {


    @Operation(summary = "User Registration", responses = {
            @ApiResponse(responseCode = "200", description = "Successfully registered"),
            @ApiResponse(responseCode = "400", description = "Invalid request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "403", description = "Access denied", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Organization not found", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping("/register")
    ResponseEntity<UserResponseDto> register(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "User registration request",
                    required = true,
                    content = @Content(schema = @Schema(implementation = UserRegistrationRequestDto.class))
            )@Valid @RequestBody UserRegistrationRequestDto dto);
}
