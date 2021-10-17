import java.util.ArrayList;

public class Project3Driver {

	public static void main(String[] args) {
		
		//Polymorphism used to condense the code
		ArrayList <Shape> shapes = new ArrayList <Shape>();
		shapes.add(new Circle(3.0, "Circle1"));
		shapes.add(new Square(4.0, "Square4"));
		shapes.add(new Cylinder(3.0, 4.0, "Cylinder4"));
		shapes.add(new Sphere(3.0, "Sphere3"));
		shapes.add(new Cube(6.0, "Cube2"));
		shapes.add(new Glome(2.0, "Glome2"));
		
		//Loops through array to see if toString is working or not
		for (Shape diffShapes: shapes) {
			System.out.println(diffShapes.toString());
		}
		
		//Loops through array to see if getArea and getVolume are working or not
		for (int i = 0; i < 2; i++) {
			Area diffShapes = (Area)(shapes.get(i));
			System.out.printf("%.2f\n", diffShapes.getArea());
		}
		for (int i =2; i < shapes.size(); i++) {
			Volume diffShapes = (Volume)(shapes.get(i));
			System.out.printf("%.2f\n", diffShapes.getVolume());
		}
		
		//************Have not tested getName()****************************
		//Validation checks???
		
		
		shapes.add(new Circle(3.0, "Circle1"));
		shapes.add(new Square(4.0, "Square4"));
		shapes.add(new Cylinder(3.0, 4.0, "Cylinder4"));
		
		//Testing to see if equals method works or not 
		for (int i = 0; i < 3; i++) {
			
			if (shapes.get(i).equals(shapes.get(6 + i))) {
				System.out.println("The shapes are equal");
			}
		}
		
	}

}
