/**
 * This class is the branch class. It keeps products,
 * branch employees.
 * @author seyma
 *
 */
public class Branch extends OfficeFurnitureSystem {
	protected KWArrayList<BranchEmployee> employee;
	private int ID;
	private String name;
	private String address;
	protected KWLinkedList<Product> allProducts;
	
	/**
	 * Constructor
	 * @param ID branch ID
	 * @param name branch name
	 * @param address branch address
	 */
	public Branch(int ID, String name, String address) {	
		this.ID = ID;
		this.name = name;
		this.address = address;
		employee = new KWArrayList<BranchEmployee>();
		allProducts = new KWLinkedList<Product>();	
	}

	/**
	 * Gets the branch ID
	 * @return branch ID
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * Sets the branch ID
	 * @param ID Branch ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
	
	/**
	 * Gets the branch name
	 * @return branch name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the branch name
	 * @param name Branch name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the branch address
	 * @return the branch address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the branch address
	 * @param address Branch address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	
	public boolean equals(Branch obj) {
		if(this.ID == obj.getID())
			return true;
		else return false;
	}
	
	/**
	 * Returns the number of products
	 */
	public int getProductSize() {
		return allProducts.size();
	}
	
	/**
	 * Gets the all product in this branch.
	 * @return the details of all products.
	 */
	public String getAllProducts() {
		String str = "";
		
		for(int i=0; i<allProducts.size(); i++) {
			str += "Type: " + allProducts.get(i).getType() + "\t"
					+ "Model: " + allProducts.get(i).getModel() + "\t"
					+ "Color: " + allProducts.get(i).getColor() + "\t"
					+ "ProductID: " + allProducts.get(i).getID() + "\t"
					+ "Branch: " +  allProducts.get(i).getInWhichBranch() + "\n" ; 
		}
		return str;
	}
	
	/**
	 * Returns the product if it is exist in this branch.
	 * @param ID Product id to search
	 * @return products if product is in branch,
	 * 			else returns null
	 */
	public Product getProduct(int ID) {
		for(int i=0; i<allProducts.size(); i++) {
			if(allProducts.get(i).getID() == ID)
				return allProducts.get(i);
		}
		return null;
	}
	
	/**
	 * Prints the all products in this branch.
	 */
	public void getListOfProducts() {
		System.out.println(getAllProducts());
	}
	
	/**
	 * Returns the number of product of the given type.
	 * @param productType Product type to search
	 * @return number of product of the given type in this branch
	 */
	public int getAllStockInfo(String productType) {
		int counter = 0;
		for(int i=0; i<allProducts.size(); i++) {
			if(allProducts.get(i).getType() == productType)
				counter++;
		}
		return counter;
	}
	/**
	 * Returns the branch employee. If the employee not exist return null.
	 * @param ID branch employee ID
	 * @return employee or null
	 */
	public BranchEmployee getBranchEmployee(int ID) {
		//TODO	
		for(int i=0; i<employee.size(); i++) {
			if(employee.get(i).getID() == ID) {
				return employee.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Checks whether the product is in this branch.
	 * @param productID Product ID to search
	 * @return true if it exist, else false
	 */
	public boolean isInThere(int productID) {
		if(allProducts.size() == 0)
			return false;
		else {
			for(int i=0; i<allProducts.size(); i++) {
				if(allProducts.get(i).getID() == productID)
					return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks the given employee works in this branch or not
	 * @param ID employee ID
	 * @return if is in true, else false
	 */
	public boolean isEmployeeHere(int ID) {
		for(int i=0; i<employee.size(); i++) {
			if(employee.get(i).getID() == ID)
				return true;
		}
		return false;
	}
	
	/**
	 * Prints the employee in working this branch
	 */
	public void printEmployees() {
		for(int i=0; i<employee.size(); i++) {
			System.out.println(employee.get(i).getID() + " " + employee.get(i).getName() + " " + employee.get(i).getSurname() + " " +
								employee.get(i).getWorkBranch());
		}
	
	}
}
