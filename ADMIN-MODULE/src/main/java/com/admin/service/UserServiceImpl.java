package com.admin.service;

import java.util.Optional;

import com.admin.Dao.UserDao;
import com.admin.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User addUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userDao.save(user);
	}

	@Override
	@Transactional
	public void deleteUser(String emailId) {
		userDao.deleteByEmailId(emailId);
	}

	@Override
	public Optional<User> getUserByEmailid(String emailId) {
		return Optional.ofNullable(userDao.findByEmailId(emailId));
	}
}
