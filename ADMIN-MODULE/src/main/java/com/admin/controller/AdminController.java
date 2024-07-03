package com.admin.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.admin.entity.User;
import com.admin.service.AdminService;
import com.admin.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @Autowired
    private UserService userService;

    @GetMapping("/fetch-all-buyers")
    public ResponseEntity<List<User>> fetchAllBuyers() {
        List<User> buyers = adminService.getAllBuyers().getUsers();
        return ResponseEntity.ok(buyers);
    }

    @GetMapping("/fetch-all-sellers")
    public ResponseEntity<List<User>> fetchAllSellers() {
        List<User> sellers = adminService.getAllSellers().getUsers();
        return ResponseEntity.ok(sellers);
    }

    @GetMapping("/fetch-active-buyers")
    public ResponseEntity<List<User>> fetchActiveBuyers() {
        List<User> activeBuyers = adminService.getActiveBuyers().getUsers();
        return ResponseEntity.ok(activeBuyers);
    }

    @GetMapping("/fetch-active-sellers")
    public ResponseEntity<List<User>> fetchActiveSellers() {
        List<User> activeSellers = adminService.getActiveSellers().getUsers();
        return ResponseEntity.ok(activeSellers);
    }

    @GetMapping("/total-products")
    public ResponseEntity<Integer> fetchTotalProducts() {
        int totalProducts = adminService.getTotalProducts();
        return ResponseEntity.ok(totalProducts);
    }

    @GetMapping("/total-orders")
    public ResponseEntity<Integer> fetchTotalOrders(@RequestParam String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        int totalOrders = adminService.getTotalOrders(localDate);
        return ResponseEntity.ok(totalOrders);
    }
}
