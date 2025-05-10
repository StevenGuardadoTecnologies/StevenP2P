package com.Steven_Tecnologies.P2P_Lending.api.entity;

import jakarta.persistence.*;

@Entity
public class UserDetails  extends  identifiableEntity{


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;


    private String address;

    private String city;

    private String country;

    private String zipCode;


    @Column(nullable = false, unique=true)
    private String  cf;
}
