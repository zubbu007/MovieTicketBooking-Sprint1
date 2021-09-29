package com.capg.omts.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class MmsBookingApplication {



	public static void main(String[] args) {
	SpringApplication.run(MmsBookingApplication.class, args);
	System.out.println("Server Started.........at : [8089]");

	}
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
