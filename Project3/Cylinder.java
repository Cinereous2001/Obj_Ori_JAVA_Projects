
public class Cylinder extends Circle implements Volume{

	//=========================================================Instance Properties
	private double height;
	
	//===================================================================Constructors
	/**
	 * The workhorse constructor to pass parameter values to instance properties
	 * @param height The height of the cylinder
	 * @param radius radius of cylinder
	 * @param name the name of the cylinder
	 */
	public Cylinder(double height, double radius, String name) {
		super(radius, name);
		this.height = height;
	}
	
	//==============================================================Methods
	/**
	 * {@inheritDoc}
	 */
	public double getVolume() {
		return super.getArea() * height;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Cylinder)) {
			return false;
		}
		Cylinder c = (Cylinder) o;
		return super.equals(c)
				&& this.height == c.height;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		String line = "Cylinder [Name: " + getName() 
		+ ", Height: " + height + ", Radius: " + getRadius() + "]";
		return line;
	}

	//===================================================Getters/Setters
	/**
	 * The height of the cylinder is returned
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * The height of the cylinder is set
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
}
