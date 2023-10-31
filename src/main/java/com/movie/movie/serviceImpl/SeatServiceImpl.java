package com.movie.movie.serviceImpl;

import com.movie.movie.dto.SeatDTO;
import com.movie.movie.pojo.Room;
import com.movie.movie.pojo.Schedule;
import com.movie.movie.pojo.Seat;
import com.movie.movie.pojo.Ticket;
import com.movie.movie.repository.ScheduleRepository;
import com.movie.movie.repository.SeatRepository;
import com.movie.movie.repository.TicketRepository;
import com.movie.movie.service.SeatService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<SeatDTO> getSeatsByScheduleId(Integer scheduleId) {
        // Lấy ra các chỗ ngồi của phòng trong lịch đó
        Room room = scheduleRepository.findById(scheduleId).orElse(new Schedule()).getRoom();
        List<Seat> listSeat = seatRepository.getSeatByRoom_Id(room.getId());

        // Lấy ra các vé đã được đặt trong lịch đó rồi map sang các chỗ ngồi
        List<Seat> occupiedSeats = ticketRepository.findTicketsBySchedule_Id(scheduleId)
                .stream().map(Ticket::getSeat)
                .toList();

        // Map list chỗ ngồi của phòng ở bước 1 sang list dto
        return listSeat.stream().map(seat -> {
            SeatDTO seatDTO = modelMapper.map(seat,SeatDTO.class);
            if(occupiedSeats.stream()
                    .map(Seat::getId)
                    .toList().contains(seat.getId())){
                seatDTO.setIsOccupied(1); // Nếu ghế nào nằm trong list ghế đã được occupied thì set = 1
            }
            return seatDTO;
        }).toList();
    }
}
