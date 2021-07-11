/**
 * This is the top class. All classes are subclasses of this class.
 * Branches and customers are kept in this class.
 * @author seyma
 *
 */
public class OfficeFurnitureSystem {
	
	protected static Customer [] customer = new Customer[0];
	protected static Branch [] branch = new Branch[0];
	private Admin admin;
	
	/*** No parameter constructor */
	public OfficeFurnitureSystem() {}
	
	/**
	 * Gets the administrator.
	 * @return Returns the administrator
	 */
	public Admin getAdmin() {
		return admin;
	}
	
	/**
	 * Sets the administrator.
	 * @param admin company administrator
	 */
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	/**
	 * Gets the branch. If the branch does not exist, returns null.
	 * @param ID Determines the object to be returned.
	 * @return branch object. If it does not exist returns null.
	 */
	public Branch getBranch(int ID) {
		for(Branch br: branch) {
			if(br.getID() == ID)
				return br;
		}
		return null;
	}
	
	/**
	 * Gets the customer object given customer ID.
	 * @param customerID will be searched.
	 * @return If customer does not exist returns null,
	 * 			else returns customer.
	 */
	public Customer getCustomer(int customerID) {
		for(Customer cs : customer) {
			if(cs.getID() == customerID)
				return cs;
		}
		return null;
	}
	
	/**
	 * Checks whether the customer is in the system.
	 * @param customerID to call
	 * @return Returns true if the customer is exist,
	 * 			otherwise returns false
	 */
	public boolean checkCustomer(int customerID) {
		int flag = 0;
		for(Customer cs : customer) {
			if(cs.getID() == customerID)
				flag++;
		}
		if(flag != 0) return true;
		else return false;
	}
}
