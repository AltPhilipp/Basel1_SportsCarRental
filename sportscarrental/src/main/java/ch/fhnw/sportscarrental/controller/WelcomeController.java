package ch.fhnw.sportscarrental.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String getWelcomeString() {
        return "Welcome to the Sports Car Rental Service!";
    }
}
