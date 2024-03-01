package assessment;

import java.util.*;

public class TicketBookingBO {
	public List<TicketBooking> searchTicketBooking(List<TicketBooking> ticketBookingList,String ticketType){
		//fill your code here
		List<TicketBooking> t = new ArrayList<>();
		for(TicketBooking tb:ticketBookingList  ) {
			if(tb.getTicketType().getType().equals(ticketType)) {
				t.add(tb);
			}
		
	     }
		  return t;
		 
	}
	
	public List<TicketBooking> searchTicketBooking(List<TicketBooking> ticketBookingList,Date showTime){
		List<TicketBooking> t = new ArrayList<>();
		for(TicketBooking tb:ticketBookingList  ) {
			if(tb.getTicketType().getType().equals(showTime)) {
				t.add(tb);
			}
		
	     }
		  return t;
		//fill your code here
	}
}
