import java.io.*;
import java.util.*;

/**
 * Class for a binary tree that stores type E objects
 * 
 * @author Koffman and Wolfgang
 */
@SuppressWarnings("serial")
public class BinaryTree<E> implements Serializable {
	/**
	 * Class to encapsulate a tree node
	 */
	protected static class Node<E> implements Serializable{
		//Data fields
		/** The information stored in this node */
		protected E data;
		/** Reference to the left child */
		protected Node<E> left;
		/** Reference to the right child */
		protected Node<E> right;
		
		//Constructors
		
		/**
		 *  Construct a node with given data and no children
		 * @param data The data to store in this node
		 */
		public Node(E data) {
			this.data = data;
			left = null;
			right = null;
		}
		
		//Methods
		public String toString() {
			String str = data.toString();
			return str;
		}
	}
	
	/**  Class for a binary tree that stores type E objects */
	protected Node<E> root;
	
	//Constructors
	/**
	 * Constructor
	 */
	public BinaryTree() {
		root = null;
	}
	
	protected BinaryTree(Node<E> root) {
		this.root = root;
	}
	
	/**
	 * Constructs a new binary tree with data in its root, leftTree as its left subtree, and rightTree as its right subtree
	 * @param data The data of the root node
	 * @param leftTree The left subtree
	 * @param rightTree The right subtree
	 */
	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		root = new Node<E>(data);
		if(leftTree != null) {
			root.left = leftTree.root;
		}else {
			root.left = null;
		}
		if(rightTree != null) {
			root.right = rightTree.root;
		}else {
			root.right = null;
		}
	}
	
	/**
	 * Return the left subtree
	 * @return The left subtree or null if either the root or the left subtree is null
	 */
	public BinaryTree<E> getLeftTree(){
		if(root != null && root.left != null)
			return new BinaryTree<E>(root.left);
		else
			return null;
	}
	
	/**
	 * Return the right subtree.
	 * @return The right subtree or null if either the root or the right subtree is null
	 */
	public BinaryTree<E> getRightSubtree() {
		if(root != null && root.right != null) {
			return new BinaryTree<E>(root.right);
		}else {
			return null;
		}
	}
	
	/** Determine whether this tree is a leaf.
	 * @return true if the root has no children
	 */
	public boolean isLeaf() {
		return (root.left == null && root.right == null);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		preOrderTraverse(root, 1, sb);
		return sb.toString();
	}
	
	/**
	 * Perform a preorder traverse
	 * @param node The local root
	 * @param depth The depth
	 * @param sb The string buffer to save the output
	 */
	private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
		for(int i=1; i<depth; i++) {
			sb.append(" ");
		}
		if(node == null) {
			sb.append("null\n");
		}else {
			sb.append(node.toString());
			sb.append("\n");
			preOrderTraverse(node.left, depth+1, sb);
			preOrderTraverse(node.right, depth+1, sb);
		}
	}
	
	/**
	 * @return toString
	 */
	public String oneLineInorder() {
		StringBuilder sb = new StringBuilder();
		inorderTraverse(root, sb);
		return sb.toString();
	}
	
	/**
	 * Perform an inorder traversal, returning the tree as one line (with parentheses)
	 * @param node The local root
	 * @param sb The string buffer to save the input
	 */
	private void inorderTraverse(Node<E> node, StringBuilder sb) {
		if(node == null) {
			//do nothing
		}
		else {
			sb.append("(");
			inorderTraverse(node.left, sb);
			sb.append(" ");
			sb.append(node.toString());
			sb.append(" ");
			inorderTraverse(node.right, sb);
			sb.append(")");
		}
	}
	
	/**
	 * Method to read a binary tree
	 * pre: The input consists of a preorder traversal
	 * of the binary tree. The line "null" indicates a null tree.
	 * @param scan the Scanner attached to the input file.
	 * @return The binary tree
	 */
	public static BinaryTree<String> readBinaryTree(Scanner scan){
		//Read a line and trim leading and trailing spaces.
		String data = scan.next();
		if(data.equals("null")) {
			return null;
		}else {
			BinaryTree<String> leftTree = readBinaryTree(scan);
			BinaryTree<String> rightTree = readBinaryTree(scan);
			return new BinaryTree<String> (data, leftTree, rightTree);
		}
	}
}
