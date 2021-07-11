/**
 * KWHashMap interface
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 * @param <K> key
 * @param <V> value
 */
public interface KWHashMap <K,V> {
	/**
	 *  Returns the value associated with the specified key.
	 *  Returns null if the key is not present.
	 * @param key Specified key
	 * @return The value associated with this key if found,
	 * otherwise null.
	 */
	V get(Object key);
	
	/**
	 * Returns true if this table contains no key-value mapping.
	 * @return True if the table is empty.
	 */
	boolean isEmpty();
	
	/**
	 * Associates the specified value with specified key.
	 * @param key Specified key
	 * @param value Specified value
	 * @return The previous value associated with the specified key,
	 * or null if there was no mapping for the key.
	 */
	V put(K key, V value);
	
	/**
	 * Removes the mapping for this key from this table if it is present.
	 * @param key The key being removed
	 * @return The previous value associated with the specified key, 
	 * or null if there was no mapping.
	 */
	V remove(Object key);
	
	/**
	 * Size of the table.
	 * @return The size of the table.
	 */
	int size();

}
