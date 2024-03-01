package assessment;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of bookings");
        int n = Integer.parseInt(br.readLine());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println("Enter the booking details");
        
        //Get the booking details
        
        System.out.println("1.By ticket type\n2.By show time\nEnter your choice");
        Integer choice = Integer.parseInt(br.readLine());
        List<TicketBooking> searchList = new ArrayList<TicketBooking>();
        
        TicketBookingBO b = new TicketBookingBO();
        if(choice==1) {
            System.out.println("Enter ticket type");
        	String type = br.readLine();
        	//Invoke the appropriate method and store the return list in searchList
        	
        	b.searchTicketBooking(searchList,type);
        }else if(choice==2) {
        	System.out.println("Enter show time");
        	Date showTime = sdf.parse(br.readLine());
        	//Invoke the appropriate method and store the return list in searchList
        	b.searchTicketBooking(searchList,showTime);
        }else {
        	System.out.println("Invalid choice");
        }
        
        if(searchList.size()>0) {
            System.out.format("%-15s %-20s %-15s %-15s %s\n","Show Name","Show Time","No. of Tickets","Ticket Type","Total cost");
	        for(TicketBooking tb : searchList) {
	        	Double totalCost = tb.getNoOfTickets()*tb.getTicketType().getCostPerTicket();
	        	System.out.format("%-15s %-20s %-15d %-15s %.2f\n",tb.getShowName(),sdf.format(tb.getShowTime()),tb.getNoOfTickets(),tb.getTicketType().getType(),totalCost);
	        }
        }else {
        	System.out.println("Searched booking not found");
        }
    }
}


