
/**
 * Implementation of a Binary Search Tree
 *
 * @param <E> generic type
 */
@SuppressWarnings("serial")
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements SearchTree<E>{
	//Data fields
	/** Return value from the public add method */
	protected boolean addReturn;
	/** Return value from the public delete method */
	protected E deleteReturn;
	
	/**
	 * Checks the given tree is balanced or not
	 * @param tree tree to be checked
	 * @return true if the tree is balanced, otherwise returns false
	 */
	public boolean isBalanced(BinarySearchTree<?> tree){
		Node<?> node = tree.root;
	    return checkBalance(node) != -1;
	}

	/**
	 * Helper method of isBalanced(). This method traverse the tree
	 * and computes the height of left and right subtree.
	 * If the height difference of the right and left subtree
	 * is greater than 1, it is not balanced. Otherwise it will be balanced.
	 * @param localRoot node to be checked.
	 * @return -1 if the height difference is greater than 1
	 */
	private int checkBalance(Node<?> localRoot){
		
	    if(localRoot == null) return 0;
	    
	    int left = checkBalance(localRoot.left);
	    if(left == -1) return -1;

	    int right = checkBalance(localRoot.right);
	    if(right == -1) return -1;

	    if(Math.abs(left - right) > 1){
	        return -1;     
	    }
	    else{
	        return 1 + Math.max(left, right);
	    }
	}
	
	/**
	 * Checks if given tree is red black or not
	 * @param tree tree to be checked
	 * @return True if given tree is redblack tree, otherwise returns false
	 */
	public boolean checkIsRed(BinarySearchTree<?> tree) {
		return tree.isRed();
	}
	
	@Override
	public boolean isRed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		return super.toString();
	}
	
	public boolean contains(E target) {
		E result = find(target);
		return result == target;
	}
	
	/**
	 * Starter method find.
	 * pre: The target object must implement the Comparable interface.
	 * @param target The Comparable object being sought
	 * @return The object if found, otherwise null
	 */
	public E find(E target) {
		return find(root, target);
	}
	
	/**
	 * Recursive find method
	 * @param localRoot The local subtree's root
	 * @param target The object being sought
	 * @return The object, if found, otherwise null
	 */
	private E find(Node<E> localRoot, E target) {
		if(localRoot == null)
			return null;
		
		//Compare the target with the data field at the root.
		int compResult = target.compareTo(localRoot.data);
		if(compResult == 0)
			return localRoot.data;
		else if(compResult < 0)
			return find(localRoot.left, target);
		else
			return find(localRoot.right, target);
	}
	
	/**
	 * Starter method add
	 * pre: The object to be inserted must implement the Comparable interface
	 * @param item The item being inserted
	 * @return true if the object is inserted, false if the object already exists in the tree
	 */
	public boolean add(E item) {
		root = add(root, item);
		return addReturn;
	}
	
	/**
	 * 
	 * @param localRoot The local root of the subtree
	 * @param item The object to be inserted
	 * @return The new local root that now contains the inserted item
	 */
	private Node<E> add(Node<E> localRoot, E item){
		if(localRoot == null) {
			//item is not in the tree- insert it.
			addReturn = true;
			return new Node<E>(item);
		}
		else if(item.compareTo(localRoot.data) == 0) {
			//item is equal to localRoot.data
			addReturn = false;
			return localRoot;
		}
		else if(item.compareTo(localRoot.data) < 0) {
			//item is less than localRoot.data
			localRoot.left = add(localRoot.left, item);
			return localRoot;
		}
		else {
			//item is greater than localRoot.data
			localRoot.right = add(localRoot.right, item);
			return localRoot;
		}
	}
	
	public boolean remove(E target) {
		delete(target);
		return deleteReturn == target;
	}
	
	/**
	 * Starter method delete
	 * post: The object is not in the tree
	 * @param target The object to be deleted
	 * @return The object deleted from the tree or null if the object was not in the tree
	 */
	public E delete(E target) {
		root = delete(root, target);
		return deleteReturn;
	}
	
	/**Recursive delete method.
	 * post: The item is not in the tree:
	 * 		deleteReturn is equal to the deleted item
	 * 		as it was stored in the tree or null
	 * 		if the item was not found
	 * @param localRoot The root of the current subtree
	 * @param item The item to be deleted
	 * @return The modified local root that does not contain
	 * the item
	 */
	private Node<E> delete(Node<E> localRoot, E item){
		if(localRoot == null) {
			//item is not in the tree
			deleteReturn = null;
			return localRoot;
		}
		
		//Search for item to delete
		int compResult = item.compareTo(localRoot.data);
		if(compResult < 0) {
			//item is smaller than localRoot.data
			localRoot.left = delete(localRoot.left, item);
			return localRoot;
		}
		else if(compResult > 0) {
			//item is larger than localRoot.data
			localRoot.right = delete(localRoot.right, item);
			return localRoot;
		}
		else {
			//item is at local root
			deleteReturn = localRoot.data;
			if(localRoot.left == null) {
				//If there is no left child, return right child
				//which can also be null
				return localRoot.right;
			}
			else if(localRoot.right == null) {
				//If there is no right child, return left child
				//which can also be null
				return localRoot.left;
			}
			else {
				//Node being deleted has 2 children, replace the data
				//with inorder predecessor.
				if(localRoot.left.right == null) {
					//The left child has no right child.
					//Replace the data with the data in the left child
					localRoot.data = localRoot.left.data;
					//Replace the left child with its left child.
					localRoot.left = localRoot.left.left;
					return localRoot;
				}
				else {
					//Search for the inorder predecessor (ip) and
					//replace deleted node's data with ip.
					localRoot.data = findLargestChild(localRoot.left);
					return localRoot;
				}
			}
		}
	}
	
	/**Find the node that is the inorder predecessor and replace it
	 * with its left child (if any)
	 * post: The inorder predecessor is removed from the tree.
	 * @param parent The parent of possible inorder predecessor (ip)
	 * @return The data in the ip 
	 */
	private E findLargestChild(Node<E> parent) {
		//If the right child has no right child, it is the inorder predecessor.
		if(parent.right.right == null) {
			E returnValue = parent.right.data;
			parent.right = parent.right.left;
			return returnValue;
		}
		else {
			return findLargestChild(parent.right);
		}
	}
}
