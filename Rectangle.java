
public class Rectangle extends Shape {

	private double sideA; 
	private double sideB;
	
	public Rectangle(double sideA, double sideB) {
		
		this.sideA = sideA;
		this.sideB = sideB;
	}//end of Paramterized Constructor: Total 2 Parameters
	
	public void setSideA(double sideA)
	{
		this.sideA=sideA;
		
	}//end of setter: sideA
	
	public double getSideA()
	{
		return this.sideA;
	}//end of Getter: sideA
		
	
	public void setSideB(double sideB)
	{
		this.sideB=sideB;
		
	}//end of setter: sideB
	
	public double getSideB()
	{
		return this.sideB;
	}//end of Getter: sideB
	
	
	@Override
	public String toString() {

		return "My rectangle's Areas is "+area();
	}//end of tostring method

	@Override
	public double area() {

		return this.sideA*this.sideB;
	}//end of area method
	

}//end of class
