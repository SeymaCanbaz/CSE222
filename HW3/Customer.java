/**
 * This class is the customer class.
 * @author seyma
 *
 */
public class Customer extends OfficeFurnitureSystem implements Person{
	private int ID;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String phoneNumber;
	private String address;
	protected KWLinkedList<Product> previousOrder;	/**Previous order of customer*/

	
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
		previousOrder = new KWLinkedList<Product>();
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
	
	public boolean equals(Customer obj) {
		if(this.ID == obj.getID())
			return true;
		else return false;
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
		if(previousOrder.size() == 0)
			System.out.println("Orders not found");
		else {
			String status = "";
			
			for(int i=0; i<previousOrder.size(); i++) {
				if(previousOrder.get(i).getOfferType())
					status = "online";
				else
					status = "inBranch";
			
				System.out.println(i+1 + ". PRODUCT\n"
						+ "Product ID: " + previousOrder.get(i).getID() + " "
						+ "Type: " + previousOrder.get(i).getType() + " "
						+ "Model: " + previousOrder.get(i).getModel() + " "
						+ "Color: " + previousOrder.get(i).getColor() + " "
						+ "Status: " + status + " "
						+ "Order in Branch: " + previousOrder.get(i).getInWhichBranch());
			}
		}
	}
	
	/**
	 * It shows the customer's last order.
	 */
	public void getLastOrder() {
		if(previousOrder.size() == 0)
			System.out.println("You do not have an order");
		
		else if(previousOrder.size() == 1) {
			String status = "";
			
			if(previousOrder.get(0).getOfferType())
				status = "online";
			else
				status = "inBranch";
		
			System.out.println("PRODUCT ORDER INFORMATION\n"
					+ "Product ID: " + previousOrder.get(0).getID() + " "
					+ "Type: " + previousOrder.get(0).getType() + " "
					+ "Model: " + previousOrder.get(0).getModel() + " "
					+ "Color: " + previousOrder.get(0).getColor() + " "
					+ "Status: " + status + " "
					+ "Order in Branch: " + previousOrder.get(0).getInWhichBranch());
		}
		else {
			int size = previousOrder.size()-1;
			String status = "";
			
			if(previousOrder.get(size).getOfferType())
				status = "online";
			else
				status = "inBranch";
			
			System.out.println("PRODUCT ORDER INFORMATION\n"
					+ "Product ID: " + previousOrder.get(size).getID() + " "
					+ "Type: " + previousOrder.get(size).getType() + " "
					+ "Model: " + previousOrder.get(size).getModel() + " "
					+ "Color: " + previousOrder.get(size).getColor() + " "
					+ "Status: " + status + " "
					+ "Order in Branch: " + previousOrder.get(size).getInWhichBranch());	
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
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).isInThere(product.getID())) {
				this.address = customerAddress;
				this.phoneNumber = customerPhone;
				branches.get(i).getBranchEmployee(employeeID).addPreviousOrder(product, this.getID());
				branches.get(i).getBranchEmployee(employeeID).removeProduct(product);
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
	public void seeListOfProducts(int inBranch) {
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getID() == inBranch)
				System.out.println(branches.get(i).getAllProducts());
		}
	}
	
	/**
	 * Customer searches for the product.
	 * @param productID ID of the product to search
	 */
	public void searchProduct(int productID) {
		int flag = 0;
		System.out.println("Searching...");
		
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).isInThere(productID)) {
				for(int j=0; j<branches.get(i).allProducts.size(); j++) {
					if(branches.get(i).allProducts.get(j).getID() == productID) {
						System.out.println("Product in " + branches.get(i).getName() + " branch");
						flag++;
					}
				}
			}
		}
		
		if(flag == 0)
			System.out.println(productID + " product not found");	
	}

}
