
public class Sphere extends Circle implements Volume {

	public Sphere(double radius, String name) {
		super(radius, name);
	}
	
	public double getVolume() {
		return 4.0 / 3 * getArea() * getRadius();
	}
	
	
	@Override
	public String toString() {
		String line = "Sphere [Name: " + getName() + ", Radius: " + getRadius() + "]";
		return line;
	}
	
}
