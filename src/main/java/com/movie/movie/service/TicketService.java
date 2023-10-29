package com.movie.movie.service;

import com.movie.movie.dto.TicketDTO;

import java.util.List;

public interface TicketService {
    List<TicketDTO> getTicketsByUserId(Integer userId);
}
