package overrriding;

public class Exhibition  extends Event{
	public Integer noOfStall;

	public Integer getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}

	public Exhibition(Integer noOfStall,String name, String detail, String ownerName) {
		super(name, detail, ownerName);
		// TODO Auto-generated constructor stub
		this.noOfStall = noOfStall;
	}
	public Double projectedRevenue() {
		double revenue = noOfStall;
		return revenue;
	}
	

}
