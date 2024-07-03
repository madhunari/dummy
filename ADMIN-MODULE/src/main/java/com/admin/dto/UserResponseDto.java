package com.admin.dto;

import com.admin.entity.User;

import java.util.List;

public class UserResponseDto {
    private List<User> users;

    public UserResponseDto(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
