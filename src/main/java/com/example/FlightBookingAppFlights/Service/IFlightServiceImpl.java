package com.example.FlightBookingAppFlights.Service;

import com.example.FlightBookingAppFlights.Model.Flight;
import com.example.FlightBookingAppFlights.Repository.IFlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IFlightServiceImpl implements IFlightService {

    private final IFlightRepository flightRepository;

    public IFlightServiceImpl(IFlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlight(int id) {
        return flightRepository.findById(id).orElse(null);
    }

    @Override
    public void updateFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAvailableFlights(int seats) {
        List<Flight> flights = flightRepository.findAll();
        return flights.stream().filter(t -> t.getSeats() >= seats).collect(Collectors.toList());
    }

    @Override
    public void updateSeats(int id, int seats) {
        Flight flight = flightRepository.findById(id).orElse(null);
        if (flight != null) {
            flight.setSeats(flight.getSeats() - seats);
            flightRepository.save(flight);
        }
    }
}
