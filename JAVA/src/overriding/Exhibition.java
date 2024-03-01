package overriding;

public class Exhibition extends Event {
	
	public Integer noOfStall;
	
	public Exhibition(String name, String detail, String ownerName,Integer noOfStall) {
		super(name, detail, ownerName);
		// TODO Auto-generated constructor stub
		this.noOfStall= noOfStall;
	}

	public Double ProjectedRevenue() {
		double revenue = noOfStall*10000;
		return revenue;
	}


	

}
