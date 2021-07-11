import java.util.*;

/**
 * This class iterates the given hashMap.
 * 
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 * @param <K> key
 * @param <V> value
 */
public class MapIterator<K,V> {
	private K[] table = null;	/**hashMap items*/
	int index = 0;	/**current index*/	
	int counter=0;	/**counts to check whether all elements are iterated*/
	
	
	/**
	 * Constructor, index starts from 0
	 * @param hash hash map will be iterated
	 */
	@SuppressWarnings("unchecked")
	public MapIterator(HashMap<K,V> hash) {
		table = (K[]) hash.keySet().toArray();
		
		if(table.length == 0)
			throw new NoSuchElementException("Hash map is empty");
	}
	
	/**
	 * Constructor, index starts from the index of the given key
	 * @param hash hash map will be iterated
	 * @param key the start index of the item to be iterated
	 */
	@SuppressWarnings("unchecked") 
	public MapIterator(HashMap<K,V> hash, K key) {
		
		table = (K[]) hash.keySet().toArray();
		
		if(table.length == 0)
			throw new NoSuchElementException("Hash map is empty");
		
		for(int i=0; i<table.length; i++) {
			if(key.equals(table[i])) {
				index = i;
			}		
		}
	}
	
	/**
	 * Checks if the next key is present.
	 * @return false if the counter is less than the table size
	 */
	public boolean hasNext() {
		return counter < table.length;
	}
	
	/**
	 * Returns the next key
	 * @return the next key
	 */
	public  K next() {
		if(!hasNext()) throw new NoSuchElementException();

		K returnedItem = table[index];
		index++;
		counter++;
		
		if((index == table.length) && (counter != table.length)) {	
			index = 0;
		}
		
		return returnedItem;
	}
	
	/**
	 * Checks if the previous key is present
	 * @return false if the counter is less than 0
	 */
	public boolean hasPrevious() {
		return counter != 0;
	}
	
	/**
	 * Gets the previous key
	 * @return the previous key
	 */
	public K previous() {
		if(!hasPrevious()) throw new NoSuchElementException();
		
		K returnedItem = table[index-1];
		
		index--;
		counter--;
		
		if((index == 0) && (counter != 0)) {
			index = table.length-1;
		}
		
		return returnedItem;
	}
	

}
