package com.example.FlightBookingAppFlights.Repository;

import com.example.FlightBookingAppFlights.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Integer> {
}
