
public class Customer {

	//=============================Instance Properties
	private static int id = 1000;
	private String name;
	private Address address;
	private String ssn;
	
	//=============================Constructors
	/**
	 * Default constructor sets the default values to instance properties
	 */
	public Customer()
	{
		this("", null, "");
	}
	
	/**
	 * Work horse constructor that sets the paramter values to instance properties
	 * @param name The name of the customer
	 * @param address The address of the customer
	 * @param ssn The SSN number of the customer
	 */
	public Customer(String name, Address address, String ssn)
	{
		this.name = name;
		this.address = address;
		this.ssn = ssn;
	}
	
	/**
	 * The copy constructor sets the reference of parameter object for another object
	 * @param customer The customer object that was created
	 */
	public Customer(Customer customer)
	{
		this(customer.name, customer.address, customer.ssn);
	}
	
	//=======================================Methods
	/**
	 * {@InheritDoc}
	 */
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Customer))
		{
			return false;
		}
		
		Customer c = (Customer) o;
		if (this.name.equals(c.getName()) && this.address == c.getAddress() 
				&& this.ssn.equals(c.getSsn()))
			return true;
		else
			return false;
	}
	
	/**
	 * {@InheritDoc}
	 */
	@Override
	public String toString()
	{
		String line = id + ", " + name + ", " + address + ", " + ssn;
		id++;
	    return line;
	}
	
	//====================================Getters/Setters
	/**
	 * Returns The id of the customer
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Returns the name of the customer
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the customer
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the address of the customer
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the address of the customer
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Returns the SSN number of the customer
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * Sets the SSN of the customer
	 * @param ssn the SSN to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
