
public class Cube extends Square implements Volume{

	//=========================================================Constructors
	/**
	 * The workhorse constructor to pass parameter values to instance properties
	 * @param length The length of the cube
	 * @param name the name of te cube
	 */
	public Cube(double length, String name) {
		super(length, name);
	}
	
	//==========================================================Methods
	/**
	 * {@inheritDoc}
	 */
	public double getVolume() {
		return Math.pow(getLength(), 3.0);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		String line = "Cube [Name: " + getName() + ", Length: " + getLength() + "]";
		return line;
	}
}
