package com.springBoot.SpringBoot.resources;

import com.springBoot.SpringBoot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//mesma coisa de UserController
 @RestController
 @RequestMapping(value="/users")
public class UserResource {

     @GetMapping("/{id}")
     public ResponseEntity<User> findById(@PathVariable Long id){
         User user = new User(1L, "brunno", "brunno@gmail.com", "87991683795",
                 "brunno123");

         return ResponseEntity.ok().body(user);
     }
}
