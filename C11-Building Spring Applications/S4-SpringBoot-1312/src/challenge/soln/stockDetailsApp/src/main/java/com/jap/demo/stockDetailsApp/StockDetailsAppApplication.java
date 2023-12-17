package com.jap.demo.stockDetailsApp;

import com.jap.demo.stockDetailsApp.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StockDetailsAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StockDetailsAppApplication.class);

		MessageService msgSvc = context.getBean(MessageService.class);

		System.out.println(msgSvc.testMessage());

	}

}
