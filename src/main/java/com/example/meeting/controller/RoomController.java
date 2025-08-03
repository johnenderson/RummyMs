package com.example.meeting.controller;

import com.example.meeting.dto.BookingDTO;
import com.example.meeting.dto.RoomDTO;
import com.example.meeting.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomDTO> listRooms() {
        return roomService.listRooms()
            .stream()
            .map(room -> new RoomDTO(room.getId(), room.getName()))
            .toList();
    }

    @GetMapping("/{id}/bookings")
    public List<BookingDTO> listBookings(@PathVariable("id") Long roomId) {
        return roomService.listBookings(roomId)
                .stream()
                .map(booking -> new BookingDTO(booking.getId(), booking.getRoom().getId(), booking.getStartTime(), booking.getEndTime()))
                .toList();
    }
}