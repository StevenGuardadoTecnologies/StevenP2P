package com.Steven_Tecnologies.P2P_Lending.api.dto;


import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "full Name", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String fullName;

    @Email
    @NotBlank
    @Schema(description = "email",accessMode = Schema.AccessMode.WRITE_ONLY)
    private String email;


    @NotBlank
    @Schema( description = "password", accessMode = Schema.AccessMode.WRITE_ONLY)
    private String password;

    @Size(min = 8)
    @NotBlank
    @Schema(name="phoneNumber", description = "phone number",accessMode = Schema.AccessMode.WRITE_ONLY)
    private String phoneNumber;

    @NotNull
    @Schema(name="dateOfBirth", description = "date of Birth", accessMode = Schema.AccessMode.WRITE_ONLY)
    private LocalDate dateOfBirth;

    @NotNull
    @Schema( description = "role ID",accessMode = Schema.AccessMode.WRITE_ONLY)
    private Long roleId;

    @NotNull
    @Schema( description = "role ID",accessMode = Schema.AccessMode.WRITE_ONLY)
    private Long statusId;


}
