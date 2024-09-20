package com.app.sending_reports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SendingReportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendingReportsApplication.class, args);
	}

}
