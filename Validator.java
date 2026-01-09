package com.tka.service;


public class Validator {

    public static boolean isValidUid(String uid) {
        return uid != null && uid.matches("^[a-zA-Z0-9]{3,}$");
    }

    public static boolean isValidName(String name) {
        return name != null && name.matches("^[a-zA-Z\\s]+$");
    }

    public static boolean isValidAge(int age) {
        return age > 0 && age <= 120;
    }

    public static boolean isValidAddress(String address) {
        return address != null && address.trim().length() >= 5;
    }

    public static boolean isValidContact(String contact) {
        return contact != null && contact.matches("^\\d{10}$");
    }
}
