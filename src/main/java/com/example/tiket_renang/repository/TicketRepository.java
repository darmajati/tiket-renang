package com.example.tiket_renang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tiket_renang.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{
    
}
