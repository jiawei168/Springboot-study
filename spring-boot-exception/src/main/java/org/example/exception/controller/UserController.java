package org.example.exception.controller;

import jakarta.validation.Valid;
import org.example.exception.entity.User;
import org.example.exception.result.Result;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    @PostMapping("/user/add")
    public Result<?> addUser(@Valid @RequestBody User user, BindingResult bindingResult){if(bindingResult.hasErrors()){
        return Result.error(bindingResult.getAllErrors().get(0).getDefaultMessage());
    }
    return Result.ok(user);
    }
}
