package com.Steven_Tecnologies.P2P_Lending.api.repository;

import com.Steven_Tecnologies.P2P_Lending.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existByphoneNumber(String phone);
}
