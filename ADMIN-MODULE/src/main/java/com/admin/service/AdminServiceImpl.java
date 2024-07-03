package com.admin.service;

import com.admin.Dao.OrderDao;
import com.admin.Dao.UserDao;
import com.admin.dto.UserResponseDto;
import com.admin.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service("adminServiceImpl")
public class AdminServiceImpl implements AdminService {

    private final UserDao userDao;
    private final OrderDao orderDao;

    @Autowired
    public AdminServiceImpl(UserDao userDao, OrderDao orderDao) {
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    @Override
    public UserResponseDto getAllBuyers() {
        List<User> buyers = userDao.findByRole("buyer");
        return new UserResponseDto(buyers);
    }

    @Override
    public UserResponseDto getAllSellers() {
        List<User> sellers = userDao.findByRole("seller");
        return new UserResponseDto(sellers);
    }

    @Override
    public UserResponseDto getActiveBuyers() {
        List<User> activeBuyers = userDao.findByRoleAndStatus("buyer", "active");
        return new UserResponseDto(activeBuyers);
    }

    @Override
    public UserResponseDto getActiveSellers() {
        List<User> activeSellers = userDao.findByRoleAndStatus("seller", "active");
        return new UserResponseDto(activeSellers);
    }

    @Override
    public int getTotalProducts() {
        // Implement logic to fetch total products from productDao
        // For example:
        // return productDao.countAllProducts();
        return 0; // Placeholder, replace with actual logic
    }

    @Override
    public int getTotalOrders(LocalDate date) {
        return orderDao.countOrdersByDate(date);
    }
}
