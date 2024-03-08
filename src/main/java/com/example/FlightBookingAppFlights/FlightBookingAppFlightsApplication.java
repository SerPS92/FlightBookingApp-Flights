package com.example.FlightBookingAppFlights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class FlightBookingAppFlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingAppFlightsApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
