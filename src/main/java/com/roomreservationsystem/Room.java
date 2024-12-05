package com.roomreservationsystem;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int roomNumber;
    private String roomType;

    @Column(name = "is_available")
    private boolean isAvailable;
}