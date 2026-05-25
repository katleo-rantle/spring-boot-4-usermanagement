package com.katleo.spring_boot_4_usermanagement.service;

import com.katleo.spring_boot_4_usermanagement.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long id,UserDto userDto);

    void deleteUser(Long id);
}

