package com.example.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.transaction.dto.FlighBookingAcknolowedgment;
import com.example.transaction.dto.FlightBookingRequest;
import com.example.transaction.service.FlightBookingService;

@RestController
public class controller {
     
    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookflighticket")
    public FlighBookingAcknolowedgment bookFlightTicket( @RequestBody FlightBookingRequest request){

        return  service.bookFlightTicket(request);


    }



    



}
