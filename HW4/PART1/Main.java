/**
 * @author ÞEYMA NUR CANBAZ 171044076
 */
public class Main {
 
	/**
	 * This is the main test class.
	 * @param args -
	 */
	public static void main(String[] args) {
		
		Heap<Integer> obj = new Heap<Integer>();
		
		obj.add(5);
		System.out.println("After addition 5:");
		obj.print();
		
		obj.add(3);
		System.out.println("\nAfter addition 3:");
		obj.print();
		
		obj.add(17);
		System.out.println("\nAfter addition 17:");
		obj.print();
		
		obj.add(10);
		System.out.println("\nAfter addition 10:");
		obj.print();
		
		obj.add(84);
		System.out.println("\nAfter addition 84:");
		obj.print();
		
		obj.add(19);
		System.out.println("\nAfter addition 19:");
		obj.print();
		
		obj.add(6);
		System.out.println("\nAfter addition 6:");
		obj.print();
		
		obj.add(22);
		System.out.println("\nAfter addition 22:");
		obj.print();
		
		obj.add(9);
		System.out.println("\nAfter addition 9:");
		obj.print();
		
		//Adding the same element
		obj.add(22);
		System.out.println("\nAfter addition 22:");
		obj.print();	
		
		try {
			obj.removeIndex(6);
			System.out.println("\nAfter deletion of 6th largest element:");
			obj.print();
			
			obj.removeIndex(3);
			System.out.println("\nAfter deletion of 3th largest element:");
			obj.print();
			
			obj.removeIndex(5);
			System.out.println("\nAfter deletion of 5th largest element:");
			obj.print();
			
			//Index out of bounds
			System.out.println("\nAfter deletion of 10th largest element:");
			obj.removeIndex(10);
			obj.print();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("\nSet 50:");
		obj.set(50);
		obj.print();
		
		System.out.println("\nSet 50:");
		obj.set(50);
		obj.print();
		
		
		Heap<Integer> obj2 = new Heap<Integer>();
		obj2.add(42);
		obj2.add(66);
		obj2.add(2);
		obj2.add(13);
		
		System.out.println("\nSecond heap to be merged:");
		obj2.print();
		
		System.out.println("\nAfter merge: ");
		obj.merge(obj2);
		obj.print();
		
		//fin element
		System.out.println("\nHeap: ");
		obj.print();
		boolean flag;
		System.out.println("\n13 is in the heap?");
		flag = obj.find(13);
		
		if(flag) System.out.println("Yes");
		else System.out.println("No");
		
		//find element (not in the heap)
		System.out.println("\nHeap: ");
		obj.print();
		
		System.out.println("\n25 is in the heap?");
		flag = obj.find(25);
		
		if(flag) System.out.println("Yes");
		else System.out.println("No");
		
	}
	

}

