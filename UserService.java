package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.UserDao;
import com.tka.dao.UserLoginDao;
import com.tka.model.User;
import com.tka.model.UserLogin;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    UserLoginDao userLoginDao;

    public boolean registerUser(User user, UserLogin login) {
        try {
            userDao.save(user);
            userLoginDao.save(login);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyLoginDetailes(UserLogin login) {
        if (userLoginDao.existsById(login.getUid())) {
            UserLogin dbLogin = userLoginDao.findById(login.getUid()).get();
            return dbLogin.getPassword().equals(login.getPassword());
        }
        return false;
    }

    public List<User> getUserList() {
        return userDao.findAll();
    }
    public User getUserById(String uid) {
        return userDao.findById(uid).orElse(null);
    }

    public void updateUser(User user) {
        userDao.save(user); // saves new or updates existing
    }

    public void deleteUser(String uid) {
        userDao.deleteById(uid);
    }

}
