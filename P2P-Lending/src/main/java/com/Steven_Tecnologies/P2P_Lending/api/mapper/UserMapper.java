package com.Steven_Tecnologies.P2P_Lending.api.mapper;


import ch.qos.logback.core.model.ComponentModel;
import com.Steven_Tecnologies.P2P_Lending.api.dto.UserResponseDto;
import com.Steven_Tecnologies.P2P_Lending.api.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel= MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    @Mapping(source="role.roleName", target="role")
    @Mapping(source="status.statusName", target="status")
    UserResponseDto toResponseDto(User user);
}
