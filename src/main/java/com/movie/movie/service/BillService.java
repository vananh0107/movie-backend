package com.movie.movie.service;

import com.movie.movie.dto.BookingRequestsDTO;
import com.movie.movie.pojo.Bill;

import java.util.Optional;

public interface BillService {
    void createNewBill(BookingRequestsDTO bookingRequestDTO) throws RuntimeException;
}
