package com.roomreservationsystem;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Optional<Room> findByRoomNumberAndRoomType(int roomNumber, String roomType);
}