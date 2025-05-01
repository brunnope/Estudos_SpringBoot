package com.springBoot.SpringBoot.resources;

import com.springBoot.SpringBoot.entities.User;
import com.springBoot.SpringBoot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//mesma coisa de UserController
 @RestController
 @RequestMapping(value="/users")
public class UserResource {

     @Autowired
    private UserService userService;

    @GetMapping({"", "/"})
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }

     @GetMapping("/{id}")
     public ResponseEntity<User> findById(@PathVariable Long id){
         return ResponseEntity.ok().body(userService.findById(id));
     }
}
