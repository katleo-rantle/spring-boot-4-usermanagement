package com.katleo.spring_boot_4_usermanagement.service;

import com.katleo.spring_boot_4_usermanagement.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
