package ebox;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the User detail");
		String input = sc.nextLine();
		String [] userDeatils= input.split(",");
		
		System.out.println("Enter the contact detail");
		String input2 = sc.nextLine();
		String [] contactDetails = input2.split(",");
		
		
		ContactDetail d= new ContactDetail( contactDetails[0],contactDetails[1],contactDetails[2],contactDetails[3],contactDetails[4]);
		
		User u = new User(userDeatils[0],userDeatils[1],userDeatils[2],d);
		
		System.out.println(u.toString());
		
		
		
		
		

	}

}
