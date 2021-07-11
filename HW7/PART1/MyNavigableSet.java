import java.util.*;
/**
 * This is the navigable set class. It keep skip list and AVL tree object.
 * I implement the required methods of NavigableSet interface.
 * I did not implement the rest.
 * 
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 * @param <E> the type parameter
 */
public class MyNavigableSet<E extends Comparable<E>> implements NavigableSet<E> {

	private SkipList<E> mySet = new SkipList<E>();	/** Skip list object*/
	private AVLTree<E> myTree = new AVLTree<E>();	/** AVL Tree object*/
	
	/**
	 * Adds the given item to the skip list
	 * @param item Item to be added
	 * @return true if given data adds to the skip list otherwise returns false
	 */
	public boolean insertSkipList(E item) {
		return mySet.add(item);
	}
	
	/**
	 * Removes the given item from the skip list.
	 * @param item Item to be removed
	 * @return true if given data removes from the skip list otherwise returns false
	 * @throws NoSuchElementException if given item is not in the skip list
	 */
	public boolean removeSkipList(E item) throws NoSuchElementException{
		if(mySet.find(item) == null)
			throw new NoSuchElementException();
		
		return mySet.remove(item);
	}
	
	/**
	 * Returns the item in the skip list as the string.
	 * @return items in the skip list
	 */
	public String toStringSkipList() {
		return mySet.toString();
	}
	
	/**
	 * Adds the given item to the AVL tree
	 * @param item Item to be inserted
	 * @return true if item adds to the AVL tree otherwise returns false
	 */
	public boolean insertAVLTree(E item) {
		return myTree.add(item);
	}
	
	/**
	 * Removes the given item from the AVL tree
	 * @param item Item to be removed
	 * @return true if given item removed from the AVL tree otherwise returns false
	 */
	public boolean removeAVLTree(E item) {
		return myTree.remove(item);
	}
	
	/**
	 * Returns the item in the skip list as the string.
	 * @return items in the AVL tree
	 */
	public String toStringAVLTree() {
		return myTree.toString();
	}
	
	/**
	 * Iterates through elements in the AVL tree
	 * @return AVL tree iterator
	 */
	@Override
	public Iterator<E> iterator(){
		return myTree.iterator();
	}
	
	/**
	 * Iterates through elements as descending order in the AVL tree
	 * @return Skip list descending iterator
	 */
	public Iterator<E> descendingIterator() {
		return mySet.iter();
	}
		
	/**
	 * Returns a view of the subset of this set whose elements are less than
	 * toData. If flag is true, the subset includes the elements toData if it exists.
	 * @param toData border element
	 * @param flag Indicates whether to add the given element
	 * @return Returns the subset from the start to the given element
	 */
	@Override
	public NavigableSet<E> headSet(E toData, boolean flag) {
		NavigableSet<E> set = new TreeSet<E>();
		if((myTree.size() == 0) || (!myTree.contains(toData)))	return null;

		Iterator<E> iter = myTree.iterator();
		
		while(iter.hasNext()) {
			E data = iter.next();
			
			if(data == toData) {
				if(flag) {
					set.add(data);
					return set;
				}
				else return set;
			}		
			else {
				set.add(data);
			}
		}
		return set;
	}
	
	/**
	 * Returns a view of the subset of this set whose elements are greater than
	 * fromData. If flag is true, the subset includes the elements toData if it exists.
	 * @param fromData border element
	 * @param flag Indicates whether to add the given element
	 * @return Returns the subset from the given element to the last
	 */
	@Override
	public NavigableSet<E> tailSet(E fromData, boolean flag) {
		NavigableSet<E> str = new TreeSet<E>();
		
		if((myTree.size() == 0) || (!myTree.contains(fromData))) return null;
		
		Iterator<E> iter = myTree.iterator();
		
		if(flag) {
			str.add(fromData);
		}
		
		while(iter.hasNext()) {
			if(iter.next() == fromData) {
				while(iter.hasNext()) {
					E data = iter.next();
					str.add(data);
				}
				return str;
			}
		}
		return str;		
	}

	/**
	 * Returns a view of the subset of this set whose elements are less than
	 * fromData.
	 * @param toData border element
	 * @return Returns the subset from the start to the given element
	 */
	@Override
	public SortedSet<E> headSet(E toData) {
		NavigableSet<E> set = new TreeSet<E>();
		if((myTree.size() == 0) || (!myTree.contains(toData)))	return null;

		Iterator<E> iter = myTree.iterator();
		
		while(iter.hasNext()) {
			E data = iter.next();
			
			if(data == toData) {
				return set;
			}		
			else {
				set.add(data);
			}
		}
		return set;
	}

	/**
	 * Returns a view of the subset of this set whose elements are greater than
	 * fromData.
	 * @param fromData border element
	 * @return Returns the subset from the given element to the last
	 */
	@Override
	public SortedSet<E> tailSet(E fromData) {
		NavigableSet<E> str = new TreeSet<E>();
		
		if((myTree.size() == 0) || (!myTree.contains(fromData))) return null;
		
		Iterator<E> iter = myTree.iterator();
		
		while(iter.hasNext()) {
			if(iter.next() == fromData) {
				while(iter.hasNext()) {
					E data = iter.next();
					str.add(data);
				}
				return str;
			}
		}
		return str;		
	}
	
	
	
	
	
	@Override
	public Comparator<? super E> comparator() {
		return null;
	}

	@Override
	public E first() {
		return null;
	}

	@Override
	public E last() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(E e) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
	}

	@Override
	public E lower(E e) {
		return null;
	}

	@Override
	public E floor(E e) {
		return null;
	}

	@Override
	public E ceiling(E e) {
		return null;
	}

	@Override
	public E higher(E e) {
		return null;
	}

	@Override
	public E pollFirst() {
		return null;
	}

	@Override
	public E pollLast() {
		return null;
	}

	@Override
	public NavigableSet<E> descendingSet() {
		return null;
	}

	@Override
	public SortedSet<E> subSet(E fromElement, E toElement) {
		return null;
	}
	
	public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
		// TODO Auto-generated method stub
		return null;
	}
}
