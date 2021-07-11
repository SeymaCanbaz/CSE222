import java.util.NoSuchElementException;

/**
 * 
 * @author seyma
 * This is the administrator class
 */
public class Admin extends OfficeFurnitureSystem implements Person {

	private int ID;	
	private String name;
	private String surname;
	
	/**
	 * Constructor
	 * @param ID administrator ID
	 * @param name administrator name
	 * @param surname administrator surname
	 */
	public Admin(int ID, String name, String surname) {
		super();
		this.ID = ID;
		this.name = name;
		this.surname = surname;
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
	 * Returns the number of branch in this company.
	 * @return number of branch
	 */
	public int getNumberOfBranch() {
		return branch.length;
	}

	/**
	 * Administrator adds the new branch in company.
	 * Checks branch ID. If the branch ID already exists,
	 * throws exception. Else admin adds.
	 * @param newBranch Branch to be added
	 * @throws NoSuchElementException if the branch is already exist.
	 */
	public void addBranch(Branch newBranch) throws NoSuchElementException{
		int flag = 0;

		if(branch.length == 0) {
			branch = new Branch[1];
			branch[0] = newBranch;
			System.out.println(newBranch.getName() + " is added");
		}
		else {
			for(int i=0; i<branch.length; i++) {
				if(branch[i].getID() == newBranch.getID())
					flag++;
			}
			
			if(flag != 0) {
				throw new NoSuchElementException(newBranch.getName() + " branch is already added!");
			}
			else {
				Branch[] temp = new Branch[branch.length];
				for(int i=0; i<branch.length; i++)
					temp[i] = branch[i];
				
				branch = new Branch[branch.length+1];
				for(int i=0; i<temp.length; i++)
					branch[i] = temp[i];
				branch[branch.length-1] = newBranch;
				
				System.out.println(newBranch.getName() + " is added");
			}
		}
	}
	
	/**
	 * Administrator removes the branch in company.
	 * Checks branch ID. If the branch ID is in, removes.
	 * Else throws exception.
	 * @param removedBranch Branch to be removed.
	 * @throws NoSuchElementException throws exception
	 */
	public void removeBrach(Branch removedBranch) throws NoSuchElementException {
		int flag = 0;
		int index = -1;
		
		if(branch.length == 0)
			return;
		
		else {
			for(int i=0; i<branch.length; i++) {
				if(branch[i].getID() == removedBranch.getID()) {
					flag++;
					index = i;
				}
			}
			
			if(flag == 0)
				throw new NoSuchElementException("There is no branch called " + removedBranch.getName());
			else {
				for(int i=index; i<branch.length-1; i++) {
					branch[i] = branch[i+1];
				}
				
				Branch[] temp = new Branch[branch.length-1];
				for(int i=0; i<temp.length; i++)
					temp[i] = branch[i];
				
				branch = new Branch[branch.length-1];
				for(int i=0; i<branch.length; i++)
					branch[i] = temp[i];
				
				System.out.println(removedBranch.getName() + " branch is removed");
			}
		}
	}
	
	/**
	 * Administrator adds the new branch employee to the given branch.
	 * If the branch employee already exist, throws the exception.
	 * Otherwise admin adds.
	 * @param newEmployee Branch employee to be added to the branch.
	 * @param branchID Branch ID to add the new employee.
	 * @throws NoSuchElementException if the employee already exists.
	 */
	public void addBranchEmployee(BranchEmployee newEmployee, int branchID) throws NoSuchElementException {
		//todo
		for(Branch br : branch) {
			if(br.getID() == branchID) {
				if(br.BE.length == 0) {
					br.BE = new BranchEmployee[1];
					br.BE[0] = newEmployee;
					System.out.println(newEmployee.getName() + " " + newEmployee.getSurname() + " employee added in this branch");
				}
				else {
					int flag = 0;
					for(int i=0; i<br.BE.length; i++) {
						if(br.BE[i].getID() == newEmployee.getID())
							flag++;
					}
					if(flag != 0)
						throw new NoSuchElementException(newEmployee.getName() + " " + newEmployee.getSurname() + " employee is already added in this branch!");
					else {
						BranchEmployee[] temp = new BranchEmployee[br.BE.length];
						for(int i=0; i<br.BE.length; i++)
							temp[i] = br.BE[i];
						
						br.BE = new BranchEmployee[br.BE.length+1];
					//	int i;
						for(int i=0; i<temp.length; i++)
							br.BE[i] = temp[i];
		
						br.BE[br.BE.length-1] = newEmployee;	//****
					//	br.BE[i] = newEmployee;
						
						System.out.println(newEmployee.getName() + " " + newEmployee.getSurname() + " employee added in this branch");
					}
				}
			}
		}
	}
	
	/**
	 * Administrator removes the branch employee to the given branch.
	 * If the branch employee already exist, admin remove the employee.
	 * Otherwise admin does not remove. 
	 * @param removedEmployee Branch employee to be removed to the branch.
	 * @param branchID  Branch ID to remove the employee.
	 */
	public void removeBranchEmployee(BranchEmployee removedEmployee, int branchID) {
		//todo
		for(Branch inBranch : branch) {
			if(inBranch.getID() == branchID) {
				if(inBranch.BE.length == 0)
					return;
				
				else {
					int flag = 0;
					int index = -1;
					
					for(int i=0; i<inBranch.BE.length; i++) {
						if(inBranch.BE[i] == removedEmployee) {
							flag++;
							index = i;
						}
					}
					if(flag != 0) {
						for(int i=index; i<inBranch.BE.length-1; i++)
							inBranch.BE[i] = inBranch.BE[i+1];
						
						BranchEmployee[] temp = new BranchEmployee[inBranch.BE.length-1];
						for(int i=0; i<temp.length; i++)
							temp[i] = inBranch.BE[i];
						
						inBranch.BE = new BranchEmployee[temp.length];	//****
						for(int i=0; i<inBranch.BE.length; i++)
							inBranch.BE[i] = temp[i];
						
						System.out.println(removedEmployee.getName() + " " + removedEmployee.getSurname() + " employee is removed in this branch.");
					}	
					else {
						System.out.println("There is no employee callled " + removedEmployee.getName());
					}
				}
			}	
		}	
	}
}
