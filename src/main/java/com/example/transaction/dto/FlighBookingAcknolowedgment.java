package com.example.transaction.dto;

import com.example.transaction.model.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlighBookingAcknolowedgment {

    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;

    
}
