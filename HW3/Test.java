/**
 * This class is the test class
 * @author seyma
 *
 */
public class Test {

	/**
	 * Main class
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
			company.getAdmin().removeBranch(b3);
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
			company.getAdmin().removeBranch(b3);	//throws exception
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("\n");

		BranchEmployee BE = new BranchEmployee(600000, "Ali", "CANBAZ", b1.getID(), b1.getName(), b1.getAddress());
		BranchEmployee BE2 = new BranchEmployee(600001, "Gülay", "CAN", b2.getID(), b2.getName(), b2.getAddress());
		BranchEmployee BE3 = new BranchEmployee(600002, "Zeynep", "YILDIZ", b1.getID(), b1.getName(), b1.getAddress());
		
	
		//ADD BRANCH EMPLOYEE
		company.getAdmin().addBranchEmployee(BE, b1);	
		company.getAdmin().addBranchEmployee(BE2, b2);
		company.getAdmin().addBranchEmployee(BE3, b1);		
		System.out.println("\n");
		
		//REMOVE BRANCH EMPLOYEE
		company.getAdmin().removeBranchEmployee(BE3, b1.getID());
		System.out.println("\n");

		//ADD SAME EMPLOYEE IN THE SAME BRANCH
		try {
			company.getAdmin().addBranchEmployee(BE2, b2);
		}
		catch(Exception e) {
			System.out.println(e);
		}

		//REMOVE BRANCH EMPLOYEE (DOES NOT EXIST)
	//	company.getAdmin().removeBranchEmployee(BE3, b1.getID());	//throws exception
		System.out.println("\n");
		
		Product product1 = new Product(5555, "bookcase", "model2", "white", b1.getName());
		Product product2 = new Product(5565, "bookcase", "model1", "black", b1.getName());
		Product product3 = new Product(5575, "bookcase", "model2", "green", b1.getName());
		Product product4 = new Product(5275, "meetingTable", "model2", "grey", b2.getName());
		Product product5 = new Product(5175, "officeChair", "model1", "white", b2.getName());
		Product product6 = new Product(6175, "officeChair", "model2", "black", b2.getName());
		
		//ADD PRODUCT
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).addProduct(product1);
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).addProduct(product2);
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).addProduct(product3);
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).addProduct(product4);
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).addProduct(product5);
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).addProduct(product6);
		System.out.println("\n");
		

		//INQUIRE THE STOCK (BY ADMIN)
		System.out.println(company.getAdmin().getBranch(2000).getBranchEmployee(600000).getAllProducts());		
		System.out.println(company.getAdmin().getBranch(2001).getBranchEmployee(600001).getAllProducts());		
		
				
		//REMOVE PRODUCT
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).removeProduct(product1);
		System.out.println("\n");
		
		//ADD PRODUCT(SAME ID)
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).addProduct(product2);
		
		//REMOVE PRODUCT (DOES NOT EXIST)
//		company.getAdmin().getBranch(2000).getBranchEmployee(600000).removeProduct(product1);	 //throws exception
		
		System.out.println("\n");
		Customer customer1 = new Customer(900000, "Cansu", "Tan");
		Customer customer2 = new Customer(900001, "Zeynep", "Sevim");
		
		//ADD CUSTOMER
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).addCustomer(customer1, "cansu@email.com", "12345");		
//		System.out.println(company.getCustomer(900000).getEmail() + " " + company.getCustomer(900000).getPassword());
		
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).addCustomer(customer2, "zeynep@email.com", "zeynep");		
//		System.out.println(company.getCustomer(900001).getEmail() + " " + company.getCustomer(900001).getPassword());
		
		System.out.println("\n");
		
		
		//ADD CUSTOMER(SAME CUSTOMER ID)
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).addCustomer(customer1, "cansu@email.com", "12345");
		System.out.println("\n");

		//SEE THE LIST OF PRODUCT (CUSTOMER)
		System.out.println("******LIST OF THE PRODUCT*******");
		System.out.println(company.getAdmin().getBranch(2000).getBranchEmployee(600000).getAllProducts());		
		System.out.println(company.getAdmin().getBranch(2001).getBranchEmployee(600001).getAllProducts());		
		
		
		//CUSTOMER SEARCH THE PRODUCT (DOES NOT EXIST)
		company.getCustomer(900001).searchProduct(6175);
		System.out.println("\n");
		
		//ADD PRODUCT
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).addProduct(product4);
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).addProduct(product5);
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).addProduct(product6);
		System.out.println("\n");
		
		//SHOPPING ONLINE
		company.getCustomer(900001).shopOnline(product5, 600001, "Ceviz Street NO:15", "777 77 77");
			
		//ACCESS THE PAST ORDER (BY EMPLOYEE)
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).accessThePastOrder(customer2);
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
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).makeSale(9000, product6, "Yýldýz Street", "374 47 24");
		System.out.println("\n");
		
		//SHOP IN BRANCH (WITH REGISTERED CUSTOMER)
		company.getAdmin().getBranch(2001).getBranchEmployee(600001).makeSale(900001, product6, "Yýldýz Street", "374 47 24");
		System.out.println("\n");
		
		company.getAdmin().getBranch(2000).getBranchEmployee(600000).accessThePastOrder(customer2);
		System.out.println("\n");
		
	}
}		
