package May26Shape;

public class Driver {
	
	public static void main(String[] args) {
		
		Circle c=new Circle(3);
		Square s=new Square(6);
		
		s.CalculateArea();
		
		c.CalculateArea();
		
		System.out.println(s.getArea());
		
		
	}

}
