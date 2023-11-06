package com.movie.movie.dto;

import com.movie.movie.pojo.User;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class BillDTO {
    private int id;
    private String createdTime;
    private List<TicketDTO> listTickets;
    private User user;
}
