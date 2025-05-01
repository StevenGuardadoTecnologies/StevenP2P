package com.Steven_Tecnologies.P2P_Lending.api.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegistrationRequestDto {

    @NotBlank
    private String fullName;

    @Email
    @NotBlank
    private String email;


    @NotBlank
    private String password;

    @Size(min = 8)
    @NotBlank
    private String phoneNumber;

    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private Long roleId;

    @NotNull
    private Long statusId;


}
