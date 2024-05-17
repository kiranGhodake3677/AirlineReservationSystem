package com.model;

import java.time.LocalDateTime;

public class Booking {
    private int bookingId;
    private LocalDateTime bookingTime;
    private int noOfSeats;
    private Flight flight;
    private float bookingAmt;

    
    public Booking(int bookingId, LocalDateTime bookingTime, int noOfSeats, Flight flight, float bookingAmt) {
        this.bookingId = bookingId;
        this.bookingTime = bookingTime;
        this.noOfSeats = noOfSeats;
        this.flight = flight;
        this.bookingAmt = bookingAmt;
    }

   

	public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    
    public int getBookingId() {
        return bookingId;
    }

   

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
    
    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setBookingAmt(float bookingAmt) {
        this.bookingAmt = bookingAmt;
    }

    public float getBookingAmt() {
        return bookingAmt;
    }

   

    // display booking details
    @Override
    public String toString() {
        return "Booking id: " + bookingId + "\n" +
               "Flight details:\n" + flight + "\n" +
               "Booking time: " + bookingTime + "\n" +
               "Booking amount: " + bookingAmt;
    }
}
