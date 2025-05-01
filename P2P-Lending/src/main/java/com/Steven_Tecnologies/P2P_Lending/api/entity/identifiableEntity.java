package com.Steven_Tecnologies.P2P_Lending.api.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class identifiableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
