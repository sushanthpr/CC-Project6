package com.userservice.service;

import com.userservice.entities.User;

import java.util.List;

public interface UserService {


    User create(User user);

    //get all
    List<User> getAll();

    //get single
    User get(String id);



    void deleteUser(String id);


}