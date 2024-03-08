package com.example.FlightBookingAppFlights.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "flights")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String company;
    private String date;
    private double price;
    private int seats;
}
