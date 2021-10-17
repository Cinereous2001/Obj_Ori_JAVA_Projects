
public class Circle extends Shape implements Area {

	//=================================================================Instance Properties
	private double radius;
	
	//=================================================================Constructors
	/**
	 * The workhorse constructor passes the parameter values to the instance variables
	 * @param radius The radius of the circle
	 * @param name The name of the circle
	 */
	public Circle(double radius, String name) {
		super(name);
		this.radius = radius;
	}
	
	//=================================================================Methods
	/**
	 * {@inheritDoc}
	 */
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Circle)) {
			return false;
		}
		Circle c = (Circle) o;
		return this.radius == c.radius
				&& this.getName().equals(c.getName());
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		String line = "Circle [Name: " + getName() + ", Radius: " + radius + "]";
		return line;
	}
	
	//=================================================Getters/Setters
	/**
	 * The radius is returned
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Sets the radius
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
