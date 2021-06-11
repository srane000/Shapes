import java.awt.*;

public abstract class Shape2D extends Shape {

    public final double height;
    public final double width;
    
	Shape2D(int id, String name, String description, Color color, double height,double width ) {
		super(id, name, description, color);
		this.height = height;
		this.width = width;
	}
	public abstract double area();
	public abstract double perimeter();
	
	public String toString() {
		return this.getid() + " " + this.getname()+ " " + this.getdescription() + " " + this.getColorName() + " " + height + " " + width; // check color

	} 
	
	public String getDimentions() {
		return height + ":" + width;
	}
	@Override
	public int compareTo(Shape x) {
	if( x instanceof Shape2D == false) {
		return -1;
	}
			if (this.getname() == x.getname() && this.getDimentions()== ((Shape2D) x).getDimentions()) {
			return 0;
			}
		else {
			return -1;
		}
	}
	
}