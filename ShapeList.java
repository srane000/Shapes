import java.util.TreeSet;

public class ShapeList extends TreeSet<Shape> {
	
	private TreeSet<Shape> setShapes = new TreeSet<>();

	public ShapeList(){
		this.setShapes = new TreeSet<>();
	}
	public boolean add(Shape z) {
		if (setShapes.contains(z)) {
			System.out.println("Duplicate Object");
		}	
	else {
		setShapes.add(z);
	}
	return true;
}
	
	
	public ShapeList get2DShapes(){
		TreeSet<Shape2D> temp = new TreeSet<Shape2D>();
		for (Shape x : setShapes) {
			if ( x instanceof Shape2D && x instanceof Shape3D == false) {
				temp.add((Shape2D) x);
			}
		}
		return temp;
	}
	
	public ShapeList get3DShapes(){
		TreeSet <Shape3D> temp = new TreeSet<Shape3D>();
		for (Shape y : setShapes) {
			if ( y instanceof Shape3D) {
				temp.add((Shape3D) y);
			}
		}
		return temp;
	}
	public void printFormatted () {
		String line =  "+--------+--------------+----------------+-----------------------------+---------------------------+";
		String var =  "| ID     |Name          | Color          |Dimentions                   | Description               | ";
		System.out.printf("%s%n%s%n%s%n", line,var,line);
		
		for (Shape x : setShapes) {
			System.out.printf("| %-6s |%-13s | %-15s|", x.getid(),x.getname(),x.getColorName());
			if (x instanceof Shape2D) {
					System.out.printf("$%-27s |",((Shape2D) x).getDimentions());
		}
			else {
				System.out.printf("%-26s |",((Shape3D) x).getDimentions());
			}
		    System.out.printf(" %-25s | %n%s%n", x.getdescription(), line) ;
		}
	}
	public int getSize() {
		return setShapes.size();
	}
		
	
}