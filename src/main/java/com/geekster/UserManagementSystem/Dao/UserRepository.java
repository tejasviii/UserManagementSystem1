package com.example.usermanagementapp.Dao;

import com.example.usermanagementapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserRepository extends JpaRepository<User,Integer> {
//    public  User findUserById(@PathVariable Integer id);
//    public  User deleteUserById(@PathVariable Integer id);
}