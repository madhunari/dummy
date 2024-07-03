package com.admin.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

import com.admin.entity.Order;

public interface OrderDao extends JpaRepository<Order, Long> {
    @Query("SELECT COUNT(o) FROM Order o WHERE o.date = :date")
    int countOrdersByDate(@Param("date") LocalDate date);
}
