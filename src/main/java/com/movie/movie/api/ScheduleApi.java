package com.movie.movie.api;
import com.movie.movie.dto.ScheduleDTO;
import com.movie.movie.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/schedule")
public class ScheduleApi {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/start-times")
    public List<String> getStartTimes(@RequestParam Integer movieId, @RequestParam Integer branchId,
                                      @RequestParam String startDate) {
        return scheduleService.getStartTimes(movieId,branchId, LocalDate.parse(startDate));
    }

    @GetMapping
    public List<ScheduleDTO> getSchedules(@RequestParam Integer movieId, @RequestParam Integer branchId,
                                          @RequestParam String startDate, @RequestParam String startTime,
                                          @RequestParam Integer roomId){
        return scheduleService.getSchedules(movieId,branchId,startDate,startTime,roomId);
    }
}
