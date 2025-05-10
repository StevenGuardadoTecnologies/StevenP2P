package com.Steven_Tecnologies.P2P_Lending.api.dto;


import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "email", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String email;

    @NotBlank
    @Schema(description = "password", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String password;
}
