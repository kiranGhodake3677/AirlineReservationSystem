
package com.model;

import java.time.LocalDateTime;

public class Flight {
    private int id;
    private String from;
    private String to;
    private LocalDateTime dt;
    private float ticketPrice;

    
    public Flight(int id, String from, String to, LocalDateTime dt, float ticketPrice) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.dt = dt;
        this.ticketPrice = ticketPrice;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

   
    public void setFrom(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from;
    }


    public void setTo(String to) {
        this.to = to;
    }

    public String getTo() {
        return to;
    }
    
    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

   

    
    @Override
    public String toString() {
        return "Flight [id-" + id + ", from-" + from + ", to-" + to + ", dt-" + dt +
               ", ticketPrice-" + ticketPrice + "]";
    }
}
