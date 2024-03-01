package overriding;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the name of the event:");
		String name = sc.nextLine();
		
		System.out.println("Enter the detail of the event:");
		String detail = sc.nextLine();
		System.out.println("Enter the owner name of the event:");
		String owner = sc.nextLine();
		
		Event ev = new Event(name,detail,owner);
		
		System.out.println("Enter the type of the event:"+"\n1.Exhibition"+"\n2.StageEvent");
		int ch = sc.nextInt();
		if (ch==1) {
			System.out.println("Enter the number of stalls:");
			int stall = sc.nextInt();
			Exhibition e = new Exhibition(name,detail,owner,stall);
			System.out.println("The projected revenue of the event is "+e.ProjectedRevenue());
			
		}
		if (ch==2) {
			System.out.println("Enter the number of shows:");
			int shows = sc.nextInt();
			System.out.println("Enter the number of seats per show:");
			int seats = sc.nextInt();

			StageEvent s = new StageEvent(name,detail,owner,shows,seats);
			System.out.println("The projected revenue of the event is "+s.ProjectedRevenue());
		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
