package May26Shape;

public class Square extends Shape{
	int side;
	public Square(int side) {
		
		this.side=side;
		
	}


	
	
	
	void CalculateArea() {
	
	 
	 setArea(side*side);
		System.out.println(getArea());
	}

}
