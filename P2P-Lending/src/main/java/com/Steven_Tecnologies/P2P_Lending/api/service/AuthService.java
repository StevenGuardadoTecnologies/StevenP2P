package com.Steven_Tecnologies.P2P_Lending.api.service;

import com.Steven_Tecnologies.P2P_Lending.api.dto.UserLoginRequestDto;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserRegistrationRequestDto;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserResponseDto;
import com.Steven_Tecnologies.P2P_Lending.api.entity.User;
import com.Steven_Tecnologies.P2P_Lending.api.entity.UserRole;
import com.Steven_Tecnologies.P2P_Lending.api.entity.UserStatus;
import com.Steven_Tecnologies.P2P_Lending.api.mapper.UserMapper;
import com.Steven_Tecnologies.P2P_Lending.api.repository.UserRepository;
import com.Steven_Tecnologies.P2P_Lending.api.repository.UserRoleRepository;
import com.Steven_Tecnologies.P2P_Lending.api.repository.UserStatusRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
@Log4j2
public class AuthService {


    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final UserStatusRepository userStatusRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserResponseDto register(UserRegistrationRequestDto dto) {


        try {

            log.info("Registering user");
            if (userRepository.existsByEmail(dto.getEmail())) {
                throw new IllegalArgumentException("Email already exists");
            }
            if (userRepository.existByphoneNumber((dto.getPhoneNumber()))) {

                throw new IllegalArgumentException("Phone number already exists");
            }

            UserRole role = userRoleRepository.findById(dto.getRoleId())
                    .orElseThrow(() -> new IllegalArgumentException("Role not found."));


            UserStatus status = userStatusRepository.findById(dto.getStatusId())
                    .orElseThrow(() -> new IllegalArgumentException("status not found."));

            User user = User.builder()
                    .fullName(dto.getFullName())
                    .email(dto.getEmail())
                    .password(passwordEncoder.encode(dto.getPassword()))
                    .phoneNumber(dto.getPhoneNumber())
                    .dateOfBirth(dto.getDateOfBirth())
                    .role(role)
                    .status(status)
                    .score(100)
                    .build();


            userRepository.save(user);
            return userMapper.toResponseDto(user);
        } catch (Exception e) {
            log.error("Error registering user", e.getMessage());
            throw e;
        }

    }


    public UserResponseDto login(UserLoginRequestDto dto) {
        try {
            log.info("Logining user with email :{}", dto.getEmail());

            User user = userRepository.findByEmail(dto.getEmail()).orElseThrow(() -> new UsernameNotFoundException("Email not found"));

            if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
                throw new BadCredentialsException("Wrong password");
            }

            return userMapper.toResponseDto(user);
        } catch (Exception e) {
            log.error("Error logining user", e.getMessage());
            throw e;
        }


    }
}
