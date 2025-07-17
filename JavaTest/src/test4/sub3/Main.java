package test4.sub3;

public class Main {
	
	public static void main(String[] args) {
		
		MovieTicket ticket = new MovieTicket("타이타닉", "19:00", "A1");
		
		ticket.printTicketInfo();
		
		ticket.bookTicket();
		
		ticket.printTicketInfo();
		
		ticket.bookTicket();
		
		ticket.cancelBook();
		
		ticket.printTicketInfo();
		
		ticket.cancelBook();
	}

}
