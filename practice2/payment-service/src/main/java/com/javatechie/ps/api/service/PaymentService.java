package com.javatechie.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository repository;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	public String paymentProcessing() {
		
		//api should be third party payment gateway(paypal paytm etc)
	return	new Random().nextBoolean()?"success":"false";
	}
	public Payment findPaymentHistoryByOrderID(int orderId) {
	return	repository.findByOrderId(orderId);
	}


}
