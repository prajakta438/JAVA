package overriding;

public class Event {
	
	protected String name;
	protected String detail;
	protected String ownerName;
	public Event(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}
	
	public Double ProjectedRevenue() {
		return 0.0;
	}

}
