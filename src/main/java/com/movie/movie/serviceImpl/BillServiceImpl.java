package com.movie.movie.serviceImpl;

import com.movie.movie.dto.BookingRequestsDTO;
import com.movie.movie.pojo.Bill;
import com.movie.movie.pojo.Schedule;
import com.movie.movie.pojo.Ticket;
import com.movie.movie.pojo.User;
import com.movie.movie.repository.BillRepository;
import com.movie.movie.repository.ScheduleRepository;
import com.movie.movie.repository.SeatRepository;
import com.movie.movie.repository.TicketRepository;
import com.movie.movie.security.UserRepository.UserRepository;
import com.movie.movie.service.BillService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private BillRepository billRepository;

    @Override
    @Transactional
    public void createNewBill(BookingRequestsDTO bookingRequestDTO) throws RuntimeException {

        //Lấy ra lịch
        Schedule schedule = scheduleRepository.findById(bookingRequestDTO.getScheduleId()).orElse(null);
        //Lấy ra người dùng
        User user = userRepository.findById(bookingRequestDTO.getUserId()).orElse(null);

        //Lưu Bill gồm thông tin người dùng xuống trước
        Bill billToCreate = new Bill();
        billToCreate.setUser(user);
        billToCreate.setCreatedTime(LocalDateTime.now());
        Bill createdBill = billRepository.save(billToCreate);

        //Với mỗi ghế ngồi check xem đã có ai đặt chưa, nếu rồi thì throw, roll back luôn còn ko
        //thì đóng gói các thông tin ghế và lịch vào vé và lưu xuống db
        bookingRequestDTO.getListSeatIds().forEach(seatId->{
            if(!ticketRepository.findTicketsBySchedule_IdAndSeat_Id(schedule.getId(),seatId)
                    .isEmpty()){// Nếu đã có người đặt vé ghế đó ở lịch cụ thể đó thì
                throw new RuntimeException("Đã có người nhanh tay hơn đặt ghế, mời bạn chọn lại!");
            }
            // đóng gói lịch, seat và bill vào từng vé rồi add vào list vé
            Ticket ticket = new Ticket();
            ticket.setSchedule(schedule);
            ticket.setSeat(seatRepository.getById(seatId));
            ticket.setBill(createdBill);
            ticket.setQrImageURL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fsupport.thinkific.com%2Fhc%2Fen-us%2Farticles%2F360030357274-Generate-a-QR-Code-for-Your-Sign-In-URL&psig=AOvVaw3BTtxcPvTI1lpEXzkPGpjf&ust=1698635141007000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKiIjpOjmoIDFQAAAAAdAAAAABAE");
            ticketRepository.save(ticket);
        });

    }
}
