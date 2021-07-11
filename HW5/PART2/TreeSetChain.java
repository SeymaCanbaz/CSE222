
import java.util.TreeSet;
/**
 * 
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 * @param <K> key
 * @param <V> value
 */
public class TreeSetChain<K, V> implements KWHashMap<K,V>{
		
		private TreeSet<Entry<K,V>>[] table;
		private int numKeys;
		private static final int CAPACITY= 101;
		private static final double LOAD_THRESHOLD = 3.0;
		
		/**
		 *Contains key-value pairs for a hash table.
		 */
		@SuppressWarnings("rawtypes")
		private static class Entry <K,V> implements Comparable{
			private K key;		/** The key */
			private V value;	/** The value */
			
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
			 * Retrieves the key.
			 * @return The key
			 */
			public K getKey() {	return key;	}
			
			/**
			 * Retrieves the value.
			 * @return The value
			 */
			public V getValue()	{ return value; }
			
			/**
			 * Sets the value.
			 * @param val The new value
			 * @return The old value
			 */
			public V setValue(V val) {
				V oldVal = value;
				value = val;
				return oldVal;
			}
			
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("[" + key.toString() + " - " + value.toString() + "]");
				return sb.toString();
			}

			@Override
			public int compareTo(Object o) {
				if(o.getClass() == this.getClass()) {
					Entry<?,?> temp = (Entry<?,?>) o;
					
					if(temp.getKey().hashCode() > this.getKey().hashCode())
						return -1;
					else if(temp.getKey().hashCode() < this.getKey().hashCode())
						return 1;
					else return 0;
				}
				
				if(o.hashCode() > this.hashCode())
					return -1;
				else if (o.hashCode() < this.hashCode())
					return 1;
				else return 0;
			}
			
		}

		/**
		 * Constructor
		 */
		@SuppressWarnings("unchecked")
		public TreeSetChain() {
			table = new TreeSet[CAPACITY];
		}
		
		@Override
		public V get(Object key) {
			int index = key.hashCode() % table.length;
			if(index < 0)
				index += table.length;
			if(table[index] == null)
				return null;		//key is not in the table
			
			//Search the list at table[index] to find the key.
			for(Entry<K,V> nextItem : table[index]) {
				if(nextItem.key.equals(key))
					return nextItem.value;
			}
			return null;
		}

		@Override
		public boolean isEmpty() {
			return numKeys == 0;
		}

		@Override
		public V put(K key, V value) {
			int index = key.hashCode() % table.length;
			if(index < 0)
				index += table.length;
			if(table[index] == null) {
				//Create a new linked list at table[index]
				table[index] = new TreeSet<Entry<K,V>>();
			}
			
			//Search the list at table[index] to find the key.
			for(Entry<K,V> nextItem : table[index]) {
				//If the search is successful, replace the old value,
				if(nextItem.key.equals(key)) {
					//Replace value for this key.
					V oldVal = nextItem.value;
					nextItem.setValue(value);
					return oldVal;
				}
			}
			
			//assert: key is not in the table, add new item.
			Entry<K,V> newdata = new Entry<K,V>(key,value);
			table[index].add(newdata);
			numKeys++;
			if(numKeys > (LOAD_THRESHOLD * table.length))
				rehash();
			return null;
		}

		@Override
		public V remove(Object key) {
			int index = key.hashCode() % table.length;
			
			if(index < 0)
				index += table.length;
			
			if(table[index] == null)
				return null;
			
			V oldVal;
			
			for(Entry<K,V> nextItem : table[index]) {
				if(nextItem.getKey().equals(key)) {
					oldVal = nextItem.getValue();
					
					table[index].remove(nextItem);
					numKeys--;
					
					if(table[index].isEmpty())
						table[index] = null;
					
					return oldVal;
				}
			}
			return null;		//key is not in the table
		}

		@Override
		public int size() {
			return numKeys;
		}
	
		/**
		 * Returns the hash table capacity.
		 * @return the capacity of the hash table
		 */
		public int tableSize() {
			return table.length;
		}
		
		/**
		 * Doubles the capacity of the table.
		 */
		@SuppressWarnings("unchecked")
		private void rehash() {
			TreeSet<Entry<K,V>>[] oldTable = table;
			table = new TreeSet[2 * oldTable.length + 1];
			numKeys = 0;
			
			for(int i=0; i<oldTable.length; i++) {
				if(oldTable[i] != null) {
					for(Entry<K,V> nextItem : oldTable[i]) {
						put(nextItem.getKey(), nextItem.getValue());
					}
				}
			}
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<table.length; i++) {
				if(table[i] != null) {
					sb.append(table[i]);
					sb.append("\n");
				}
			}
			
			return sb.toString();
		}
	}
