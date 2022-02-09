package com.devalgas.todo_spring_react.rest;

import com.devalgas.todo_spring_react.domain.User;
import com.devalgas.todo_spring_react.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author devalgas kamga on 07/02/2022. 19:35
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class UserResource {

    private final UserRepository userRepository;

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(this.userRepository.findAll());
    }

}
