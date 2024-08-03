package com.example.tiket_renang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tiket_renang.dto.request.AddOrEditTicketRequestDto;
import com.example.tiket_renang.dto.response.MessageResponse;
import com.example.tiket_renang.dto.response.TicketDetailResponseDto;
import com.example.tiket_renang.dto.response.TicketListResponseDto;
import com.example.tiket_renang.service.TicketService;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {
    
    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public ResponseEntity<TicketListResponseDto> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @GetMapping("/tickets/{ticketId}")
    public ResponseEntity<TicketDetailResponseDto> getTicketById(@PathVariable int ticketId ){
        return ticketService.getTicketDetail(ticketId);
    }

    @PostMapping("/tickets")
    public ResponseEntity<MessageResponse> addTicket(@RequestBody AddOrEditTicketRequestDto addOrEditTicketRequestDto){
        return ticketService.addTicket(addOrEditTicketRequestDto);
    }

    @PutMapping("/tickets/{ticketId}")
    public ResponseEntity<MessageResponse> editTicket(@RequestBody AddOrEditTicketRequestDto addOrEditTicketRequestDto, @PathVariable int ticketId){
        return ticketService.editTicket(addOrEditTicketRequestDto, ticketId);
    }

    @DeleteMapping("/tickets/{ticketId}/delete")
    public ResponseEntity<MessageResponse> deleteTicket(@PathVariable int ticketId){
        return ticketService.deleteTicket(ticketId);
    }
}
