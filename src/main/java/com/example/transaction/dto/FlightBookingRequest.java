package com.example.transaction.dto;

import com.example.transaction.model.PassengerInfo;
import com.example.transaction.model.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    //resera de vuelo
    //creamos los atributos las dos clases
    //que seria passangerinfo y paymentinfo

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;

}
