package edu.coldrain.iris.controller.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class UserController {

    @GetMapping("/login")
    public String loginForm() {
        log.info("UserController.loginForm()");

        return "home/user/login";
    }

    @PostMapping("/login")
    public String login() {
        log.info("UserController.login()");

        return "redirect:/home/user/login";
    }

    @GetMapping("/register")
    public String registerForm() {
        log.info("UserController.registerForm()");

        return "home/user/register";
    }

    @PostMapping("/register")
    public String register() {
        log.info("UserController.register()");

        return "redirect:/home/user/login";
    }
}