package com.katleo.spring_boot_4_usermanagement.mapper;

import com.katleo.spring_boot_4_usermanagement.dto.UserDto;
import com.katleo.spring_boot_4_usermanagement.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user){
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getFirstName(),
                user.getEmail()
        );
    }
    public User toEntity(UserDto userDto){
        return new User(
                userDto.id(),
                userDto.firstName(),
                userDto.lastName(),
                userDto.email()
        );
    }
}
