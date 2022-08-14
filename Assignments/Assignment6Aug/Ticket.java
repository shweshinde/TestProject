package com.Assignment6Aug;

public class Ticket {

		private int ticketid;
	private	int price;
	private	static int availableTickets;//25


	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}                                        //25
	public static void setAvailableTickets(int  availableTickets)
	{
		Ticket.availableTickets=availableTickets;//25
	}

	public int getAvailableTickets()
	{
		return Ticket.availableTickets;

	}


	 int calculateAmount(int no_of_tickets)
	{
		int amount=price*no_of_tickets;
		
		if(no_of_tickets>getAvailableTickets())
		{
			System.out.println("available tickets"+getAvailableTickets());
			System.out.println("your tickets are exceding available tickets so amount cannot be calculated");
			return -1;
		}
		else
			return amount;
	}
}
