import java.util.NoSuchElementException;
/**
 * 
 * @author seyma
 * This is the administrator class
 */
public class Admin extends OfficeFurnitureSystem implements Person{
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
		return branches.size();
	}

	/**
	 * Administrator adds the new branch in company.
	 * Checks branch ID. If the branch ID already exists,
	 * throws exception. Else admin adds.
	 * @param newBranch Branch to be added
	 * @throws NoSuchElementException if the branch is already exist.
	 */
	public void addBranch(Branch newBranch){
		if(branches.indexOf(newBranch) != -1)
			System.out.println(newBranch.getName() + " branch is already added!");
		else {
			branches.addLast(newBranch);
			System.out.println(newBranch.getName() + " branch is added");
		}
	}
	
	/**
	 * Administrator removes the branch in company.
	 * Checks branch ID. If the branch ID is in, removes.
	 * Else throws exception.
	 * @param removedBranch Branch to be removed.
	 * @throws NoSuchElementException throws exception
	 */
	public void removeBranch(Branch removedBranch) throws NoSuchElementException {
		
		if(branches.indexOf(removedBranch) == -1)
			throw new NoSuchElementException(removedBranch.getName() + " branch not found");
		else {
			branches.remove(removedBranch);
			System.out.println(removedBranch.getName() + " branch is removed");
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
	public void addBranchEmployee(BranchEmployee newEmployee, Branch branch) {
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getID() == branch.getID()) {
				if(branches.get(i).isEmployeeHere(newEmployee.getID())) {
					System.out.println(newEmployee.getName() + " " + newEmployee.getSurname() + " employee is already addded in this branch");	
				}
				else {
					branches.get(i).employee.add(newEmployee);
					System.out.println(newEmployee.getName() + " " + newEmployee.getSurname() + " employee is added");
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
	public void removeBranchEmployee(BranchEmployee removedEmployee, int branchID) throws NoSuchElementException {
		int flag = 0;
		for(int i=0; i<branches.size(); i++) {
			if(branches.get(i).getID() == branchID) {
				if(branches.get(i).isEmployeeHere(removedEmployee.getID())) {
					int index = branches.get(i).employee.indexOf(removedEmployee);
					branches.get(i).employee.remove(index);
					System.out.println(removedEmployee.getName() + " " + removedEmployee.getSurname()
										+ " employee is removed");
					flag++;
				}
			}
		}
		if(flag == 0)
			throw new NoSuchElementException("Employee is not in this branch!");
	}
}
