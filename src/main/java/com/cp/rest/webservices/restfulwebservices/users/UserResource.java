package com.cp.rest.webservices.restfulwebservices.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserJpaRepository userRepository;

    @GetMapping("/users/search/surname/{surname}")
    public List<User> getUsersBySurname(@PathVariable String surname) {
        return userRepository.findBySurname(surname);
    }
    @GetMapping("/users/search/firstname/{firstname}")
    public List<User> getUsersByFirstName(@PathVariable String firstname) {
        return userRepository.findByFirstname(firstname);
    }
    @GetMapping("/users/search/emailaddress/{emailaddress}")
    public List<User> getUsersByEmailAddress(@PathVariable String emailaddress) {
        return userRepository.findByEmailaddress(emailaddress);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

    //POST /users/{username}/todos

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody User user) {

        User createdUser = userRepository.save(user);
        //create Location of the resource append id
        //Get current resourceurl
        //{id}
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdUser.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }
}
