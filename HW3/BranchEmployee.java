import java.util.NoSuchElementException;
/**
 * This class is the branch employee class. 
 * @author seyma
 *
 */
public class BranchEmployee extends Branch implements Person{
	private int ID;
	private String name;
	private String surname;
	private int branchID;
	
	
	/**
	 * Constructor
	 * @param ID employee ID
	 * @param name employee name
	 * @param surname employee surname
	 * @param branchID branch ID where the employee works
	 * @param branchName branch name where the employee works
	 * @param branchAddress branch address where the employee works
	 */
	public BranchEmployee(int ID, String name, String surname, int branchID, String branchName, String branchAddress) {
		super(ID, branchName, branchAddress);
		this.ID = ID;
		this.name = name;
		this.surname = surname;
		this.branchID = branchID;
	}
	
	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int ID) {
		this.ID = ID;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * Gets the branch ID where the employee works.
	 * @return branch ID
	 */
	public String getWorkBranch() {
		return getBranchName(branchID);
	}
	
	/**
	 * Sets the branch ID where the employee works.
	 * @param branchID branch ID
	 */
	public void setWorkBranch(int branchID) {
		this.branchID = branchID;
	}
	
	/**
	 * Checks the given object is equal or not
	 * @param obj Object to be compared
	 * @return true if equal otherwise false
	 */
	public boolean equals(BranchEmployee obj) {
		if(this.ID == obj.getID())
			return true;
		else return false;
	}
	
	/**
	 * Adds a new product in the branch. 
	 * @param newProduct Product to add
	 */
	public void addProduct(Product newProduct) {
		if(allProducts.indexOf(newProduct) != -1)
			System.out.println("Product is already added!");
		else {
			allProducts.addLast(newProduct);
			System.out.println(newProduct.getID() + " product is added");
		}
	}
	
	/**
	 * Removes the product in given branch.
	 * @param removedProduct Product will be removed.
	 */
	public void removeProduct(Product removedProduct) {
		if(allProducts.indexOf(removedProduct) == -1)
			throw new NoSuchElementException(removedProduct.getID() + "product not found");
		else {
			allProducts.remove(removedProduct);
		}
	}
	
	/**
	 * Adds a new customer
	 * @param newCustomer Customer object will be added
	 * @param email Customer email for registration in the system.
	 * @param password Customer password for the registration in the system.
	 */
	public void addCustomer(Customer newCustomer, String email, String password) {
		//TODO
		if(customers.size() == 0) {
			customers.add(newCustomer);
			System.out.println(newCustomer.getName() + " " + newCustomer.getSurname() + " customer is added");
			registerTheCustomer(newCustomer, email, password);
		}
		else {
			boolean flag = false;
			for(int i=0; i<customers.size(); i++) {
				if(customers.get(i).getID() == newCustomer.getID()) {
					System.out.println(newCustomer.getName() + " " + newCustomer.getSurname() + " is already registered!");
					flag = true;
				}
			}
			if(flag == false) {
				customers.add(newCustomer);
				System.out.println(newCustomer.getName() + " " + newCustomer.getSurname() + " customer is added");
				registerTheCustomer(newCustomer, email, password);			
			}
		}
	}
	
	/**
	 * Register the customer in the system.
	 * @param newCustomer Customer object will be registered
	 * @param email Customer email will be registered
	 * @param password Customer password will be registered
	 */
	public void registerTheCustomer(Customer newCustomer, String email, String password) {
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getID() == newCustomer.getID()) {
				customers.get(i).setEmail(email);
				customers.get(i).setPassword(password);
				
				System.out.println("Email and password saved! Registration completed successfully");
			}
		}
		
	}
	
	/**
	 *  When the customer shopping at the store, employee make the sale.
	 *  If customer does not exist in the system, system gives the warning.
	 * @param customerID Customer ID of the shopping customer
	 * @param orderProduct Purchased product object
	 * @param customerAddress Customer address
	 * @param customerPhone Customer phone number
	 */
	public void makeSale(int customerID, Product orderProduct, String customerAddress, String customerPhone) {
		int flag = 0;
		
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getID() == customerID) {
				customers.get(i).setAddress(customerAddress);
				customers.get(i).setPhoneNumber(customerPhone);
				addPreviousOrder(orderProduct, customerID);
				removeProduct(orderProduct);
				customers.get(i).getCustomerInfo();
				flag++;
				System.out.println("The product sold");
			}
		}
		if(flag == 0) {
			System.out.println("Customer not found! Please register");
		}
	}
	
	/**
	 * If the sale is made, previous orders are added.
	 * @param orderProduct Product will be added.
	 * @param customerID Customer ID who bought the product
	 */
	public void addPreviousOrder(Product orderProduct, int customerID) {
		int flag = 0;
		
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getID() == customerID) {
				customers.get(i).previousOrder.add(orderProduct);
				System.out.println("The product added to the past sales list");
				flag++;
			}
		}
		
		if(flag == 0)
			System.out.println("Product is already added in previous order list!");
		
	}
	
	/**
	 * It shows the products that the customer has purchased in the past.
	 * @param customerObj Customer to check past orders 
	 */
	public void accessThePastOrder(Customer customerObj) {
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getID() == customerObj.getID())
				customers.get(i).getPreviousOrder();
		}
	}
	
	/**
	 * It checks whether the customer is registered in the system and if it is,
	 * it shows the customer's previous orders.
	 * @param customerID customer id whose previous orders will be displayed
	 */
	public void getPreviousOrder(int customerID) {
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getID() == customerID) {
				customers.get(i).getPreviousOrder();
			}
		}
	}

}
