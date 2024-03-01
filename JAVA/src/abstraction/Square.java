package abstraction;

public class Square {
	Float side;
	public  Double calculatePerimeter()
	{
		return 2.0*side+side;
	}
	public Square(Float side) {
		this.side = side;
	}
	
	
}
