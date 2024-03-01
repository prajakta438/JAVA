package abstractEvent;

public class Exhibition extends Event{



	private Integer  noOfStalls;
	private Double rentPerStall;
	
	
	public Exhibition(String name, String detail, String type, String organiser,Integer  noOfStalls,Double rentPerStall) {
		super(name, detail, type, organiser);
		// TODO Auto-generated constructor stub
		this.noOfStalls= noOfStalls;
		this.rentPerStall = rentPerStall;
	}
	
	
	@Override
	Double calculateAmount() {
		// TODO Auto-generated method stub
		double amount = noOfStalls*rentPerStall;
		return amount;
	}

}
