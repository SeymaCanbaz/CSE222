import java.util.*;

/**
 * This is the main test class.
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 */
public class Test {
	/** @param args - */
	public static void main(String[] args) {
		
		//Binary Search Tree
		BinarySearchTree<Integer> bst1 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst2 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst3 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst4 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst5 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst6 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst7 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst8 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst9 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> bst10 = new BinarySearchTree<Integer>();
		
		//Red Black Tree
		RedBlackTree<Integer> rbt1 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt2 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt3 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt4 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt5 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt6 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt7 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt8 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt9 = new RedBlackTree<Integer>();
		RedBlackTree<Integer> rbt10 = new RedBlackTree<Integer>();
				
		//Skip List
		SkipList<Integer> sl1 = new SkipList<Integer>();
		SkipList<Integer> sl2 = new SkipList<Integer>();
		SkipList<Integer> sl3 = new SkipList<Integer>();
		SkipList<Integer> sl4 = new SkipList<Integer>();
		SkipList<Integer> sl5 = new SkipList<Integer>();
		SkipList<Integer> sl6 = new SkipList<Integer>();
		SkipList<Integer> sl7 = new SkipList<Integer>();
		SkipList<Integer> sl8 = new SkipList<Integer>();
		SkipList<Integer> sl9 = new SkipList<Integer>();
		SkipList<Integer> sl10 = new SkipList<Integer>();
		
		//2-3 Tree
		//If we give the order as 3, it becomes a 2-3 tree
		BTree<Integer> tt1 =  new BTree<>(3);
		BTree<Integer> tt2 =  new BTree<>(3);
		BTree<Integer> tt3 =  new BTree<>(3);
		BTree<Integer> tt4 =  new BTree<>(3);
		BTree<Integer> tt5 =  new BTree<>(3);
		BTree<Integer> tt6 =  new BTree<>(3);
		BTree<Integer> tt7 =  new BTree<>(3);
		BTree<Integer> tt8 =  new BTree<>(3);
		BTree<Integer> tt9 =  new BTree<>(3);
		BTree<Integer> tt10 =  new BTree<>(3);
		
		//B Tree
		BTree<Integer> btree1 =  new BTree<>(5);
		BTree<Integer> btree2 =  new BTree<>(5);
		BTree<Integer> btree3 =  new BTree<>(5);
		BTree<Integer> btree4 =  new BTree<>(5);
		BTree<Integer> btree5 =  new BTree<>(5);
		BTree<Integer> btree6 =  new BTree<>(5);
		BTree<Integer> btree7 =  new BTree<>(5);
		BTree<Integer> btree8 =  new BTree<>(5);
		BTree<Integer> btree9 =  new BTree<>(5);
		BTree<Integer> btree10 =  new BTree<>(5);
		
		Random rInt = new Random();
		ArrayList<Integer> randNumber = new ArrayList<Integer>();
		Integer[] arr = new Integer[100];
		

		/**Size 10 000 ***/
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
			
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst1.add(rand);
			rbt1.add(rand);
			sl1.add(rand);	
			btree1.add(rand);
			tt1.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst2.add(rand);
			rbt2.add(rand);
			sl2.add(rand);
			btree2.add(rand);
			tt2.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst3.add(rand);
			rbt3.add(rand);
			sl3.add(rand);	
			btree3.add(rand);
			tt3.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst4.add(rand);
			rbt4.add(rand);
			sl4.add(rand);
			btree4.add(rand);
			tt4.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst5.add(rand);
			rbt5.add(rand);
			sl5.add(rand);	
			btree5.add(rand);
			tt5.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst6.add(rand);
			rbt6.add(rand);
			sl6.add(rand);
			btree6.add(rand);
			tt6.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst7.add(rand);
			rbt7.add(rand);
			sl7.add(rand);
			btree7.add(rand);
			tt7.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst8.add(rand);
			rbt8.add(rand);
			sl8.add(rand);
			btree8.add(rand);
			tt8.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst9.add(rand);
			rbt9.add(rand);
			sl9.add(rand);
			btree9.add(rand);
			tt9.add(rand);
		}
		
		for(int i=0; i<10000; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst10.add(rand);
			rbt10.add(rand);
			sl10.add(rand);
			btree10.add(rand);
			tt10.add(rand);
		}
		
		System.out.println("\n***Length is 10 100***");
		
		for(int i=0; i<arr.length; i++)
			arr[i] = rInt.nextInt();
		
		System.out.println("Binary Search Tree adding times are: ");
		
		long startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst1.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst2.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst3.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst4.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst5.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst6.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst7.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst8.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst9.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst10.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		
		System.out.println("\nRed Black Tree adding times are:  ");
	
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		

		System.out.println("\nSkip List adding times are:");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		
		System.out.println("\nB Tree adding times are:  ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		System.out.println("\n2-3 Tree adding times are:  ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		
		/**Size 20 000 ***/
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst1.add(rand);
			rbt1.add(rand);
			sl1.add(rand);
			btree1.add(rand);
			tt1.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst2.add(rand);
			rbt2.add(rand);
			sl2.add(rand);	
			btree2.add(rand);
			tt2.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst3.add(rand);
			rbt3.add(rand);
			sl3.add(rand);
			btree3.add(rand);
			tt3.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst4.add(rand);
			rbt4.add(rand);
			sl4.add(rand);
			btree4.add(rand);
			tt4.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst5.add(rand);
			rbt5.add(rand);
			sl5.add(rand);
			btree5.add(rand);
			tt5.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst6.add(rand);
			rbt6.add(rand);
			sl6.add(rand);	
			btree6.add(rand);
			tt6.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst7.add(rand);
			rbt7.add(rand);
			sl7.add(rand);	
			btree7.add(rand);
			tt7.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst8.add(rand);
			rbt8.add(rand);
			sl8.add(rand);
			btree8.add(rand);
			tt8.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst9.add(rand);
			rbt9.add(rand);
			sl9.add(rand);
			btree9.add(rand);
			tt9.add(rand);
		}
		
		for(int i=0; i<9900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst10.add(rand);
			rbt10.add(rand);
			sl10.add(rand);
			btree10.add(rand);
			tt10.add(rand);
		}
		
		System.out.println("\n***Length is 20 100***");
		
		for(int i=0; i<arr.length; i++)
			arr[i] = rInt.nextInt();
		
		System.out.println("Binary Search Tree adding times are: ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst1.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst2.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst3.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst4.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst5.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst6.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst7.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst8.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst9.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst10.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		
		System.out.println("\nRed Black Tree adding times are:  ");
	
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		

		System.out.println("\nSkip List adding times are:");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		System.out.println("\nB Tree adding times are:  ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		System.out.println("\n2-3 Tree adding times are:  ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		/**Size 40 000 ***/
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst1.add(rand);
			rbt1.add(rand);
			sl1.add(rand);
			btree1.add(rand);
			tt1.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst2.add(rand);
			rbt2.add(rand);
			sl2.add(rand);	
			btree2.add(rand);
			tt2.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst3.add(rand);
			rbt3.add(rand);
			sl3.add(rand);
			btree3.add(rand);
			tt3.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst4.add(rand);
			rbt4.add(rand);
			sl4.add(rand);
			btree4.add(rand);
			tt4.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst5.add(rand);
			rbt5.add(rand);
			sl5.add(rand);	
			btree5.add(rand);
			tt5.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst6.add(rand);
			rbt6.add(rand);
			sl6.add(rand);	
			btree6.add(rand);
			tt6.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst7.add(rand);
			rbt7.add(rand);
			sl7.add(rand);
			btree7.add(rand);
			tt7.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst8.add(rand);
			rbt8.add(rand);
			sl8.add(rand);
			btree8.add(rand);
			tt8.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst9.add(rand);
			rbt9.add(rand);
			sl9.add(rand);
			btree9.add(rand);
			tt9.add(rand);
		}
		
		for(int i=0; i<19900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst10.add(rand);
			rbt10.add(rand);
			sl10.add(rand);
			btree10.add(rand);
			tt10.add(rand);
		}
		
		System.out.println("\n***Length is 40 100***");
		
		for(int i=0; i<arr.length; i++)
			arr[i] = rInt.nextInt();
		
		System.out.println("Binary Search Tree adding times are: ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst1.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst2.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst3.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst4.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst5.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst6.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst7.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst8.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst9.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst10.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		
		System.out.println("\nRed Black Tree adding times are:  ");
	
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		

		System.out.println("\nSkip List adding times are:");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		System.out.println("\nB Tree adding times are:  ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		System.out.println("\n2-3 Tree adding times are:  ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
			
		/**Size 80 000 ***/
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst1.add(rand);
			rbt1.add(rand);
			sl1.add(rand);
			btree1.add(rand);
			tt1.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst2.add(rand);
			rbt2.add(rand);
			sl2.add(rand);
			btree2.add(rand);
			tt2.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst3.add(rand);
			rbt3.add(rand);
			sl3.add(rand);
			btree3.add(rand);
			tt3.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst4.add(rand);
			rbt4.add(rand);
			sl4.add(rand);
			btree4.add(rand);
			tt4.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst5.add(rand);
			rbt5.add(rand);
			sl5.add(rand);
			btree5.add(rand);
			tt5.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst6.add(rand);
			rbt6.add(rand);
			sl6.add(rand);
			btree6.add(rand);
			tt6.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst7.add(rand);
			rbt7.add(rand);
			sl7.add(rand);	
			btree7.add(rand);
			tt7.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst8.add(rand);
			rbt8.add(rand);
			sl8.add(rand);
			btree8.add(rand);
			tt8.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst9.add(rand);
			rbt9.add(rand);
			sl9.add(rand);	
			btree9.add(rand);
			tt9.add(rand);
		}
		
		for(int i=0; i<39900; i++) {
			int rand = rInt.nextInt();
		
			while(randNumber.contains(rand)) {	//checks if random number is repeating
				rand = rInt.nextInt();
			}
			bst10.add(rand);
			rbt10.add(rand);
			sl10.add(rand);	
			btree10.add(rand);
			tt10.add(rand);
		}
		
		System.out.println("\n***Length is 80 100***");
		
		for(int i=0; i<arr.length; i++)
			arr[i] = rInt.nextInt();
		
		System.out.println("Binary Search Tree adding times are: ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst1.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst2.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst3.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst4.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst5.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst6.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst7.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst8.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst9.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			bst10.add(arr[i]);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		
		
		System.out.println("\nRed Black Tree adding times are:  ");
	
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			rbt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		

		System.out.println("\nSkip List adding times are:");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");

		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			sl10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		

		System.out.println("\nB Tree adding times are:  ");
	
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			btree10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		System.out.println("\n2-3 Tree adding times are:  ");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt1.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt2.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt3.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt4.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt5.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt6.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt7.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt8.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt9.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100; i++) {
			int rand = rInt.nextInt();
			tt10.add(rand);
		}
		System.out.println((System.nanoTime() - startTime) + " ns");
	}
}

