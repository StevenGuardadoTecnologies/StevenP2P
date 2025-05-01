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
@Table(name = "user_statuses")
public class UserStatus  extends identifiableEntity{

    @Column(unique = true, nullable = false)
    private String statusName;
}
