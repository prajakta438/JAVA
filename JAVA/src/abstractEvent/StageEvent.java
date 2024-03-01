package abstractEvent;

public class StageEvent extends Event{

	
	
	private Integer  noOfShows;
	private Double costPerShow;
	public StageEvent(String name, String detail, String type, String organiser,Integer  noOfShows,Double costPerShow) {
		super(name, detail, type, organiser);
		// TODO Auto-generated constructor stub
		this.noOfShows= noOfShows;
		this.costPerShow= costPerShow;
	}

	
	@Override
	Double calculateAmount() {
		// TODO Auto-generated method stub
		double amount = noOfShows*costPerShow;
		return amount;
	}

}
