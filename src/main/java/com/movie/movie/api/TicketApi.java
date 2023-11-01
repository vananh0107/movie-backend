package com.movie.movie.api;

import com.movie.movie.dto.TicketDTO;
import com.movie.movie.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/tickets")
public class TicketApi {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<TicketDTO> getTicketsByUserId(@RequestParam Integer userId){
        return ticketService.getTicketsByUserId(userId);
    }
}
