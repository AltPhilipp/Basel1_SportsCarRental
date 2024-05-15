package ch.fhnw.sportscarrental.controller;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String getWelcomeString() {
        return "Welcome to the Sports Car Rental Service!";
    }

    @GetMapping(value="/user")
    public String getUserRole(org.springframework.security.core.Authentication auth) {
        UserDetails userDetails = (UserDetails) auth.getPrincipal();
        String role = userDetails.getAuthorities().toArray()[1].toString();
        return role;
    }
}
