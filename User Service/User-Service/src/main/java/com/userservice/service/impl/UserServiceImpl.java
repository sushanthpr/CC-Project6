package com.userservice.service.impl;

import com.userservice.entities.User;
import com.userservice.repositories.UserRepository;
import com.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User create(User user) {
        String userId = UUID.randomUUID().toString();
        user.setId(userId);


        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(String userId) {
        Optional<User> optionaluser = userRepository.findById(userId);
        return optionaluser.get();
    }


    @Override
    public void deleteUser(String Id) {
        userRepository.deleteById(Id);
    }

}
