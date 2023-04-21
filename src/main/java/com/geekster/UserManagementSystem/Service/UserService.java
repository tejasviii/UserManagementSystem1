package com.example.usermanagementapp.Service;

import com.example.usermanagementapp.Dao.UserRepository;

import com.example.usermanagementapp.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserService {
    @Autowired
    public UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findUserById(Integer userId) {
        return repository.findById((userId)).get();
    }

    public User deleteUserById(Integer userId) {

        repository.deleteById(userId);
        return null;
    }

    public void updateUserById(Integer userId,User newUser) {
        User user=findUserById(userId);
        user.setUserName(newUser.getUserName());
        user.setDate(newUser.getDate());
        user.setTime(newUser.getTime());
        user.setEmail(newUser.getEmail());
        user.setPhoneNumber(newUser.getPhoneNumber());
        user.setDateOfBirth(newUser.getDateOfBirth());
        repository.save(user);
    }
}
