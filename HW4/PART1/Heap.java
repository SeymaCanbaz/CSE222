import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

/**
 * This class is the heap class.
 * 
 * @author ÞEYMA NUR CANBAZ 171044076
 * @param <E> generic
 */
public class Heap<E> {
	
	/**Heap to hold the data*/
	ArrayList<E> data;
	
	/**An optional reference to a Comparator object*/
	Comparator<E> comparator;
	
	/**
	 * Constructor
	 */
	public Heap() {
		data = new ArrayList<E>();
	}
	
	/**
	 * Constructor, if comparator object given
	 * @param comp comparator
	 */
	public Heap(Comparator<E> comp) {
		data = new ArrayList<E>();
		comparator = comp;
	}
	
	/**
	 * Returns the data in the given index in the heap.
	 * @param index index of to be returned element.
	 * @return The data in the given index
	 */
	public E getData(int index) {
		return data.get(index);
	}
	
	/**
	 * Returns the heap size
	 * @return heap size
	 */
	public int getSize() {
		return data.size();
	}
	
	/**
	 * Adds the new item in the last index of the heap and calls move method for reheap.
	 * @param item Item to be added in the heap
	 */
	public void add(E item) {
		
		if(data.isEmpty()) {
			data.add(item);
			return;
		}
		
		data.add(item);
		move(data.size()-1);
	}
	
	/**
	 * Moves up the element at the given index if it is greater than the its parent.
	 * @param index Index of the element to be moved.
	 */
	private void move(int index) {
		int child = index;
		int parent = (child-1)/2;
		
		while(parent>=0 && compare(data.get(child), data.get(parent)) > 0) {
			swap(child, parent);
			child = parent;
			parent = (child-1)/2;
		}
	}
	
	/**
	 * Removes index the largest element from the heap
	 * @param index Index of which largest element to delete
	 * @return removed element if heap is not null
	 * @throws IndexOutOfBoundsException if heap is empty
	 */
	@SuppressWarnings("unchecked")
	public E removeIndex(int index) throws IndexOutOfBoundsException{
		if(index >= data.size() || data.isEmpty())
			throw new IndexOutOfBoundsException();
		
		E[] tempArr = (E[]) new Object[data.size()];	//copy of heap
		
		for(int i=0; i<data.size(); i++) {
			tempArr[i] = data.get(i);
		}
		
		//Sorts the heap for finds the largest index th element
 		sort(tempArr);
 		
 		E findValue = null;
 		
 		for(int i=0; i<tempArr.length; i++) {
 			if(index-1 == i)
 				findValue = tempArr[i];	//Finds the value to be removed.
 		}
 		
 		int newIndex = data.indexOf(findValue);
 		
 		E temp = data.get(newIndex);
		
		data.set(newIndex, data.get(data.size()-1));
		data.remove(data.size()-1);
		
		for(int i=newIndex; i<data.size(); i++){	//reheap
			move(i);
		}
		
		return temp;
	}
		
	/**
	 * Finds the given element in heap.
	 * @param item Element to find
	 * @return if the element is in the heap returns true, else returns false
	 */
	public boolean find(E item) {
		boolean flag = false;
		
		for(int i=0; i<data.size(); i++) {
			if(compare(item, data.get(i)) == 0)
				flag = true;
		}
		return flag;
	}
	
	/**
	 * Merges the two heap
	 * @param other heap object to be merged
	 */
	public void merge(Heap<E> other) {
		for(int i=0; i<other.getSize(); i++) {
			data.add(other.getData(i));
			move(data.size()-1);
		}
	}
	
	/**
	 * Sets the given element in the heap. This method uses HeapIterator
	 * and uses its set method.
	 * @param item Element to be added.
	 */
	public void set(E item) {
		HeapIterator<E> iter = iterator();
		
		iter.set(item);
	}
	
	/**
	 * Sorts the given array largest to smallest.
	 * @param arr Array to be sorted.
	 */
	private void sort(E[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(compare(arr[i], arr[j]) < 0) {
					//swap
					E temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public int compare(E left, E right) {
		if(comparator != null) {
			return comparator.compare(left, right);
		}
		else {
			return ((Comparable<E>) left).compareTo(right);
		}
	}
	
	/**
	 * Replaces the elements in the given indices.
	 * @param index1 First index
	 * @param index2 Second index
	 */
	private void swap(int index1, int index2) {
		E temp = data.get(index1);
		data.set(index1, data.get(index2));
		data.set(index2, temp);
	}
	
	/**
	 * Prints the heap
	 */
	public void print() {
		
		for(int i=0; i<data.size(); i++) {
			System.out.print(data.get(i) + "  ");
		}
		System.out.println();
	
	}
	
	/**
	 * Returns the iterator
	 * @return returns the heapIterator
	 */
	public HeapIterator<E> iterator(){
		return new HeapIterator<E>();
	}
	
	/**
	 * This is the inner iterator class.
	 * 
	 * @param <E> generic
	 */
	@SuppressWarnings("hiding")
	private class HeapIterator<E> {
		
		private ListIterator<E> iter;
		
		/**
		 * Constructor
		 */
		@SuppressWarnings("unchecked")
		private HeapIterator() {
			iter = (ListIterator<E>) data.listIterator(0);
		}
		
		/**
		 * Sets the given element to the end of the heap and reheap.
		 * @param item Element to be added
		 */
		private void set(E item) {
			while(iter.hasNext()) {
				iter.next();
			}
			
			iter.add(item);
			move();
		}
		
		/**
		 * Moves up the element at the given index if it is greater than the its parent.
		 * @param index Index of the element to be moved.
		 */
		private void move() {
			int index = data.size()-1;
			int child = index;
			int parent = (child-1)/2;
			
			while(parent>=0 && compare(data.get(child), data.get(parent)) > 0) {
				swap(child, parent);
				child = parent;
				parent = (child-1)/2;
			}
		}
		
	}
	
}
