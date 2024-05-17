package com.user;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.model.Booking;
import com.model.Flight;
import com.services.BookingCounter;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Flight flights1 = new Flight(101, "Pune", "Delhi", LocalDateTime.of(2024, 4, 15, 5, 30), 1000);
        Flight flights2 = new Flight(102, "Pune", "Lakshadweep", LocalDateTime.of(2024, 4, 17, 11, 6), 3000);
        Flight flights3 = new Flight(103, "Pune", "Kolhapur", LocalDateTime.of(2024, 4, 18, 10, 11), 1800);
        Flight flights4 = new Flight(104, "Pune", "Banglor", LocalDateTime.of(2024, 4, 18, 10, 11), 2400);
        Flight flights5 = new Flight(105, "Pune", "Dubai", LocalDateTime.of(2024, 4, 18, 10, 11), 4000);

        BookingCounter bookingCounter = new BookingCounter();

        System.out.println("....Welcome to Indigo....");

        System.out.println("....Here are some flight details------");
        System.out.println(flights1);
        System.out.println(flights2);
        System.out.println(flights3);
        System.out.println(flights4);
        System.out.println(flights5);

        System.out.println("Choose flight and enter booking id here:");
        int chosenFlightId = sc.nextInt();

        Flight selectedFlight = null;

        switch (chosenFlightId) {

            case 101:
                selectedFlight = flights1;
                break;

            case 102:
                selectedFlight = flights2;
                break;

            case 103:
                selectedFlight = flights3;
                break;

            case 104:
                selectedFlight = flights4;
                break;

            case 105:
                selectedFlight = flights5;
                break;

            default:
                System.out.println("Invalid id ");
        }

        if (selectedFlight != null) {
           
           Booking  booking=bookingCounter.bookFlight(selectedFlight);
            bookingCounter.getstatus(booking);

        }
    }
}
