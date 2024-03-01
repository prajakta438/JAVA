package overrriding;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the event:");

		String name=sc.nextLine();
		System.out.println("Enter the detail of the event:");
        String detail=sc.nextLine();
		System.out.println("Enter the owner name of the event:");
        String ownerName=sc.nextLine();
		
		Event e = new Event(name,detail,ownerName);
		
		System.out.println("Enter the type of the event:");
		System.out.println("1.Exhibition"+"\n2.StageEvent");
		
		int ch = sc.nextInt();
		if(ch==1) {
			System.out.println("Enter the number of stalls:");
			int noOfStall= sc.nextInt();
			Exhibition a = new Exhibition(noOfStall,name,detail,ownerName);
			
			System.out.println("The projected revenue of the event is "+a.projectedRevenue());
		}
		else if(ch==2) {
			System.out.println("Enter the number of shows:");
			int noOfShows= sc.nextInt();
			System.out.println("Enter the number of seats per show:");
			int noOfSeats= sc.nextInt();
			StageEvent s = new StageEvent(noOfShows,noOfSeats,name,detail,ownerName);
			
			System.out.println("The projected revenue of the event is "+s.projectedRevenue());
		}
		
		
		
		
	}

}
