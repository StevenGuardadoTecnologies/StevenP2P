package com.Steven_Tecnologies.P2P_Lending.api.repository;

import com.Steven_Tecnologies.P2P_Lending.api.entity.RefreshToken;
import com.Steven_Tecnologies.P2P_Lending.api.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Long> {


    Optional<RefreshToken> findByToken(String token);

    Optional<RefreshToken> findByUser(User user);

    void deleteByUser(User user);
}
