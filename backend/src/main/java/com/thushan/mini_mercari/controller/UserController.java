package com.thushan.mini_mercari.controller;

import com.thushan.mini_mercari.dto.UserDTO;
import com.thushan.mini_mercari.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    private final  UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping
    public String SaveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

}
