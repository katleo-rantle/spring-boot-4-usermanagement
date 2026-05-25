package com.katleo.spring_boot_4_usermanagement.service.impl;

import com.katleo.spring_boot_4_usermanagement.dto.UserDto;
import com.katleo.spring_boot_4_usermanagement.entity.User;
import com.katleo.spring_boot_4_usermanagement.exception.ResourceNotFoundException;
import com.katleo.spring_boot_4_usermanagement.mapper.UserMapper;
import com.katleo.spring_boot_4_usermanagement.repository.UserRepository;
import com.katleo.spring_boot_4_usermanagement.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    private User findUserOrThrow(Long id){
        return userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("user not found with id: "+id));
    }

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

    @Override
    public UserDto getUserById(Long id) {
        User user = findUserOrThrow(id);
        return userMapper.toDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userMapper::toDto)
                .toList();
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        User user = findUserOrThrow(id);
        if(userDto.firstName() != null){
            user.setFirstName(userDto.firstName());
        }
        if(userDto.lastName() != null){
            user.setLastName(userDto.lastName());
        }
        if(userDto.email() != null){
            user.setEmail(userDto.email());
        }
        User updatedUser = userRepository.save(user);
        return userMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        User user = findUserOrThrow(id);
        userRepository.delete(user);
    }


}
