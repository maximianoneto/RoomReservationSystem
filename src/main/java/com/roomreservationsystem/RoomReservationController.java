package com.roomreservationsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rooms")
public class RoomReservationController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/check-availability")
    public String checkAvailability(@ModelAttribute AvailabilityCheckDTO availabilityCheckDTO, Model model) {
        boolean isAvailable = roomService.checkRoomAvailability(availabilityCheckDTO);
        model.addAttribute("isAvailable", isAvailable);
        model.addAttribute("availabilityCheckDTO", availabilityCheckDTO);
        return "index";
    }
}