package overriding;

public class StageEvent extends Event {
		 public Integer noOfShows;
		public Integer noOfSeatsPerShow;
		
		
		public StageEvent(String name, String detail, String ownerName,Integer noOfShows, Integer noOfSeatsPerShow) {
			super(name, detail, ownerName);
			// TODO Auto-generated constructor stub
			this.noOfShows = noOfShows;
			this.noOfSeatsPerShow = noOfSeatsPerShow;
		}


		public Double ProjectedRevenue() {
			double revenue= noOfShows*noOfSeatsPerShow*50;
			return revenue;
		}

}
