package com.example.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.transaction.model.PassengerInfo;

public interface IPasanggerInfoRepository extends JpaRepository<PassengerInfo,Long>  {
    
}
