package com.Steven_Tecnologies.P2P_Lending.api.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_roles")
public class UserRole extends  identifiableEntity{

    @Column(nullable = false, unique=true)
    private String roleName;

    @Column
    private String description;
}
