
public class OfficeFurnitureSystem {
	

	protected static KWLinkedList<Branch> branches = new KWLinkedList<Branch>();
	protected static KWArrayList<Customer> customers = new KWArrayList <Customer>();
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
	
	public Branch getBranch(int ID) {
		//TODO
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getID() == ID)
				return branches.get(i);
		}
		return null;
	}
	
	public String getBranchName(int branchID) {
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getID() == branchID)
				return branches.get(i).getName();
		}
		return "-";
	}
	
	public Customer getCustomer(int customerID) {
		//TODO
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getID() == customerID)
				return customers.get(i);
		}
		return null;
	}
	
	public boolean checkCustomer(int customerID) {
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).getID() == customerID)
				return true;
		}
		return false;
	}
	
	
	
}
