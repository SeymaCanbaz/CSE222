/**
 * This class is the branch class. It keeps products,
 * branch employees.
 * @author seyma
 *
 */
public class Branch extends OfficeFurnitureSystem {
	private int ID;
	private String name;
	private String address;
	protected BranchEmployee[] BE;
	protected Product[] allProducts;
	
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
		BE = new BranchEmployee[0];
		allProducts = new Product[119];			//dikkaat
		
		setInitialProducts();
	}
	
	/**
	 * When creating the store, products that must be in stock are created.
	 */
	public void setInitialProducts() {
		
		allProducts[0] = new Product(300000, "officeCabinet", "model1", "-", getID());
		allProducts[1] = new Product(300001, "officeCabinet", "model2", "-", getID());
		allProducts[2] = new Product(300002, "officeCabinet", "model3", "-", getID());
		allProducts[3] = new Product(300003, "officeCabinet", "model4", "-", getID());
		allProducts[4] = new Product(300004, "officeCabinet", "model5", "-", getID());
		allProducts[5] = new Product(300005, "officeCabinet", "model6", "-", getID());
		allProducts[6] = new Product(300006, "officeCabinet", "model7", "-", getID());
		allProducts[7] = new Product(300007, "officeCabinet", "model8", "-", getID());
		allProducts[8] = new Product(300008, "officeCabinet", "model9", "-", getID());
		allProducts[9] = new Product(300009, "officeCabinet", "model10", "-", getID());
		allProducts[10] = new Product(300010, "officeCabinet", "model1", "-", getID());
		allProducts[11] = new Product(300011, "officeCabinet", "model2", "-", getID());
		
		allProducts[12] = new Product(310000, "bookcase", "model1", "-", getID());
		allProducts[13] = new Product(310001, "bookcase", "model2", "-", getID());
		allProducts[14] = new Product(310002, "bookcase", "model3", "-", getID());
		allProducts[15] = new Product(310003, "bookcase", "model4", "-", getID());
		allProducts[16] = new Product(310004, "bookcase", "model5", "-", getID());
		allProducts[17] = new Product(310005, "bookcase", "model6", "-", getID());
		allProducts[18] = new Product(310006, "bookcase", "model7", "-", getID());
		allProducts[19] = new Product(310007, "bookcase", "model8", "-", getID());
		allProducts[20] = new Product(310008, "bookcase", "model9", "-", getID());
		allProducts[21] = new Product(310009, "bookcase", "model10", "-", getID());
		allProducts[22] = new Product(310010, "bookcase", "model11", "-", getID());
		allProducts[23] = new Product(310011, "bookcase", "model12", "-", getID());
		
		allProducts[24] = new Product(320000, "meetingTable", "model1", "black", getID());
		allProducts[25] = new Product(320001, "meetingTable", "model2", "black", getID());
		allProducts[26] = new Product(320002, "meetingTable", "model3", "black", getID());
		allProducts[27] = new Product(320003, "meetingTable", "model4", "black", getID());
		allProducts[28] = new Product(320004, "meetingTable", "model5", "black", getID());
		allProducts[29] = new Product(320005, "meetingTable", "model6", "black", getID());
		allProducts[30] = new Product(320006, "meetingTable", "model7", "black", getID());
		allProducts[31] = new Product(320007, "meetingTable", "model8", "black", getID());
		allProducts[32] = new Product(320008, "meetingTable", "model9", "black", getID());
		allProducts[33] = new Product(320009, "meetingTable", "model10", "black", getID());
		
		allProducts[34] = new Product(320010, "meetingTable", "model1", "white", getID());
		allProducts[35] = new Product(320011, "meetingTable", "model2", "white", getID());
		allProducts[36] = new Product(320012, "meetingTable", "model3", "white", getID());
		allProducts[37] = new Product(320013, "meetingTable", "model4", "white", getID());
		allProducts[38] = new Product(320014, "meetingTable", "model5", "white", getID());
		allProducts[39] = new Product(320015, "meetingTable", "model6", "white", getID());
		allProducts[40] = new Product(320016, "meetingTable", "model7", "white", getID());
		allProducts[41] = new Product(320017, "meetingTable", "model8", "white", getID());
		allProducts[42] = new Product(320018, "meetingTable", "model9", "white", getID());
		allProducts[43] = new Product(320019, "meetingTable", "model10", "white", getID());
		
		allProducts[44] = new Product(320020, "meetingTable", "model1", "blue", getID());
		allProducts[45] = new Product(320021, "meetingTable", "model2", "blue", getID());
		allProducts[46] = new Product(320022, "meetingTable", "model3", "blue", getID());
		allProducts[47] = new Product(320023, "meetingTable", "model4", "blue", getID());
		allProducts[48] = new Product(320024, "meetingTable", "model5", "blue", getID());
		allProducts[49] = new Product(320025, "meetingTable", "model6", "blue", getID());
		allProducts[50] = new Product(320026, "meetingTable", "model7", "blue", getID());
		allProducts[51] = new Product(320027, "meetingTable", "model8", "blue", getID());
		allProducts[52] = new Product(320028, "meetingTable", "model9", "blue", getID());
		allProducts[53] = new Product(320029, "meetingTable", "model10", "blue", getID());
	
		allProducts[54] = new Product(320030, "meetingTable", "model1", "green", getID());
		allProducts[55] = new Product(320031, "meetingTable", "model2", "green", getID());
		allProducts[56] = new Product(320032, "meetingTable", "model3", "green", getID());
		allProducts[57] = new Product(320033, "meetingTable", "model4", "green", getID());
		allProducts[58] = new Product(320034, "meetingTable", "model5", "green", getID());
		allProducts[59] = new Product(320035, "meetingTable", "model6", "green", getID());
		allProducts[60] = new Product(320036, "meetingTable", "model7", "green", getID());
		allProducts[61] = new Product(320037, "meetingTable", "model8", "green", getID());
		allProducts[62] = new Product(320038, "meetingTable", "model9", "green", getID());
		allProducts[63] = new Product(320039, "meetingTable", "model10", "green", getID());
	
		allProducts[64] = new Product(330000, "officeDesk", "model1", "black", getID());
		allProducts[65] = new Product(330001, "officeDesk", "model2", "black", getID());
		allProducts[66] = new Product(330002, "officeDesk", "model3", "black", getID());
		allProducts[67] = new Product(330003, "officeDesk", "model4", "black", getID());
		allProducts[68] = new Product(330004, "officeDesk", "model5", "black", getID());
		
		allProducts[69] = new Product(330005, "officeDesk", "model1", "white", getID());
		allProducts[70] = new Product(330006, "officeDesk", "model2", "white", getID());
		allProducts[71] = new Product(330007, "officeDesk", "model3", "white", getID());
		allProducts[72] = new Product(330008, "officeDesk", "model4", "white", getID());
		allProducts[73] = new Product(330009, "officeDesk", "model5", "white", getID());
		
		allProducts[74] = new Product(330010, "officeDesk", "model1", "blue", getID());
		allProducts[75] = new Product(330011, "officeDesk", "model2", "blue", getID());
		allProducts[76] = new Product(330012, "officeDesk", "model3", "blue", getID());
		allProducts[77] = new Product(330013, "officeDesk", "model4", "blue", getID());
		allProducts[78] = new Product(330014, "officeDesk", "model5", "blue", getID());
	
		allProducts[79] = new Product(330015, "officeDesk", "model1", "green", getID());
		allProducts[80] = new Product(330016, "officeDesk", "model2", "green", getID());
		allProducts[81] = new Product(330017, "officeDesk", "model3", "green", getID());
		allProducts[82] = new Product(330018, "officeDesk", "model4", "green", getID());
		allProducts[83] = new Product(330019, "officeDesk", "model5", "green", getID());
		
	
		allProducts[84] = new Product(340000, "officeChair", "model1", "black", getID());
		allProducts[85] = new Product(340001, "officeChair", "model2", "black", getID());
		allProducts[86] = new Product(340002, "officeChair", "model3", "black", getID());
		allProducts[87] = new Product(340003, "officeChair", "model4", "black", getID());
		allProducts[88] = new Product(340004, "officeChair", "model5", "black", getID());
		allProducts[89] = new Product(340005, "officeChair", "model6", "black", getID());
		allProducts[90] = new Product(340006, "officeChair", "model7", "black", getID());
		
		allProducts[91] = new Product(340007, "officeChair", "model1", "white", getID());
		allProducts[92] = new Product(340008, "officeChair", "model2", "white", getID());
		allProducts[93] = new Product(340009, "officeChair", "model3", "white", getID());
		allProducts[94] = new Product(340010, "officeChair", "model4", "white", getID());
		allProducts[95] = new Product(340011, "officeChair", "model5", "white", getID());
		allProducts[96] = new Product(340012, "officeChair", "model6", "white", getID());
		allProducts[97] = new Product(340013, "officeChair", "model7", "white", getID());
		
		allProducts[98] = new Product(340014, "officeChair", "model1", "blue", getID());
		allProducts[99] = new Product(340015, "officeChair", "model2", "blue", getID());
		allProducts[100] = new Product(340016, "officeChair", "model3", "blue", getID());
		allProducts[101] = new Product(340017, "officeChair", "model4", "blue", getID());
		allProducts[102] = new Product(340018, "officeChair", "model5", "blue", getID());
		allProducts[103] = new Product(340019, "officeChair", "model6", "blue", getID());
		allProducts[104] = new Product(340020, "officeChair", "model7", "blue", getID());
		
		allProducts[105] = new Product(340021, "officeChair", "model1", "green", getID());
		allProducts[106] = new Product(340022, "officeChair", "model2", "green", getID());
		allProducts[107] = new Product(340023, "officeChair", "model3", "green", getID());
		allProducts[108] = new Product(340024, "officeChair", "model4", "green", getID());
		allProducts[109] = new Product(340025, "officeChair", "model5", "green", getID());
		allProducts[110] = new Product(340026, "officeChair", "model6", "green", getID());
		allProducts[111] = new Product(340027, "officeChair", "model7", "green", getID());
		
		allProducts[112] = new Product(340028, "officeChair", "model1", "purple", getID());
		allProducts[113] = new Product(340029, "officeChair", "model2", "purple", getID());
		allProducts[114] = new Product(340030, "officeChair", "model3", "purple", getID());
		allProducts[115] = new Product(340031, "officeChair", "model4", "purple", getID());
		allProducts[116] = new Product(340032, "officeChair", "model5", "purple", getID());
		allProducts[117] = new Product(340033, "officeChair", "model6", "purple", getID());
		allProducts[118] = new Product(340034, "officeChair", "model7", "purple", getID());		
	
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
	
	/**
	 * Returns the size of the product in stock in this branch.
	 * @return the number of products
	 */
	public int getAllProductSize() {
		return allProducts.length;
	}
	
	/**
	 * Gets the all product in this branch.
	 * @return the details of all products.
	 */
	public String getAllProducts() {
		String str = "";
		
		for(int i=0; i<allProducts.length; i++) {
			str += "Type: " + allProducts[i].getType() + "\t"
					+ "Model: " + allProducts[i].getModel() + "\t"
					+ "Color: " + allProducts[i].getColor() + "\t"
					+ "ProductID: " + allProducts[i].getID() + "\t"
					+ "Branch: " +  getName() + "\n" ; 
		}
		return str;
	}
	
	/**
	 * Returns the product if it is exist in this branch.
	 * @param ID Product id to search
	 * @return products if product is in branch,
	 * 			else returns null
	 */
	public Product getProduct(int ID) {		//exception fýrlat
		for(int i=0; i<allProducts.length; i++){
			if(allProducts[i].getID() == ID)
				return allProducts[i];
		}
		return null;
	}
	
	/**
	 * Prints the all products in this branch.
	 */
	public void getListofProducts() {	//bulunduðun branchteki ürünleri listele
		System.out.println(getAllProducts());
	}
	
	/**
	 * Returns the number of product of the given type.
	 * @param productType Product type to search
	 * @return number of product of the given type in this branch
	 */
	public int getAllStockInfo(String productType) {
		int counter=0;

		for(int i=0; i<allProducts.length; i++) {
			if(allProducts[i].getType() == productType)
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
		for (BranchEmployee employee : BE) {
			if(ID == employee.getID())
				return employee;
		}
		return null;	
	}
	
	/**
	 * Checks whether the product is in this branch.
	 * @param productID Product ID to search
	 * @return true if it exist, else false
	 */
	public boolean isInThere(int productID) {
		if(allProducts.length == 0)
			return false;
		else {
			for(int i=0; i<allProducts.length; i++) {
				if(allProducts[i].getID() == productID)
					return true;
			}
		}
		return false;
	}
}
