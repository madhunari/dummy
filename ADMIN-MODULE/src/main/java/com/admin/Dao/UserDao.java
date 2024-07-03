package com.admin.Dao;

import java.util.List;

import com.admin.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailId(String emailId);
    void deleteByEmailId(String emailId);
    List<User> findByRoleAndStatus(String role, String status);
    List<User> findByRole(String role);
}
