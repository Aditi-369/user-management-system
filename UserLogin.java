package com.tka.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserLogin {

    @Id
    private String uid;
    private String password;

    public UserLogin() {}

    public UserLogin(String uid, String password) {
        this.uid = uid;
        this.password = password;
    }

    public String getUid() { return uid; }
    public void setUid(String uid) { this.uid = uid; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return uid;
    }
}
