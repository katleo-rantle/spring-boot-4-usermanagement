package com.katleo.spring_boot_4_usermanagement.dto;

public record UserDto(Long id,
                      String firstName,
                      String lastName,
                      String email ) {
}
