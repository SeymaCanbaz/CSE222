/**
 * This is the heap tree class.
 * 
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 * @param <E> generic type
 */
public class BSTHeapTree<E> {
	
	/**
	 * This is the node class.
	 *
	 */
	@SuppressWarnings("hiding")
	private class Node<E> {
		
		private MaxHeap<E> heap;
		private Node<E> left = null;
		private Node<E> right = null;
		
		/**
		 * No parameter constructor
		 */
		private Node() {
			heap = new MaxHeap<E>();
		}
		
		/**
		 * Constructor
		 * @param item item to be added
		 */
		private Node(E item) {
			heap = new MaxHeap<E>();
			heap.addData(item, 1);
		}
	}
	
	/**
	 * root of the tree
	 */
	Node<E> root;
	
	/**
	 * This is the number of occurrence information of data
	 */
	int itemCounter = 0;
	
	
	/**
	 * Constructor
	 */
	public BSTHeapTree() {
		root = null;
	}
	
	/**
	 * For printing the tree
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		preOrderTraverse(root, 1, sb);
		return sb.toString();
	}
	
	/**
	 * Helper method for toString. This method traverses all tree.
	 * @param node The node will be traverse.
	 * @param depth depth of the tree.
	 * @param sb maxHeap data as string
	 */
	private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
		
		if(node == null) {
			sb.append("");
		} else {
			sb.append(node.heap.toString());
			sb.append("\n");
			preOrderTraverse(node.left,depth+1,sb);
			preOrderTraverse(node.right,depth+1,sb);
		}
	}
	
	/**
	 * This method adds the given item into the tree.
	 * @param item item to be added.
	 * @return number of occurrences of the given item
	 */
	public int add(E item) {
		root = add(root, item);
		return itemCounter;
	}
	
	/**
	 * Helper method for add method. This method:
	 * 	- if if the item has already been added, increases the its occurrence
	 * 	- if the item is not in the tree and the localRoot is full(heap size = 7), 
	 * 	creates the new node and adds the data.
	 * 
	 * @param localRoot The root to be checked and added the item.
	 * @param item item to be added
	 * @return node
	 */
	private Node<E> add(Node<E> localRoot, E item){
		if(localRoot == null) {
			itemCounter++;
			return new Node<E>(item);
		}
		else if(localRoot.heap.isInThere(item)) {
			int flag = localRoot.heap.getIndexOf(item);	//item in indexini bulduk
			int counter = localRoot.heap.getNumberOfItem(flag) + 1;	//kaç tane olduðunu bulduk
			localRoot.heap.setNumberOfItem(flag, counter);
			itemCounter = counter;
			return localRoot;
						
		}
		else if(localRoot.heap.getHeapSize() < 7) {
			localRoot.heap.addData(item, 1);
			itemCounter = 1; 
			return localRoot;
		}
		
		else if(localRoot.heap.compare(item, localRoot.heap.getData(0)) < 0) {
			//item < root
			localRoot.left = add(localRoot.left, item);
			return localRoot;
		}
		else {
			localRoot.right = add(localRoot.right, item);
			return localRoot;
		}		
	}
	
	/**
	 * Finds the given item is in tree or not.
	 * If the item is in tree, returns number of occurrences of the item,
	 * else return 0; 
	 * @param target Item to be found.
	 * @return number of occurrence of the given item
	 */
	public int find(E target) {
		itemCounter = 0;
		
		find(root, target);
		return itemCounter;
	}
	
	/**
	 * Helper method of find method.
	 * @param localRoot root to be checked.
	 * @param target target to be found.
	 * @return true if item is in tree, otherwise false.
	 */
	private boolean find(Node<E> localRoot, E target) {
		if(localRoot == null)
			return false;
		
		int compResult = localRoot.heap.compare(target, localRoot.heap.getData(0));
		
		if(localRoot.heap.isInThere(target)) {
			int index = localRoot.heap.getIndexOf(target);
			itemCounter = localRoot.heap.getNumberOfItem(index);
			return true;
		}
		
		else if(compResult < 0) {
			//item < root
			return find(localRoot.left, target);
		}
		else {
			return find(localRoot.right, target);
		}
	}
	
	/**
	 * Finds the largest number of modes of data in the tree and returns it.
	 * @return mode and mode's data
	 */
	public String findMode() {
		return findMode(root, 0);
	}
	
	/**
	 * Helper method of findMode method.
	 * @param localRoot root to be checked
	 * @param counter number of modes the given root
	 * @return mode and mode's data
	 */
	private String findMode(Node<E> localRoot, int counter) {
		if(localRoot == null)
			return null;
			
		int mode = localRoot.heap.findModeHeap();
		int index = localRoot.heap.getIndexOfItem(mode);
		
		if(mode < counter) {
			mode = counter;
		}
		
		findMode(localRoot.left, counter);
		findMode(localRoot.right, counter);
			
		String str =  localRoot.heap.getData(index) + "." + Integer.toString(mode);
		
		return str;
	}
}
