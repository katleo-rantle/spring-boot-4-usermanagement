package com.katleo.spring_boot_4_usermanagement.service.impl;

import com.katleo.spring_boot_4_usermanagement.dto.UserDto;
import com.katleo.spring_boot_4_usermanagement.entity.User;
import com.katleo.spring_boot_4_usermanagement.mapper.UserMapper;
import com.katleo.spring_boot_4_usermanagement.repository.UserRepository;
import com.katleo.spring_boot_4_usermanagement.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public  UserServiceImpl(UserRepository userRepository, UserMapper userMapper){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        User savedUser = userRepository.save(user);

        return userMapper.toDto(savedUser);
    }
}
