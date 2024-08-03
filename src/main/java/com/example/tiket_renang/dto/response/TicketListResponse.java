package com.example.tiket_renang.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketListResponse {
    private int ticketId;
    private String customerName;
    private int price;
}
