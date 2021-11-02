package com.javatechie.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{



	Payment findByOrderId(int orderId);

}
