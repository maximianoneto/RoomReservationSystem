package com.roomreservationsystem;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class RoomReservationControllerTest {

    @Mock
    private RoomService roomService;

    @InjectMocks
    private RoomReservationController roomReservationController;

    @Test
    public void checkRoomAvailabilityTest() {
        AvailabilityCheckDTO dto = new AvailabilityCheckDTO();
        dto.setCustomerName("John Doe");
        dto.setCheckInDate(LocalDate.of(2023, 12, 15));
        dto.setCheckOutDate(LocalDate.of(2023, 12, 20));
        dto.setRoomNumber(101);
        dto.setRoomType("Suite");

        when(roomService.checkRoomAvailability(dto)).thenReturn(true);

        String expectedResponse = roomReservationController.checkAvailability(dto);
        assert expectedResponse.equals("Room is available");

        verify(roomService).checkRoomAvailability(dto);
    }
}