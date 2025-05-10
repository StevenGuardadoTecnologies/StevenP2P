package com.Steven_Tecnologies.P2P_Lending.api.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {

    private Long id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String role;
    private String status;
}
