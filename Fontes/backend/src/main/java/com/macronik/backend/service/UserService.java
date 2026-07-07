package com.macronik.backend.service;

import com.macronik.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void mapearUsuario(){
        List<UserRepository> user;
    }
}
