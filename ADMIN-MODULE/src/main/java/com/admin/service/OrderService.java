package com.admin.service;


import java.time.LocalDate;

import com.admin.Dao.OrderDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;
    public int getTotalOrders(LocalDate date) {
        return orderDao.countOrdersByDate(date);
    }
}
