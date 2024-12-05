package com.roomreservationsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public boolean checkRoomAvailability(AvailabilityCheckDTO availabilityCheckDTO) {
        Optional<Room> roomOptional = roomRepository.findByRoomNumberAndRoomType(
                availabilityCheckDTO.getRoomNumber(), availabilityCheckDTO.getRoomType());

        return roomOptional.map(Room::isAvailable).orElse(false);
    }
}