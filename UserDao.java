
package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tka.model.User;

public interface UserDao extends JpaRepository<User, String> {
    // You can add custom queries here if needed
}
