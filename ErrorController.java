package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());
            if (statusCode == HttpServletResponse.SC_NOT_FOUND) {
                // Return a custom 404 page
                return "error-404";  // Assuming you have error-404.jsp or error-404.html
            }
        }
        return "error";  // Default error page
    }

    
    public String getErrorPath() {
        return "/error";
    }
}
