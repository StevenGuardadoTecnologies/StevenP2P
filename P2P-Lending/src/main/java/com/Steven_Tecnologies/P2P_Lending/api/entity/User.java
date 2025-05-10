package com.Steven_Tecnologies.P2P_Lending.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "phoneNumber")
})
@Entity
public class User extends  identifiableEntity{

    private String fullName;

    private String email;

    private String password;

    private String phoneNumber;

    private LocalDate dateOfBirth;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private UserRole role;


    @Column(nullable = false)
    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", nullable = false)
    private UserStatus status;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private UserDetails userDetails;

}
