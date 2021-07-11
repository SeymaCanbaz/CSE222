/**
 * This class is the customer class.
 * @author seyma
 *
 */
public class Customer extends OfficeFurnitureSystem implements Person {

	private int ID;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String phoneNumber;
	private String address;
	protected Product[] previousOrder;	/**Previous order of customer*/
	
	/**
	 * Constructor
	 * @param ID customer ID
	 * @param name customer name
	 * @param surname customer surname
	 */
	public Customer(int ID, String name, String surname) {
		super();
		this.ID = ID;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = "-";
		this.address = "-";
		previousOrder = new Product[0];
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
	 * Gets the customer password
	 * @return the customer password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the customer password
	 * @param password customer password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Gets the customer phone number
	 * @return customer phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the customer phone number
	 * @param phoneNumber customer phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Gets the customer email
	 * @return customer email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the customer email
	 * @param email customer email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets the customer address
	 * @return the customer address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the customer address
	 * @param address customer address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Shows the information of the customer
	 */
	public void getCustomerInfo() {
		System.out.println("\nCUSTOMER INFORMATION");
		System.out.println("ID: " + this.getID() + "\n"
							+ "NAME: " + this.getName() + "\n"
							+ "SURNAME: " + this.getSurname() + "\n"
							+ "ADDRESS: " + this.getAddress() + "\n"
							+ "PHONE NUMBER: " + this.getPhoneNumber() + "\n");
	}
	
	/**
	 * It shows all the orders of the customer.
	 */
	public void getPreviousOrder() {
		if(previousOrder.length == 0)
			System.out.println("Order not found");
		
		else {
			String branchName = "";
			String status = "";
			
			for(int i=0; i<previousOrder.length; i++) {
				branchName = getBranch(previousOrder[i].getInWhichBranch()).getName();
				
				if(previousOrder[i].getOfferType()) {
					status = "online";
				}
				else {
					status = "inBranch";
				}
				
				System.out.println(i+1 + ". PRODUCT\n"
									+ "Product ID: " + previousOrder[i].getID() + " "
									+ "Type: " + previousOrder[i].getType() + " "
									+ "Model: " + previousOrder[i].getModel() + " "
									+ "Color: " + previousOrder[i].getColor() + " "
									+ "Status: " + status + " "
									+ "Order in Branch: " + branchName);
			}
		}
	}
	
	/**
	 * It shows the customer's last order.
	 */
	public void getLastOrder() {
		if(previousOrder.length == 0)
			System.out.println("You do not have an order");
		
		else if(previousOrder.length == 1) {
			String status = "";
			String branchName = getBranch(previousOrder[0].getInWhichBranch()).getName();
			
			if(previousOrder[0].getOfferType()) {
				status = "online";
			}
			else {
				status = "inBranch";
			}
			
			System.out.println("\nPRODUCT ORDER INFORMATION" + "\n" +
								"Product Order ID: " + previousOrder[0].getID() + "\n"
								+ "Product Order Type: " + previousOrder[0].getType() + "\n"
								+ "Product Order Model: " + previousOrder[0].getModel() + "\n"
								+ "Product Order Color: " + previousOrder[0].getColor() + "\n"
								+ "Product Order Status: " + status + "\n"
								+ "Product Order in Branch" + branchName);
		}
		else {
			int size = previousOrder.length-1;
			String str = "";
			String branchName = getBranch(previousOrder[size].getInWhichBranch()).getName();
			
			if(previousOrder[size].getOfferType()) {
				str = "online";
			}
			else {
				str = "inBranch";
			}
			
			System.out.println("Product Order ID: " + previousOrder[size].getID() + "\n"
					+ "Product Order Type: " + previousOrder[size].getType() + "\n"
					+ "Product Order Model: " + previousOrder[size].getModel() + "\n"
					+ "Product Order Color: " + previousOrder[size].getColor() + "\n"
					+ "Product Order Status: " + str + "\n"
					+ "Product Order in Branch" + branchName);
		}
	}
	
	/**
	 * The customer shops online.
	 * @param product The product purchased by the customer
	 * @param employeeID Employee to do the necessary operations for sales.
	 * @param customerAddress Customer address
	 * @param customerPhone Customer phone number
	 */
	public void shopOnline(Product product, int employeeID, String customerAddress, String customerPhone) {
		for(Branch br : branch) {
			if(br.getProduct(product.getID()) != null) {
				this.address = customerAddress;
				this.phoneNumber = customerPhone;
				br.getBranchEmployee(employeeID).addPreviousOrder(product, this.getID());
				br.getBranchEmployee(employeeID).removeProduct(product, br.getID());
				System.out.println("Your order has been received!");
				this.getLastOrder();
				this.getCustomerInfo();
			}
		}
	}
	
	/**
	 * The customer sees all the products in the branch.
	 * @param inBranch The branch ID where products will be searched
	 */
	public void seeListOfProducts(Branch inBranch) {
		for(Branch br : branch) {
			if(br.getID() == inBranch.getID()) {
				System.out.println(br.getAllProducts());
			}
		}
	}
	
	/**
	 * Customer searches for the product.
	 * @param productID ID of the product to search
	 */
	public void searchProduct(int productID) {
		int flag = 0;
		System.out.println("Searching...");
		
		for(Branch br : branch) {
			if(br.isInThere(productID)){
				for(int i=0; i<br.allProducts.length; i++) {
					if(br.allProducts[i].getID() == productID) {
						System.out.println("Product in " + br.getName() + " branch");
						flag++;
					}					
				}
			}
		}
		if(flag == 0)
			System.out.println("Product not found");	
	}
}
