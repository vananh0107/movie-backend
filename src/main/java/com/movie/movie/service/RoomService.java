package com.movie.movie.service;

import com.movie.movie.dto.RoomDTO;

import java.util.List;
public interface RoomService {
    List<RoomDTO> getRooms(Integer movieId, Integer branchId, String startDate, String startTime);
}
