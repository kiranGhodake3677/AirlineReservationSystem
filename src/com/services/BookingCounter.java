package com.services;

import com.model.Booking;
import com.model.Flight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class BookingCounter implements Indigo {
    public Scanner scanner = new Scanner(System.in);
    Random random=new Random();

    public Booking bookFlight(Flight flight) {
       System.out.println("How many seats you want to book:=");
        int noOfseats = scanner.nextInt();
        float bookingAmt=noOfseats*flight.getTicketPrice();
        LocalDateTime bookingTime=LocalDateTime.now();
        int BookingId=random.nextInt(20);
        return new Booking(BookingId, bookingTime, noOfseats, flight, bookingAmt);
        
       
     
    }
	@Override
	public void getstatus(Booking b) throws IOException {
//		    System.out.println("...Booking Details..");
//	        System.out.println("Booking Id:="+b.getBookingId());
//	        System.out.println("Flight Details:=");
//	        System.out.println("Flight ID:="+b.getFlight());//.getId());
//	        System.out.println("From:="+b.getFlight().getFrom());
//	        System.out.println("To:="+b.getFlight().getTo());
//	        System.out.println("Flight deprature Time:="+b.getFlight());
//	        System.out.println("Booking Time:="+b.getBookingTime());
//	        System.out.println("BooKing Amount:="+b.getBookingAmt());
//	        
		
		File f2=new File ("C:\\Users\\kiran\\eclipse-workspace\\java ProjectIndigo\\print.txt");
		f2.createNewFile();
		
		FileWriter f3=new FileWriter(f2);
		f3.write("...Booking Details..");
		f3.write("\nBooking Id:="+b.getBookingId());
		f3.write("\nFlight Details:=");
		f3.write("\nFlight ID:="+b.getFlight());//.getId());
		f3.write("\nFrom:="+b.getFlight().getFrom());
		f3.write("\tTo:="+b.getFlight().getTo());
		f3.write("\nFlight deprature Time:="+b.getFlight());
		f3.write("\tBooking Time:="+b.getBookingTime());
		f3.write("\nBooKing Amount:="+b.getBookingAmt());
		f3.close();
		
		Scanner sc = new Scanner(f2);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
	       
	}
	
}
