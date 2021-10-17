
public class Glome extends Sphere implements Volume {

	//=============================================================Constructors
	/**
	 * The workhorse constructor to pass parameter values to instance properties
	 * @param radius The radius of the glome
	 * @param name The name of the glome
	 */
	public Glome(double radius, String name) {
		super(radius, name);
	}
	
	//======================================================================Methods
	/**
	 * {@inheritDoc}
	 */
	public double getVolume() {
		return 0.5 * Math.pow(Math.PI, 2.0) * Math.pow(getRadius(), 4.0);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		String line = "Glome [Name: " + getName() + ", Radius: " + getRadius() + "]";
		return line;
	}
}
