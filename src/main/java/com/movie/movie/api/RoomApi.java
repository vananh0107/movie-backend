package com.movie.movie.api;

import com.movie.movie.dto.RoomDTO;
import com.movie.movie.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/api/rooms")
public class RoomApi {
    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<RoomDTO> getRooms(@RequestParam Integer movieId, @RequestParam Integer branchId,
                                  @RequestParam String startDate, @RequestParam String startTime){
        return roomService.getRooms(movieId, branchId, startDate, startTime);
    }
}
