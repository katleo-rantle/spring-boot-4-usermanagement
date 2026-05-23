package com.katleo.spring_boot_4_usermanagement.repository;

import com.katleo.spring_boot_4_usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
