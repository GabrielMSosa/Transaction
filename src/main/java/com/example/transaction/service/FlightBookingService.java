package com.example.transaction.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.transaction.dto.FlighBookingAcknolowedgment;
import com.example.transaction.dto.FlightBookingRequest;
import com.example.transaction.model.PassengerInfo;
import com.example.transaction.model.PaymentInfo;
import com.example.transaction.repository.IPasanggerInfoRepository;
import com.example.transaction.repository.IPaymentInfoRepository;
import com.example.transaction.utils.PaymentUtils;

@Service
public class FlightBookingService implements IFlightBookingService {
    @Autowired
    private IPasanggerInfoRepository repoPassenger;
    
    @Autowired
    private IPaymentInfoRepository repoPaymentInfo;



    @Override
    public FlighBookingAcknolowedgment bookFlightTicket(FlightBookingRequest request) {
        

        PassengerInfo passengerInfo=request.getPassengerInfo();
        repoPassenger.save(passengerInfo);

        PaymentInfo paymentInfo=request.getPaymentInfo();
        
        //validamos si tiene plata el cliente para el boleto de avion
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
        //si no le alcanza tira excepcion pero si pasa la validacion seguimos con lo siguiente
        paymentInfo.setPassangerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());//cargamos en la entidad el payment info el valor del fare que es la plata del cliente
        repoPaymentInfo.save(paymentInfo);
        return new FlighBookingAcknolowedgment("SUCCESS",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);


    }


    
}
