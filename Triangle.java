
public class Triangle extends Shape{

	private double height; 
	private double base;
	
	
	
	public Triangle(double height , double base) 
	{
		this.height = height;
		this.base = base;
		
	}//end of parameterized contructor: Total 2 Parameters
	
	
	
	public void setHeight(double height) {
		
		this.height = height;
	}//end of setter: Height
	
	public double getHeight() {
		return this.height;
	}//end of getter: Height
	
	
	public void setBase(double base) {
		this.base = base;
	}//end of setter: base
	
	public double getBase() {
		return this.base;
	}//end of getter: base
	
	@Override
	public double area() {
		
		
		return ((0.5)*this.base)*this.height;
	}//end of area
	
	@Override
	public String toString() {
		
		return "My triangle's Areas is "+area();
	}//end of toString
	
	
	
}
