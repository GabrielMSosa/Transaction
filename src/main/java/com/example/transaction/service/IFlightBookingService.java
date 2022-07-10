package com.example.transaction.service;

import com.example.transaction.dto.FlighBookingAcknolowedgment;
import com.example.transaction.dto.FlightBookingRequest;

public interface IFlightBookingService {

    public FlighBookingAcknolowedgment bookFlightTicket(FlightBookingRequest request);

    
}
