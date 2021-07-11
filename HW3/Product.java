
public class Product extends OfficeFurnitureSystem {
	private int ID;
	private String type;
	private String model;
	private String color;
	private String inWhichBranch;	/**Branch where it is located*/
	private boolean offerType = true;	/**If online true, else false*/
	
	
	/**
	 * Constructor
	 * @param ID Product ID
	 * @param type Product type
	 * @param model Product model
	 * @param color Product color
	 * @param branchID The branch ID where the product is located
	 */
	public Product(int ID, String type, String model, String color,  String branchName) {
		super();
		this.ID = ID;
		this.type = type;
		this.model = model;
		this.color = color;
		this.inWhichBranch = branchName;
	}
	
	/**
	 * Gets the product ID
	 * @return product ID
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * Sets the product ID
	 * @param ID product ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
	
	/**
	 * Gets the product type
	 * @return product type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Gets the product model
	 * @return product model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Gets the product color
	 * @return product color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Sets the product type
	 * @param type product type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Sets the product model
	 * @param model product model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * Sets the product color
	 * @param color product color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Gets the branch where the product is located
	 * @return branch name
	 */
	public String getInWhichBranch() {
		return inWhichBranch;
	}
	
	/**
	 * Sets the branch where the product is located
	 * @param branchID The branch ID to which the product will be added
	 */
	public void setInWhichBranch(String branchName) {
		this.inWhichBranch = branchName; 
	}
	
	/**
	 * Returns the offer type. If it is true, customer shopping the online.
	 * Else customer shopping in branch.
	 * @return offer type
	 */
	public boolean getOfferType() {
		return offerType;
	}
	
	/**
	 * Sets the offer type. If customer shopping the online, offer type is true.
	 * Else false. 
	 * @param offerType online or in branch
	 */
	public void setOfferType(boolean offerType) {
		this.offerType = offerType;
	}
}

