import java.util.ArrayList;
import java.util.Comparator;

/**
 * This is the maxHeap class.
 * @author ÞEYMA NUR CANBAZ 171044076

 */
public class MaxHeap<E>{
	
	private ArrayList<E> heap;
	private ArrayList<Integer> numberOfItem;	/** number of occurrences of each data*/
	private Comparator<E> comparator;	/** for comparing */
	
	
	/**
	 * No paramater constructor
	 */
	protected MaxHeap() {
		heap = new ArrayList<E>();
		numberOfItem = new ArrayList<Integer>();
	}
	
	/**
	 * Sets the given data in heap and increases the number of occurrences of data.
	 * @param data Item to be setted
	 */
	public void setData(E data) {
		heap.add(data);
		int index = heap.indexOf(data);
		numberOfItem.set(index, (numberOfItem.get(index)+1));
	}
	
	/**
	 * Sets the number of occurences in given index.
	 * @param index Index of the data to be sets.
	 * @param data Number of occurrence to be setted.
	 */
	public void setNumberOfItem(int index, int data) {
		numberOfItem.set(index, data);
	}
	
	/**
	 * Gets the data of given index.
	 * @param index Index of the data to be returned
	 * @return Data in given index
	 */
	public E getData(int index) {
		return heap.get(index);
	}
	
	/**
	 * Gets the number of occurrences of given index
	 * @param index Index of the data to be returned
	 * @return Data in given index
	 */
	public int getNumberOfItem(int index) {
		return numberOfItem.get(index);
	}
	
	/**
	 * Returns the heap size
	 * @return heap size
	 */
	public int getHeapSize() { 
		return heap.size();
	}
	
	/**
	 * Adds the given data in the heap.
	 * @param item Item to be added in the heap
	 * @param counter Number of occurrences of the given data
	 * @return true
	 */
	public boolean addData(E item, int counter) {
		
		if(heap.isEmpty()) {
			heap.add(item);
			numberOfItem.add(1);
			return true;
		}
		
		heap.add(item);
		numberOfItem.add(counter);
		move(heap.size()-1);
		
		return true;
	}
	
	/**
	 * Moves up the element at the given index if it is greater than the its parent.
	 * @param index Index of the element to be moved.
	 */
	private void move(int index) {
		int child = index;
		int parent = (child-1)/2;
		
		while(parent>=0 && compare(heap.get(child), heap.get(parent)) > 0) {
			swap(child, parent);
			child = parent;
			parent = (child-1)/2;
		}
	}
	
	/**
	 * Replaces the elements in the given indices.
	 * @param index1 First index
	 * @param index2 Second index
	 */
	private void swap(int index1, int index2) {
		
		//swap heap items 
		E temp1 = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp1);
		
		//swap numberOfItems
		int temp2 = numberOfItem.get(index1);
		numberOfItem.set(index1, numberOfItem.get(index2));
		numberOfItem.set(index2, temp2);
		
	}
	
	/**
	 * Removes the given item to the heap and removes its number of occurrences
	 * to the numberOfItem.
	 * @param index Index of data to be removed.
	 * @return removed data
	 * @throws IndexOutOfBoundsException if given index is out of bounds
	 */
	public E removeData(int index) throws IndexOutOfBoundsException{
		if(index >= heap.size() || heap.isEmpty())
			throw new IndexOutOfBoundsException();
	
		E result = heap.get(0);
		
		if(heap.size() == 1) {
			heap.remove(0);
			numberOfItem.remove(0);
			return result;
		}
		
		result = heap.get(index);
		
		heap.set(index, heap.get(heap.size()-1));
		numberOfItem.set(index, numberOfItem.size()-1);
		
		heap.remove(heap.size()-1);
		numberOfItem.remove(numberOfItem.size()-1);
		
		move2(index);
		
		return result;
	}
	
	/**
	 * After removed an item, moves the element at the given index if it is greater than the its parent.
	 * @param parent Index of the element to be moved.
	 */
	private void move2(int parent) {
		while(true) {
			int leftChild = 2*parent+1;
			int rightChild = leftChild+1;
			int maxChild = leftChild;
			
			if(leftChild >= heap.size()) {
				break;
			}
			
			if(rightChild < heap.size() && compare(heap.get(rightChild), heap.get(leftChild)) > 0) {
				maxChild = rightChild;
			}
			
			if(compare(heap.get(maxChild), heap.get(parent)) > 0) {
				swap(parent, maxChild);
				parent = maxChild;
			}
			else {
				break;
			}		
		}	
	}
	
	/**
	 * Find the largest number of occurrences of data in the heap and returns it
	 * @return max maximum number of occurrence
	 */
	public int findModeHeap() {
		int max = numberOfItem.get(0);
		
		for(int i=1; i<numberOfItem.size()-1; i++) {
			if(max < numberOfItem.get(i))
				max = numberOfItem.get(i);
		}
			
		return max;
	}
	
	/**
	 * Checks if the given item is in the heap or not
	 * @param item Item to be searched.
	 * @return true if it is in, otherwise returns false
	 */
	public boolean isInThere(E item) {
		int temp = heap.indexOf(item);
		
		if(temp == -1) {
			return false;
		}else return true;
	}

	/**
	 * Returns the index of the given item in the heap.
	 * @param item Item to be find the index
	 * @return index of the given item
	 */
	public int getIndexOf(E item) {
		return heap.indexOf(item);
	}

	/**
	 * Returns the index of the given item in the number of item.
	 * @param item Item to be find the index
	 * @return index of the given item
	 */
	public int getIndexOfItem(int item) {
		return numberOfItem.indexOf(item);
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for(int i=0; i<heap.size(); i++) {
			str += heap.get(i) + "." + numberOfItem.get(i) + " ";
		}
		str += "\n";
		
		return str; 
	}
	/**
	 * Compares the given to item
	 * @param obj1 Item to be compared
	 * @param obj2 Second item to be compared
	 * @return 0 if equal, 1 if obj1 is greater than obj2, otherwise -1
	 */
	@SuppressWarnings("unchecked")
	public int compare(E obj1, E obj2) {
		if(comparator != null) {
			return comparator.compare(obj1, obj2);
		}
		else {
			return ((Comparable<E>) obj1).compareTo(obj2);
		}
	}




}
