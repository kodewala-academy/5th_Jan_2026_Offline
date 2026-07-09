package com.irctc.booking.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.booking.payment.entity.PaymentEntity;

public interface PaymentRepo extends JpaRepository<PaymentEntity, Long>
{

}
