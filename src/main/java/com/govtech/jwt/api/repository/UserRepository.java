package com.govtech.jwt.api.repository;

import com.govtech.jwt.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
