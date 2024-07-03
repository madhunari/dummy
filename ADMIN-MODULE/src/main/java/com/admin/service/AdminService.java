package com.admin.service;

import com.admin.dto.UserResponseDto;

import java.time.LocalDate;

public interface AdminService {
    UserResponseDto getAllBuyers();
    UserResponseDto getAllSellers();
    UserResponseDto getActiveBuyers();
    UserResponseDto getActiveSellers();
    int getTotalProducts();
    int getTotalOrders(LocalDate date);
}
