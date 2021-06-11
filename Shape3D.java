import java.awt.*;

public abstract class Shape3D extends Shape2D {
    
    public final double length;
	
	public Shape3D(int id, String name, String description, Color color, double height,double width, double length){
		super(id, name, description, color, height, width);
		this.length = length;
	}
	
	@Override
	public String getDimentions() {
		return height + ":" + width+":"+ length;
	}
	@Override
	public int compareTo(Shape y) {
		if ( y instanceof Shape3D == false) {
			return -1;
		}
		Shape3D z = (Shape3D) y;
		if(this.getname().equals(z.getname()) && this.height == z.height && this.width == z.width && this.length == z.length){
			return 0;
			}
		else 
			return -1;
	}
	
}
