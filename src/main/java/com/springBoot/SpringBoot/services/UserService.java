package com.springBoot.SpringBoot.services;

import com.springBoot.SpringBoot.entities.User;
import com.springBoot.SpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User>findAll(){
        List<User> usuarios = userRepository.findAll();

        return usuarios.isEmpty() ? null : usuarios;

    }

    public User findById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User insert(User user){
        return userRepository.save(user);
    }
}
