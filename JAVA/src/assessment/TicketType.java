package assessment;

import java.util.*;

public class TicketType {
	private String type;
	private Double costPerTicket;
	public TicketType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketType(String type, Double costPerTicket) {
		super();
		this.type = type;
		this.costPerTicket = costPerTicket;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerTicket(Double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}
	
}
