package abstraction;

public class Circle extends Shape{

	Float radius;
	public Double calculatePerimeter() {
		return 2.0*radius*3.14;
	}
	public Circle(Float radius) {
		this.radius = radius;
	}
	
	
}
