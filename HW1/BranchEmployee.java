/**
 * This class is the branch employee class. 
 * @author seyma
 *
 */
public class BranchEmployee extends Branch implements Person {
	
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
		super(branchID, branchName, branchAddress);
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
	public int getWorkBranch() {
		return branchID;
	}
	
	/**
	 * Sets the branch ID where the employee works.
	 * @param branchID branch ID
	 */
	public void setWorkBranch(int branchID) {
		this.branchID = branchID;
	}
	
	/**
	 * Adds a new product in the branch. 
	 * @param newProduct Product to add
	 * @param branchID Branch ID to which the product will be added
	 */
	public void addProduct(Product newProduct, int branchID) {	//exception fýrlat
	
		for(Branch br : branch) {
			if(br.getID() == branchID) {
				if(br.allProducts.length == 0) {
					br.allProducts = new Product[1];
					br.allProducts[0] = newProduct;
					System.out.println(newProduct.getID() + " product is added");	
				}
				else {
					int flag = 0;
					for(int i=0; i<br.allProducts.length; i++) {
						if(br.allProducts[i].getID() == newProduct.getID())
							flag++;
					}
					if(flag != 0)
						System.out.println(newProduct.getID() + "product is already added. Please change the product ID");
					else {
						Product[] temp = new Product[br.allProducts.length];
						for(int i=0; i<br.allProducts.length; i++)
							temp[i] = br.allProducts[i];
						
						br.allProducts = new Product[br.allProducts.length+1];
						
						for(int i=0; i<temp.length; i++)
							br.allProducts[i] = temp[i];
						
						br.allProducts[br.allProducts.length-1] = newProduct;
						
						System.out.println(newProduct.getID() + "product is added!");
					}
				}
			}
		}
	}
	
	/**
	 * Removes the product in given branch.
	 * @param removedProduct Product will be removed.
	 * @param branchID Branch ID where the product will be deleted
	 */
	public void removeProduct(Product removedProduct, int branchID) {
		for(Branch br : branch) {
			if(br.getID() == branchID) {
				if(br.allProducts.length == 0)
					return;
				
				else {
					int flag = 0;
					int index = -1;
					
					for(int i=0; i<br.allProducts.length; i++) {
						if(br.allProducts[i] == removedProduct) {
							flag++;
							index = i;
						}
					}
					if(flag != 0) {
						for(int i=index; i<br.allProducts.length-1; i++)
							br.allProducts[i] = br.allProducts[i+1];
						
						Product[] temp = new Product[br.allProducts.length-1];
						for(int i=0; i<temp.length; i++)
							temp[i] = br.allProducts[i];
						
						br.allProducts = new Product[temp.length];
						for(int i=0; i<br.allProducts.length; i++)
							br.allProducts[i] = temp[i];
						
						System.out.println(removedProduct.getID() + " product is removed");
					}
					else {
						System.out.println("There is no product called " + removedProduct.getID());
					}
				}
			}
		}
	}
	
	/**
	 * Adds a new customer
	 * @param newCustomer Customer object will be added
	 * @param email Customer email for registration in the system.
	 * @param password Customer password for the registration in the system.
	 */
	public void addCustomer(Customer newCustomer, String email, String password) {
		int flag = 0;
		if(customer.length == 0) {
			customer = new Customer[1];
			customer[0] = newCustomer;
			
			System.out.println(newCustomer.getName() + " " + newCustomer.getSurname() + " customer is added");
			registerTheCustomer(newCustomer, email, password);
		}
		else {
			for(int i=0; i<customer.length; i++) {
				if(customer[i].getID() == newCustomer.getID())
					flag++;
			}
			if(flag != 0)
				System.out.println(newCustomer.getName() + " " + newCustomer.getSurname() + " customer is already added!");
			else {
				Customer[] temp = new Customer[customer.length];
				for(int i=0; i<customer.length; i++)
					temp[i] = customer[i];
				
				customer = new Customer[customer.length+1];
				for(int i=0; i<temp.length; i++)
					customer[i] = temp[i];
				customer[customer.length-1] = newCustomer;
				
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
		for(int i=0; i<customer.length; i++) {
			if(customer[i].getID() == newCustomer.getID()) {
				customer[i].setEmail(email);
				customer[i].setPassword(password);
				
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
		
		for(Customer cs : customer) {
			if(cs.getID() == customerID) {
				cs.setAddress(customerAddress);
				cs.setPhoneNumber(customerPhone);
				addPreviousOrder(orderProduct, customerID);
				removeProduct(orderProduct, branchID);
				cs.getCustomerInfo();
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
		for(Customer cs : customer) {
			if(cs.getID() == customerID) {
				if(cs.previousOrder.length == 0) {
					cs.previousOrder = new Product[1];
					cs.previousOrder[0] = orderProduct;
					System.out.println("The product added to the past sales list");
				}
				else {
					int flag = 0;
					for(int i=0; i<cs.previousOrder.length; i++) {
						if(cs.previousOrder[i].getID() == orderProduct.getID())
							flag++;
					}
					if(flag != 0)
						System.out.println(orderProduct.getID() + "product is already added in previous order list!");
					else {
						Product[] temp = new Product[cs.previousOrder.length+1];
						for(int i=0; i<cs.previousOrder.length; i++)
							temp[i] = cs.previousOrder[i];
						
						cs.previousOrder = new Product[cs.previousOrder.length+1];
						
						for(int i=0; i<temp.length; i++)
							cs.previousOrder[i] = temp[i];
						
						cs.previousOrder[cs.previousOrder.length-1] = orderProduct;
						System.out.println("The product added to the past sales list");
					}
				}
			}
		}	
	}
	
	/**
	 * It shows the products that the customer has purchased in the past.
	 * @param customerObj Customer to check past orders 
	 */
	public void accessThePastOrder(Customer customerObj) {
		for(Customer cs : customer) {
			if(cs.getID() == customerObj.getID()) {
				cs.getPreviousOrder();
			}
		}
	}
	
	/**
	 * It checks whether the customer is registered in the system and if it is,
	 * it shows the customer's previous orders.
	 * @param customerID customer id whose previous orders will be displayed
	 */
	public void getPreviousOrder(int customerID) {
		for(Customer cs : customer) {
			if(cs.getID() == customerID) {
				cs.getPreviousOrder();
			}
		}
	}
}
