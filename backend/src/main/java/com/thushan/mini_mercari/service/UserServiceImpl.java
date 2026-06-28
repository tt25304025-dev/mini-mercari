package com.thushan.mini_mercari.service;

import com.thushan.mini_mercari.dto.UserDTO;
import com.thushan.mini_mercari.entity.User;
import com.thushan.mini_mercari.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public String saveUser(UserDTO userDTO){
        User user=new User();

        user.setFullName(userDTO.getFullName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setAddress(userDTO.getAddress());
        user.setRole("USER");
        user.setStatus("ACTIVE");

        userRepository.save(user);

        return "User Saved Successfully";
    }

}
