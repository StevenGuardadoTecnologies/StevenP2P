package com.Steven_Tecnologies.P2P_Lending.api.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import javax.swing.text.SimpleAttributeSet;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginRequestDto {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
