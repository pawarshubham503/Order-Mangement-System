package com.javatechie.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.os.api.common.TransactionRequest;
import com.javatechie.os.api.common.TransactionResponse;
import com.javatechie.os.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookorders")
	public TransactionResponse bookOrder (@RequestBody TransactionRequest request) {

		return service.saveorder(request);
	
		
		//do rest call to payment and pass the order id
		
	}
}