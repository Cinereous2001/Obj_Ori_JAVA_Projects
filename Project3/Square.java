
public class Square extends Shape implements Area {
	
	//=========================================================Instance Properties
	private double length;
	
	//=========================================================Constructors
	/**
	 * The workhorse constructor to pass parameter values to instance properties
	 * @param length The length of the square
	 * @param name The name of the square
	 */
	public Square(double length, String name) {
		
		super(name);
		this.length = length;
	}

	//=======================================================Methods
	/**
	 * {@inheritDoc}
	 */
	public double getArea() {
		return Math.pow(length, 2.0);
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
		if (!(o instanceof Square)) {
			return false;
		}
		Square s = (Square) o;
		return this.length == s.length
				&& this.getName().equals(s.getName());
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		String line = "Square [Name: " + getName() + ", Length: " + length + "]";
		return line;
	}
	
	//==============================================================Getters/Setters

	/**
	 * Returns the length
	 * @return the length of the shape
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Method to set length
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

}
