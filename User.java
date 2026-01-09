package com.tka.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
    private String uid;
    private String name;
    private int age;
    private String address;
    private String contact;

    public User() {}

    public User(String uid, String name, int age, String address, String contact) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    // Getters and setters
    public String getUid() { return uid; }
    public void setUid(String uid) { this.uid = uid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    @Override
    public String toString() {
        return uid + " - " + name + " - " + age;
    }
}
