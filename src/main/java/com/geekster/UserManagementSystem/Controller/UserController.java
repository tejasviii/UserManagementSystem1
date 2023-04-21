package com.example.usermanagementapp.Controller;

import com.example.usermanagementapp.Dao.UserRepository;
import com.example.usermanagementapp.Model.User;
import com.example.usermanagementapp.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("app/v1")
@RestController
public class UserController {

    @Autowired
    public  UserService service;

    @PostMapping("/add-user")
    public String addUser(@Valid @RequestBody User user){
        service.saveUser(user);
        return "user saved";
    }
    @GetMapping("find-all-user")
    public List<User> findAllUser(){
        return service.findAll();
    }
    @GetMapping("find-user-by-userId/{userId}")
    public User findUserById(@PathVariable Integer userId){
        return service.findUserById(userId);
    }
    @DeleteMapping("delete-user-by-userId/{userId}")
    public ResponseEntity<String> deleteUserById(@PathVariable Integer userId){
        service.deleteUserById(userId);
        return new ResponseEntity<>("user deleted", HttpStatus.OK);
    }
    @PutMapping("update-user-by-userId/{userId}")
    public ResponseEntity<String> updateUserById(@Valid @PathVariable Integer userId, @RequestBody User user){
        service.updateUserById(userId,user);
        return new ResponseEntity<>("user updated",HttpStatus.CREATED);
    }


}