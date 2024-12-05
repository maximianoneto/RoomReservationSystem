package com.roomreservationsystem;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AvailabilityCheckDTO {
    private String customerName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int roomNumber;
    private String roomType;
}