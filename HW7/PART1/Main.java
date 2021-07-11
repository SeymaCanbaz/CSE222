import java.util.Iterator;
/**
 * This is the main test class.
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 */
public class Main {
	/**
	 * @param args-
	 */
	public static void main(String[] args) {
		MyNavigableSet<Integer> obj = new MyNavigableSet<Integer>();
		
		System.out.println("Skip list inserting: ");
		obj.insertSkipList(1);
		obj.insertSkipList(7);
		obj.insertSkipList(10);
		obj.insertSkipList(15);
		obj.insertSkipList(2);	
		System.out.println(obj.toStringSkipList());
		
		System.out.println("\nSkip list removing: ");
		obj.removeSkipList(1);
		obj.removeSkipList(7);
		System.out.println(obj.toStringSkipList());
		
		try {
			System.out.println("\nSkip list removing (non exist element): ");
			obj.removeSkipList(3);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.print("\nSkip list descending iterator: ");
		Iterator<Integer> iterator = obj.descendingIterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println("\n\nAVL Tree inserting:");
		obj.insertAVLTree(1);
		obj.insertAVLTree(7);
		obj.insertAVLTree(10);
		obj.insertAVLTree(15);
		obj.insertAVLTree(2);
		System.out.println(obj.toStringAVLTree());
		
		System.out.print("AVL Tree iterator: ");
		
		Iterator<Integer> iter = obj.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		System.out.print("\n\nAVL Tree headset: ");
		System.out.println(obj.headSet(15));
		
		System.out.print("\nAVL Tree headset: ");
		System.out.println(obj.headSet(15, true));
		
		System.out.print("\nAVL Tree tailset: ");
		System.out.println(obj.tailSet(2));
		
		System.out.println("\nAVL Tree tailset: ");
		System.out.print(obj.tailSet(2, true));
		
		System.out.println("\n\nAVL Tree removing:");
		obj.removeAVLTree(1);
		obj.removeAVLTree(7);
		System.out.println(obj.toStringAVLTree());
	}

}
