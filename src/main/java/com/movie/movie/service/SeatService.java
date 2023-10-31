package com.movie.movie.service;

import com.movie.movie.dto.SeatDTO;

import java.util.List;
public interface SeatService {
    List<SeatDTO> getSeatsByScheduleId(Integer scheduleId);
}
