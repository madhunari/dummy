package com.admin.service;

import com.admin.entity.User;

import java.util.Optional;

public interface UserService {
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(String emailId);
    Optional<User> getUserByEmailid(String emailId);
}
