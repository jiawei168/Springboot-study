package org.example.configures.controller;

import jakarta.validation.Valid;
import org.example.configures.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String addUser(@Valid @RequestBody User user) {
      return "用户有效";
    }
}
