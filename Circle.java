
import java.lang.Math.*;
public class Circle extends Shape{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}//end of Parameterized constructor: Total 1 parameter
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}//end of setter:  radius
	
	public double getRadius() {
		return this.radius;
	}
	
	
	
	@Override
	public String toString() {
	
		return "My circle's Areas is "+area();
	}

	@Override
	public double area() {
		
		return Math.PI*this.radius*this.radius;
	}
	

}
