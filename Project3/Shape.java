
public abstract class Shape {

	protected String name;
	
	/**
	 * The name of the shape
	 * @param name The shape's name
	 */
	public Shape(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public abstract String getName();
	
}
