package com.example.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.transaction.model.PaymentInfo;

public interface IPaymentInfoRepository extends JpaRepository<PaymentInfo,String>{
    
}
