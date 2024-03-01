package abstractEvent;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		 Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
	       
		 
		 int choice=scanner.nextInt();
			//scanner.nextLine();
			
			switch(choice)
			{
				case 1:
				scanner.nextLine();
				System.out.println("Enter the details in CSV format");
	            String ExEvent = scanner.nextLine();
	            String[] event = ExEvent.split(",");
	            
	            System.out.println("Exhibition Details");
	            
	}
	
}
}