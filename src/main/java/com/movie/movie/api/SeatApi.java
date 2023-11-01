package com.movie.movie.api;

import com.movie.movie.dto.SeatDTO;
import com.movie.movie.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/seats")
public class SeatApi {
    @Autowired
    private SeatService seatService;

    @GetMapping
    public List<SeatDTO> getSeatsByScheduleId(@RequestParam Integer scheduleId){
        return seatService.getSeatsByScheduleId(scheduleId);
    }
}
