package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tka.model.UserLogin;

public interface UserLoginDao extends JpaRepository<UserLogin, String> {
    // Additional query methods can be defined here
}
