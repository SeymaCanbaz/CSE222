/**
 * Main test class
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 */
public class Main {
	/** @param args -  */
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> obj = new BinarySearchTree<Integer>();
		obj.add(6);
		obj.add(2);
		obj.add(1);
		obj.add(3);
		checkTree(obj);
	//	System.out.println(avl.toString());
		
		System.out.println("\n");
		
		AVLTree<Integer> avl = new AVLTree<Integer>();
		avl.add(4);
		avl.add(3);
		avl.add(2);
//		System.out.println(avl.toString());
		checkTree(avl);
		
		System.out.println("\n");
		
		RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
		rbt.add(0);
		rbt.add(1);
		rbt.add(2);
		rbt.add(6);
		rbt.add(9);
		rbt.add(10);
		
//		System.out.println(rbt.toString());
		checkTree(rbt);		
		
		System.out.println("\n");
		rbt.add(4);
		rbt.add(3);
		rbt.add(2);
		
//		System.out.println(rbt.toString());
		checkTree(rbt);	
		
	}
	
	/**
	 * This method takes the binary search tree object
	 * and checks it is avl tree or red lack tree.
	 * If given tree balanced and not red, it is an avl tree,
	 * if given tree node is red, it is a red black tree.
	 * @param tree tree to be checked
	 */
	public static void checkTree(BinarySearchTree<?> tree) {
		
	//	System.out.println("Balanced: " + tree.isBalanced(tree));
	//	System.out.println("isRed: " + tree.checkIsRed(tree));
		
		if(tree.isBalanced(tree) && !tree.isRed())
			System.out.println("This tree is an AVL Tree");
		else if(tree.isRed())
			System.out.println("This tree is a Red Black Tree");
		else{
			System.out.println("This tree is not AVL Tree or Red Black Tree");
		}
			
	}
}

