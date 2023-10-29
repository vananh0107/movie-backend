package com.movie.movie.service;

import com.movie.movie.dto.BookingRequestsDTO;

public interface BillService {
    void createNewBill(BookingRequestsDTO bookingRequestDTO) throws RuntimeException;
}
