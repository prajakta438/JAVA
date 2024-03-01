public class StageEvent extends Event{
	//write your code here
	public Integer  noOfStall;

	
	
	public Integer getNoOfStall() {
		return noOfStall;
	}



	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}



	public StageEvent(Integer noOfStall) {
		super();
		this.noOfStall = noOfStall;
	}
	
}
