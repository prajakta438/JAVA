package abstraction;

public class Rectangle extends Shape{
	Float length;
	Float breadth;
	public  Double calculatePerimeter()
	{
		return 2.0*length+breadth;
	}
	public Rectangle(Float length, Float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}
