/**
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 * @param <K> key
 * @param <V> value
 */
public class CoalescedHashMap<K,V> implements KWHashMap<K,V> {
	//Data fields
	private Entry<K,V> [] table;
	private static final int START_CAPACITY = 101;
	private double LOAD_THRESHOLD = 0.75;
	private int numKeys;
	private int numDeletes;
	private final Entry<K,V> DELETED = new Entry<K,V>(null, null);
	
	
	/**
	 *Contains key-value pairs for a hash table.
	 */
	private static class Entry <K,V> {
		private K key;		/** The key */
		private V value;	/** The value */
		private int nextIndex = -1;	/** The index of key-value */
		
		/**
		 * Creates a new key-value pairs.
		 * @param key The key
		 * @param value The value
		 */
		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		/**
		 * Retrieves the index of the next element to which it is linked.
		 * @return the index of the next element to which it is linked.
		 */
		public int getNextIndex() {	return nextIndex; }
		
		/**
		 * Retrieves the key.
		 * @return The key
		 */
		public K getKey() {	return key;	}
		
		/**
		 * Retrieves the value.
		 * @return The value
		 */
		public V getValue()	{ return value;	}
		
		/**
		 * Sets the value
		 * @param val The new value
		 * @return old value
		 */
		public V setValue(V val) {
			V oldVal = value;
			value = val;
			return oldVal;
		}
		
		/**
		 * Sets the key.
		 * @param key The new key
		 * @return The old key
		 */
		public K setKey(K key) {
			K oldKey = key;
			this.key = key;
			return oldKey;
		}
		
		/**
		 * Sets the index of next linked item.
		 * @param index The new index
		 */
		public int setNextIndex(int index) {
			int oldIndex = nextIndex;
			nextIndex = index;	
			return oldIndex;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(key.toString() + " - " + value.toString());
			return sb.toString();
		}
	}
	
	
	
	/**
	 * Constructor
	 */
	@SuppressWarnings("unchecked")
	public CoalescedHashMap() {
		table = new Entry[START_CAPACITY];
	}
	
	@Override
	public int size() {
		return numKeys;
	}
	
	@Override
	public boolean isEmpty() {
		return numKeys == 0;
	}
	
	
	@Override
	public V get(Object key) {
		//Find the first table element that is empty
		//or the table element that contains the key.
		int index = getIndexOf(key);
		
		//If the search is successful, return the value.
		if(table[index] != null)
			return table[index].value;
		else return null;	// key not found.
	}
	
	/**
	 * Finds either the target key or the first empty slot in the
	 * search chain using linear probing
	 * pre: The table is not full.
	 * @param key The key of the target object.
	 * @return The position of the target or the first empty slot
	 * 			if the target is not in the table.
	 */
	public int getIndexOf(Object key) {		
		// Calculate the starting index.
	    int index = key.hashCode() % table.length;
	    if (index < 0)
	      index += table.length; // Make it positive.

	    // Increment index until an empty slot is reached
	    // or the key is found.
	    
	    while ((table[index] != null) && (!key.equals(table[index].key))) {
	    	
	      index++;
	      // Check for wraparound.
	      if (index >= table.length)
	        index = index % table.length; // Wrap around.
	    }
	    
	    return index;
	    
		/*	for(int i=0; i<table.length; i++) {
				if((table[i] != null) && (key.equals(table[i].key)))
					return i;
			}
			return -1;	
		*/   
	}
	
	@Override
	public V remove(Object key) {
		int index = delete(key);	//finds the index of the deleted item
		
		if(table[index] == null) return null;
		
		V oldValue = table[index].value;
		table[index] = null;
		numKeys--;
		
		return oldValue;
	
	}
	
	/**
	 * Finds the index of the deleted key.
	 * @param key The key to be removed.
	 * @return The index of the key to be deleted.
	 */
	private int delete(Object key) {
		
		int index = key.hashCode() % table.length;
		if(index < 0) index += table.length;
		
		int target = index;
		int j=0;
		int prevIndex = -1;
		
		while ((table[target] != null) && (!key.equals(table[target].key))) {
			prevIndex = target;
			target = (index + j*j) % table.length;
			j++;
		}
		index = target;
		
		//not linked key
		if(prevIndex == -1 && table[index].getNextIndex() == -1) {
			return index;
		}
		
		//if deleted key has previous and next key,
		//shift the next linked key to the index of the deleted key.
		else if (table[index].getNextIndex() != -1) {
			while(table[index].getNextIndex() != -1) {
				int next = table[index].getNextIndex();
				move(index, next);
				prevIndex = index;
				index = next;
			}
			table[prevIndex].setNextIndex(-1);
			return index;
		}
		
		//deleted key has just the previous key,
		//set the next key of the previous key is null
		else {
			table[prevIndex].setNextIndex(-1);
			return index;
		}
	}
	
	/**
	 * Helper method of the delete method.
	 * Moves the key of the given index to other given index.
	 */
	private void move(int index1, int index2) {
		table[index1].setKey(table[index2].getKey());
		table[index1].setValue(table[index2].getValue());		
	}

	@Override
	public V put(K key, V value) {
		//Find the first table element that is empty
		//or the table element that contains the key.
		int index = find(key);
		//If an empty element was found, insert new entry.
		if(table[index] == null) {
			table[index] = new Entry<K,V>(key, value);
			numKeys++;
			
			//Check whether rehash is needed.
			double loadFactor = (double) (numKeys + numDeletes) / table.length;
			if(loadFactor > LOAD_THRESHOLD)
				rehash();
			return null;
		}
		
		//assert: table element that contains the key was found.
		//Replace value for this key.
		V oldVal = table[index].value;
		table[index].value = value;
		return oldVal;
	}
	
	/**	
	 * Expands table size when loadFactor exceeds LOAD_THRESHOLD
	 * post:	The size of table is doubled and is an odd integer.
	 * 			Each nondeleted entry from the original table is
	 * 			reinserted into the expanded table.
	 * 			The value of numKeys is reset to the number of items
	 * 			actually inserted; numDeletes is reset to 0;
	 */
	@SuppressWarnings("unchecked")
	private void rehash() {
		//Save a reference to oldTable.
		Entry<K,V> [] oldTable = table;
		//Double capacity of this table.
		table = new Entry[2 * oldTable.length + 1];
		
		//Reinsert all items ,n oldTable into expanded table.
		numKeys = 0;
		numDeletes = 0;
		for(int i=0; i<oldTable.length; i++) {
			if((oldTable[i] != null) && (oldTable[i] != DELETED)) {
				//Insert entry in expanded table
				put(oldTable[i].getKey(), oldTable[i].getValue());
			}
		}
	}
	
	/**
	 * With this method, the index to which the key should be added is found.
	 * If there is a collision, an empty index is found using quadratic research and the collisions are
	 * linked together. If the key has been added before, it returns the index to which it was added.
	 * @param key The key to be find
	 * @return index of the key if already added in the table, otherwise
	 * 			returns the index where key will be added to the table.
	 */
	private int find(Object key) {
		//Calculate the starting index.
		int index = key.hashCode() % table.length;
		if(index < 0)
			index += table.length;
		
		int prevIndex = -1;
		int i=0;
		int target = index;	//the index to which the data is to be added
		
		while((table[target] != null) && (!key.equals(table[target].key))) {
			
			//if table[target] has no next element, it keeps the current index as the "previous index" value.
			if(table[target].getNextIndex() == -1)
				prevIndex = target;
			
			target = (index + (i*i)) % table.length;	//calculates the index using quadratic probing
			i++;	
		}
		
		//If the previous item is not empty and the next item of the previous item is empty,
		//the target index is set to the next of the previous item.
		if((prevIndex != -1) && (table[prevIndex].getNextIndex() == -1)) {	
			table[prevIndex].setNextIndex(target);
		}
		
		return target;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<table.length; i++) {
			if(table[i] != null) {
				sb.append("Index: " + i + "\tKey: " + table[i].getKey() + "\t\tValue: " + table[i].getValue() + "\tNextIndex: " + table[i].getNextIndex());
				sb.append("\n");
			}
			else {
				sb.append("Index: " + i + "\tKey: " + null + "\tValue: " + null + "\tNextIndex: " + null);
				sb.append("\n");
			}		
			
		}	
		return sb.toString();
	}
	

}
