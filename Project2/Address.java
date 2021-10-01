
public class Address {

	//==============================Instance Properties
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;

	//==============================Constructors
	/**
	 * The default constructor sets the default values of the instance variables
	 */
	public Address()
	{
		this(0, "", "", "OH", "");
	}

	/**
	 * The workhorse constructor sets the instance properties to given parameter values
	 * @param streetNumber The street number of the address
	 * @param streetName The name of the street of the address
	 * @param city The city within the address
	 * @param state The state within the address
	 * @param zipCode The zip code of the address given
	 */
	public Address(int streetNumber, String streetName, String city, String state, String zipCode)
	{
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode; 
	}
	
	/**
	 * The copy constructor
	 * @param address The instance of an address object to copy the reference
	 */
	public Address(Address address)
	{
		this(address.streetNumber, address.streetName, address.city, address.state,
				address.zipCode);
	}
	
	//=========================Methods
	/**
	 * {@InheritDoc}
	 */
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Address))
		{
			return false;
		}
		// same street number, street name, city, state, and ZIP code 
		Address a = (Address) o;
		if (this.streetNumber == a.getStreetNumber() && this.streetName.equals(a.getStreetName())
				&& this.city.equals(a.getCity()) && this.state.equals(a.getState()) 
				&& this.zipCode.equals(a.getZipCode()))
		{
			return true;
		}
		else
			return false;
	}
	
	/**
	 * {@InheritDoc}
	 */
	@Override
	public String toString()
	{
		String line = streetNumber + " " + streetName + ", " + city + ", " + state + ", " + zipCode; 
		return line;
	}

	//=============================================Getters/Setters
	/**
	 * The street number is returned
	 * @return the streetNumber 
	 */
	public int getStreetNumber() {
		return streetNumber;
	}

	/**
	 * It allows us to set the street number
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(int streetNumber) {
		if (streetNumber < 0)
		{
			throw new IllegalArgumentException("Street Number cannot be negative");
		}
		else
			this.streetNumber = streetNumber;
	}

	/**
	 * Returns the street name
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * It allows us to set the street name
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Returns the city
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * It allows us to set the city 
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the state
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * It allows us to set the state
	 * @param state the state to set
	 */
	public void setState(String state) {
		if (state.length() != 2)
		{
			throw new IllegalArgumentException("State must be two-letter abbreviation");
		}
		else
			this.state = state;
	}

	/**
	 * returns the zipCode
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * It allows us to set the zipCode
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		if (zipCode.length() != 5)
		{
			throw new IllegalArgumentException("ZIP code must be 5 digits");
		}
		else
			this.zipCode = zipCode;
	}
}
