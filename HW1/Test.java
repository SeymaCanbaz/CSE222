/**
 * This is the driver class. 
 * @author seyma
 *
 */
public class Test {
	/**
	 * This is the main class
	 * @param args -
	 */
	public static void main(String[] args) {
		
		OfficeFurnitureSystem company = new OfficeFurnitureSystem();
		
		Branch b1 = new Branch(2000, "Ýstanbul", "Ýstanbul Street");
		Branch b2 = new Branch(2001, "Ankara", "Ankara Street");
		Branch b3 = new Branch(2002, "Ýzmir", "Ýzmir Street");
		Branch b4 = new Branch(2003, "Antalya", "Antalya Street");
		
		//ADD ADMIN
		Admin admin = new Admin(100000, "Þeyma", "CANBAZ");
		company.setAdmin(admin);
		System.out.println("Admin: " + company.getAdmin().getName() + " " + company.getAdmin().getSurname());
			
		try {
			//ADD BRANCH
			company.getAdmin().addBranch(b1);
			System.out.println("Branch ID: " + company.getAdmin().getBranch(2000).getID() + "\n");
			
			company.getAdmin().addBranch(b2);
			System.out.println("Branch ID: " + company.getAdmin().getBranch(2001).getID() + "\n");
			
			company.getAdmin().addBranch(b3);
			System.out.println("Branch ID: " + company.getAdmin().getBranch(2002).getID() + "\n");
			
			company.getAdmin().addBranch(b4);
			System.out.println("Branch ID: " + company.getAdmin().getBranch(2003).getID() + "\n");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			//REMOVE BRANCH
			company.getAdmin().removeBrach(b3);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			//ADD SAME BRANCH
			company.getAdmin().addBranch(b1);	//throws exception
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try {
			//REMOVE BRANCH (DOES NOT EXIST)
			company.getAdmin().removeBrach(b3);	//throws exception
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("\n");

		BranchEmployee BE = new BranchEmployee(600000, "Ali", "CANBAZ", b1.getID(), b1.getName(), b1.getAddress());
		BranchEmployee BE2 = new BranchEmployee(600001, "Gülay", "CAN", b1.getID(), b1.getName(), b1.getAddress());
		
		//ADD BRANCH EMPLOYEE
		company.getAdmin().addBranchEmployee(BE, company.getBranch(2000).getID());
		System.out.println("Branch ID: " + company.getBranch(2000).getBranchEmployee(600000).getWorkBranch());
		
		company.getAdmin().addBranchEmployee(BE2, company.getBranch(2000).getID());
		System.out.println("Branch ID: " + company.getBranch(2000).getBranchEmployee(600001).getWorkBranch());
		System.out.println("\n");
		
		//REMOVE BRANCH EMPLOYEE
		company.getAdmin().removeBranchEmployee(BE, company.getBranch(2000).getID());
		System.out.println("\n");
		
		//ADD SAME EMPLOYEE IN THE SAME BRANCH
		try {
			company.getAdmin().addBranchEmployee(BE2, company.getBranch(2000).getID());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//REMOVE BRANCH EMPLOYEE (DOES NOT EXIST)
		company.getAdmin().removeBranchEmployee(BE, company.getBranch(2000).getID());
		System.out.println("\n");
		
		//INQUIRE THE STOCK (BY ADMIN)
		company.getAdmin().getBranch(2000).getListofProducts();
		System.out.println("\n");
		
		Product product1 = new Product(5555, "bookcase", "model2", "-", company.getAdmin().getBranch(2000).getID());
		Product product2 = new Product(5565, "bookcase", "model2", "-", company.getAdmin().getBranch(2000).getID());
		Product product3 = new Product(5575, "bookcase", "model2", "-", company.getAdmin().getBranch(2000).getID());
		Product product4 = new Product(5275, "meetingTable", "model2", "-", company.getAdmin().getBranch(2000).getID());
		Product product5 = new Product(5175, "officeChair", "model2", "-", company.getAdmin().getBranch(2000).getID());
		Product product6 = new Product(6175, "officeChair", "model2", "-", company.getAdmin().getBranch(2000).getID());
		
		//ADD PRODUCT
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product1, 2000);
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product2, 2000);
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product3, 2000);
		System.out.println("\n");
		
		//REMOVE PRODUCT
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).removeProduct(product1, 2000);
		System.out.println("\n");
		
		//ADD PRODUCT(SAME ID)
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product3, 2000);
		System.out.println("\n");
		
		//REMOVE PRODUCT (DOES NOT EXIST)
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).removeProduct(product1, 2000);
		
		
		System.out.println("\n");
		Customer customer1 = new Customer(900000, "Cansu", "Tan");
		Customer customer2 = new Customer(900001, "Zeynep", "Sevim");
		
		//ADD CUSTOMER
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addCustomer(customer1, "cansu@email.com", "12345");		
//		System.out.println(company.getCustomer(900000).getEmail() + " " + company.getCustomer(900000).getPassword());
		
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addCustomer(customer2, "zeynep@email.com", "zeynep");		
//		System.out.println(company.getCustomer(900001).getEmail() + " " + company.getCustomer(900001).getPassword());
		
		System.out.println("\n");
		
		//ADD CUSTOMER(SAME CUSTOMER ID)
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addCustomer(customer1, "cansu@email.com", "12345");
		
		System.out.println("\n");
		
		//SEE THE LIST OF PRODUCT (CUSTOMER)
		System.out.println("******LIST OF THE PRODUCT*******");
		company.getCustomer(900001).seeListOfProducts(b1);
		
		//SEARCH THE PRODUCT (CUSTOMER)
		company.getCustomer(900001).searchProduct(5565);
		System.out.println("\n");
		
		//CUSTOMER SEARCH THE PRODUCT (DOES NOT EXIST)
		company.getCustomer(900001).searchProduct(6175);
		System.out.println("\n");
		
		//ADD PRODUCT
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product1, 2000);
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product4, 2000);
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product5, 2000);
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).addProduct(product6, 2000);
		System.out.println("\n");
		
		//CONTROL THE STOCK
		System.out.println("Office cabinet stock: " + company.getAdmin().getBranch(2000).getAllStockInfo("officeCabinet"));
		System.out.println("Office chair stock: " + company.getAdmin().getBranch(2000).getAllStockInfo("officeChair"));
		System.out.println("Office desk stock: " + company.getAdmin().getBranch(2000).getAllStockInfo("officeDesk"));
		System.out.println("Bookcase stock: " + company.getAdmin().getBranch(2000).getAllStockInfo("bookcase"));
		System.out.println("Meeting table stock: " + company.getAdmin().getBranch(2000).getAllStockInfo("meetingTable"));
		System.out.println("\n");
		
		//SHOPPING ONLINE
		company.getCustomer(900001).shopOnline(product5, 600001, "Ceviz Street NO:15", "777 77 77");
	
		//ACCESS THE PAST ORDER (BY EMPLOYEE)
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).accessThePastOrder(customer2);
		System.out.println();
		
		//ACCESS THE PAST ORDER (BY CUSTOMER)
		System.out.println("--YOUR PREVIOUS ORDERS--");
		company.getCustomer(900001).getPreviousOrder();
		System.out.println();
		
		//ACCESS THE PAST ORDER BY CUSTOMER (NO PREVIOUS ORDER)
		System.out.println("--YOUR PREVIOUS ORDERS--");
		company.getCustomer(900000).getPreviousOrder();
		System.out.println();
	
		System.out.println("------------");
		
		//SHOP IN BRANCH (WITH NOT REGISTERED CUSTOMER)
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).makeSale(9000, product6, "Yýldýz Street", "374 47 24");
		System.out.println("\n");
		
		//SHOP IN BRANCH (WITH REGISTERED CUSTOMER)
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).makeSale(900001, product6, "Yýldýz Street", "374 47 24");
		System.out.println("\n");
		
		company.getAdmin().getBranch(2000).getBranchEmployee(600001).accessThePastOrder(customer2);
		System.out.println("\n");
	
	}

}
