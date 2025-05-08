package com.springBoot.SpringBoot.services;

import com.springBoot.SpringBoot.entities.User;
import com.springBoot.SpringBoot.repositories.UserRepository;
import com.springBoot.SpringBoot.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User>findAll(){
        List<User> usuarios = userRepository.findAll();

        return usuarios.isEmpty() ? null : usuarios;

    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    public User update(Long id, User user){
        User userUpdate = userRepository.getReferenceById(id);
        updateData(userUpdate, user);
        return userRepository.save(userUpdate);
    }

    private void updateData(User userUpdate, User user) {
        userUpdate.setName(user.getName());
        userUpdate.setEmail(user.getEmail());
        userUpdate.setPhone(user.getPhone());
    }
}
