/**
 * This is the interface of the users of the system.
 * @author Þeyma Nur Canbaz
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
	 * Gets the name of the person.
	 * @return person name
	 */
	String getName();
	
	/**
	 * Sets the name of the person.
	 * @param name person name
	 */
	void setName(String name);
	
	/**
	 * Gets the surname of the person.
	 * @return person surname
	 */
	String getSurname();
	
	/**Sets the surname of the person.
	 * @param surname person surname
	 */
	void setSurname(String surname);
	
}
