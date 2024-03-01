package overrriding;

public class StageEvent extends Event {
	public Integer  noOfShows	;
	 public Integer noOfSeatsPerShow;
	public Integer getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}
	public Integer getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}
	public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public StageEvent(Integer noOfShows,Integer noOfSeatsPerShow,String name, String detail, String ownerName) {
		super(name, detail, ownerName);
		// TODO Auto-generated constructor stub
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public Double projectedRevenue() {
		double revenue = noOfShows*noOfSeatsPerShow*50;
		return revenue;

	}
	 
}
