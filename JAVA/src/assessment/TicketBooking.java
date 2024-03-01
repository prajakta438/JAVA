package assessment;

import java.util.*;

public class TicketBooking {
	private String showName;
	private Integer noOfTickets;
	private Date showTime;
	private TicketType ticketType;
	public TicketBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketBooking(String showName, Integer noOfTickets, Date showTime, TicketType ticketType) {
		super();
		this.showName = showName;
		this.noOfTickets = noOfTickets;
		this.showTime = showTime;
		this.ticketType = ticketType;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Integer getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(Integer noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public Date getShowTime() {
		return showTime;
	}
	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}
	public TicketType getTicketType() {
		return ticketType;
	}
	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
	
}
