package com.movie.movie.service;

import com.movie.movie.dto.ScheduleDTO;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {
    List<String> getStartTimes(Integer movieId, Integer branchId, LocalDate startDate);
    List<ScheduleDTO> getSchedules(Integer movieId, Integer branchId, String startDate, String startTime,
                                   Integer roomId);
}
