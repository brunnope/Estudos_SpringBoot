package com.springBoot.SpringBoot.resources;

import com.springBoot.SpringBoot.entities.User;
import com.springBoot.SpringBoot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        user = userService.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }

     @DeleteMapping("/{id}")
     public ResponseEntity<Void> delete(@PathVariable Long id){
         userService.delete(id);
         return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
        user = userService.update(id, user);
        return ResponseEntity.ok().body(user);
    }


}
