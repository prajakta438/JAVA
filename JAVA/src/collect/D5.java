package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		
		while(true) {
			
			System.out.println("enter email address");
		
			String email = sc.nextLine();
			al.add(email);
			
			System.out.println("do youwant to continue y/n");
			String ch = sc.next();
			if (ch.equalsIgnoreCase("n")) {
				break;
			}
		}
	}

}
