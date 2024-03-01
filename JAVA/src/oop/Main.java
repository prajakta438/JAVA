package oop;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student name:");
		String name = sc.nextLine();
		System.out.println("Enter the register number:");
		Integer rno = sc.nextInt();
		System.out.println("Enter the course id:");
		Integer cid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the course name:");
		String course = sc.nextLine();
		
		Student s = new Student(name, rno);
		Course c = new Course(cid, course);
		
		s.display(c);
		
		sc.close();
	}
}