import java.awt.*;

public abstract class Shape implements Comparable<Shape> {

    protected final Integer id;
    protected final String name;
    protected final String description;
    protected Color color;
    
	
	public Shape (int id,String name,String description,Color color){
		this.id = id;
		this.name = name;
		this.description = description;
		this.color =color;
	}
	// abtract methods
	public abstract double area();
	public abstract double perimeter();
	
	public String toString() {//checks color
		return id + " " + name + " " + description + " " + color;
		
	}

	//getters
	public int getid () {
		return id;
	}
	public String getname () {
		return name;
	}
	public String getdescription( ) {
		return description;
	}
	public String getColorName() {
		if (this.color.equals(Color.RED)) {
			return "Red";
		}
		else if (this.color.equals(Color.BLUE)) {
			return "Blue";
		}
		else if (this.color.equals(Color.GREEN)) {
			return "Green";
		}
		else if (this.color.equals(Color.BLACK)) {
			return "Black";
		}
		else if (this.color.equals(Color.WHITE)) {
			return "White";
		}
		else return "Uknown color";
			}
			
}