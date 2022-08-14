package com.Assignment6Aug;
import java.util.Scanner;
public class TicketMain {
		public static void main(String[] args) {
		Ticket t=new Ticket();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of bookings");
		int booking=sc.nextInt();
		System.out.println("Enetr avaible tickets");
		int available=sc.nextInt();//25
		
		
		t.setAvailableTickets(available);
		
		for(int i=1;i<=booking;i++)
		{
			
			System.out.println("Enter ticket id");
			int id=sc.nextInt();
			t.setTicketid(id);
			System.out.println("Enter ticket price");
			int price=sc.nextInt();
			t.setPrice(price);
			System.out.println("Enter the tickets you want");
			int want=sc.nextInt();
			System.out.println("available tickets"+t.getAvailableTickets());
			
			int remaining=t.getAvailableTickets()-want;
			
			int total=t.calculateAmount(want);
			System.out.println("total amount is.."+total);
			
			
			
			t.setAvailableTickets(remaining);
			
			System.out.println(" available tickets are.."+remaining);
		}
}
}
