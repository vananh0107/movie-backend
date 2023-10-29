package com.movie.movie.dto;

import lombok.Data;

import java.util.List;
@Data
public class BookingRequestsDTO {
    private Integer userId;
    private Integer scheduleId;
    private List<Integer> listSeatIds;
}
