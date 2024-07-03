package com.admin.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.admin.dto.UserResponseDto;
import com.admin.service.AdminService;
import com.admin.service.OrderService;
import com.admin.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String index(Model model) {
        UserResponseDto buyersDto = adminService.getAllBuyers();
        model.addAttribute("buyers", buyersDto.getUsers());

        UserResponseDto sellersDto = adminService.getAllSellers();
        model.addAttribute("sellers", sellersDto.getUsers());

        model.addAttribute("totalProducts", productService.getTotalProducts());

        LocalDate today = LocalDate.now();
        model.addAttribute("totalOrders", orderService.getTotalOrders(today));

        return "index";
    }
}
