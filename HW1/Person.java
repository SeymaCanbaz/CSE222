/**
 * This is the interface of the users of the system.
 * @author seyma
 *
 */
public interface Person {
	/**
	 * Gets the person ID.
	 * @return person ID
	 */
	int getID();
	
	/**
	 * Sets the user ID.
	 * @param ID person ID
	 */
	void setID(int ID);
	
	/**
	 * Gets the person name.
	 * @return person name
	 */
	String getName();
	
	/**
	 * Sets the person name.
	 * @param name person name
	 */
	void setName(String name);
	
	/**
	 * Gets the person surname.
	 * @return person surname
	 */
	String getSurname();
	
	/**Sets the person surname.
	 * @param surname person surname
	 */
	void setSurname(String surname);
	
}
