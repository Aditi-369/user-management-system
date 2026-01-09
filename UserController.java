package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.model.User;
import com.tka.model.UserLogin;
import com.tka.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

        @GetMapping("/open-registrationPage")
        public String openRegistrationPage() {
            return "UserRegistration"; // This maps to /src/main/webapp/WEB-INF/view/UserRegistration.jsp
        }


    @GetMapping("/user-loginPage")
    public String openUserLogin() {
        return "UserLogin";
    }

    @PostMapping("/register-user")
    public String registerUser(@ModelAttribute User user, @ModelAttribute UserLogin userlogin, Model model) {
        boolean success = userService.registerUser(user, userlogin);
        model.addAttribute("message", success ? "Registration successful!" : "Failed to register.");
        return "UserLogin";
    }

    @PostMapping("/verify-LoginDetails")
    public String verifyLoginDetailes(@ModelAttribute UserLogin userLogin, Model model) {
        boolean verified = userService.verifyLoginDetailes(userLogin);
        model.addAttribute("msg", verified ? userLogin.getUid() + " Login Successful" : userLogin.getUid() + " Login Failed");
        return "WelcomePage";
    }

    @GetMapping("/view-user-details")
    public String viewUser(Model model) {
        User user = new User("123", "Dummy", 22, "Pune", "1234567890");
        model.addAttribute("user", user);
        return "UserDetails";
    }

    @GetMapping("/view-alluser-details")
    public String viewAllUser(Model model) {
        List<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);
        return "AllUserDetails";
    }

    @GetMapping("/open-contact")
    public String openContact() {
        return "Contact";
    }

    @GetMapping("/logout")
    public String logoutUser() {
        return "logout";
    }
    
    @GetMapping("/edit-user/{uid}")
    public String editUser(@PathVariable String uid, Model model) {
        User user = userService.getUserById(uid);
        model.addAttribute("user", user);
        return "EditUser";
    }

    @PostMapping("/update-user")
    public String updateUser(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/view-alluser-details";
    }

    @GetMapping("/delete-user/{uid}")
    public String deleteUser(@PathVariable String uid) {
        userService.deleteUser(uid);
        return "redirect:/view-alluser-details";
    }

}
