/**
 * Searchable tree interface
 * @author Koffman and Wolfgang 
 */
public interface SearchTree<E> {
	/***
	 * Inserts item where it belongs in the tree. Returns true if item is inserted; false if it isn't (already in tree)
	 * @param item The item to be added
	 * @return True if item is inserted; otherwise false
	 */
	public boolean add(E item);
	
	/**
	 * Returns true if the target is found in the tree
	 * @param target The item searched for
	 * @return True if target is found; otherwise false
	 */
	public boolean contains(E target);
	
	/**
	 * Returns a reference to the data in the node that is equal o target. If no such node is found, returns null
	 * @param target The data we are searching for
	 * @return The data if we find it; null otherwise
	 */
	public E find(E target);
	
	/**
	 * Removes target (if found) from tree and returns true; otherwise returns false
	 * @param target The target we want to remove
	 * @return True if removed; false otherwise
	 */
	public boolean remove(E target);
}
