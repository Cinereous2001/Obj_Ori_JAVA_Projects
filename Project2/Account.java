
public class Account {

	//==================================Instance Properties
	private static int id = 1000;
	private Customer customer;
	private double balance;
	
	//============================================Constructors
	/**
	 * The default constructor sets the account and holder details
	 * @param customer The customer who holds the account
	 */
	public Account(Customer customer)
	{
		this(null, 0);
	}
	
	/**
	 * The workhorse constructor to pass parameter values to instance properties
	 * @param customer The customer who holds the bank account
	 * @param balance The amount of money in the account
	 */
	public Account(Customer customer, double balance)
	{
		this.customer = customer;
		this.balance = balance;
	}
	
	//=========================================Methods
	/**
	 * The method adds the current amount deposited to balance
	 * @param amount the amount we are depositing
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	/**
	 * The method withdraws or lets us know if it fails
	 * @param amount the amount we are depositing
	 * @return true or false depending on whether withdrawal was complete or not
	 */
	public boolean withdraw(double amount)
	{
		if (balance >= amount)
		{
			balance = balance - amount;
			return true;
		}
		else 
			return false;
	}
	
	/**
	 * {@InheritDoc}
	 */
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Account))
		{
			return false;
		}
		Account acc = (Account) o;
	    if (this.customer == acc.getCustomer() && this.balance == acc.getBalance())
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
		String line = id + ", " + customer + ", " + balance;
		id += 10;
		return line;
	}

	//========================================Getters/Setters
	
	/**
	 * Returns the id of the customer
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Returns the customer details
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer details
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Returns the amount of money in account
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets the amount of money in account
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
