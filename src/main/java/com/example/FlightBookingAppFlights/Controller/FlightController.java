package com.example.FlightBookingAppFlights.Controller;

import com.example.FlightBookingAppFlights.Model.Flight;
import com.example.FlightBookingAppFlights.Service.IFlightService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    private final IFlightService flightService;

    public FlightController(IFlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping(value = "flights", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Flight> getFlights(){
        return flightService.getFlights();
    }

    @GetMapping(value = "flights/{seats}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Flight> getAvailableFlights(@PathVariable(name = "seats") int seats){
        List<Flight> flights = flightService.getAvailableFlights(seats);
        return flights;
    }

    @PutMapping(value = "flights/{id}/{seats}")
    public void updateFlight(@PathVariable(name = "id") int id,
                             @PathVariable(name = "seats") int seats){
        flightService.updateSeats(id, seats);
    }

}
