package com.example.FlightBookingAppFlights.Service;

import com.example.FlightBookingAppFlights.Model.Flight;

import java.util.List;

public interface IFlightService {

    public List<Flight> getFlights();
    public Flight getFlight(int id);
    public void updateFlight(Flight flight);
    List<Flight> getAvailableFlights(int seats);
    void updateSeats(int id, int seats);
}
