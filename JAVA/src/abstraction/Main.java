package abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("List of Shapes:\r\n"
				+ "1.Circle\r\n"
				+ "2.Rectangle\r\n"
				+ "3.Square");
		
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the radius of the Circle:");
			
		     float radius = sc.nextFloat();
			Circle c = new Circle(radius);
			System.out.println("The perimeter is "+c.calculatePerimeter());
			break;
		case 2:
		System.out.println("Enter the length of the Rectangle:");
		
	     float len= sc.nextFloat();
	     System.out.println("Enter the breadth of the Rectangle:");
			
	     float br= sc.nextFloat();
	     Rectangle r = new Rectangle(len, br);
	     System.out.println("The perimeter is "+r.calculatePerimeter());
	     break;
	     
		case 3:
			System.out.println("Enter the side of the Square:");
			
		     float side = sc.nextFloat();
		     Square s = new Square(side);
		     System.out.println("The perimeter is "+s.calculatePerimeter());
			break;

	}
			
}

}
