import java.util.HashMap;

/**
 * Main test class.
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 */
public class Test {
	/**
	 * Main class
	 * @param args -
	 */
	public static void main(String[] args) {
		try {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			
			hashMap.put(10, 10);
			hashMap.put(20, 20);
			hashMap.put(30, 30);
			hashMap.put(40, 40);
			hashMap.put(50, 50);
			
			System.out.println("Hash map: \n" + hashMap.toString());
			
			MapIterator<Integer, Integer> itr = new MapIterator<>(hashMap);
			
			System.out.println("\nWhile starts from beginning: ");
			
			System.out.println("\n******* NEXT ********");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			System.out.println("\n******* PREV ********");
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
			
			System.out.println("\n");
			hashMap.put(15, 15);
			hashMap.put(25, 25);
			hashMap.put(35, 35);
			
			System.out.println("Hash map: \n" + hashMap.toString());
			
			MapIterator<Integer, Integer> itr2 = new MapIterator<>(hashMap, 25);
			System.out.println("\nWhile starts from 25: ");
			
			System.out.println("\n******* NEXT ********");
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			
			System.out.println("\n******* PREV ********");
			while(itr2.hasPrevious()) {
				System.out.println(itr2.previous());
			}
			
			System.out.println("\nIf given hash map is empty:");
			
			HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
			MapIterator<Integer, Integer> itr3 = new MapIterator<>(hashMap2);
			
			System.out.println("\n******* NEXT ********");
			while(itr3.hasNext()) {
				System.out.println(itr3.next());
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}
	
	
	
}
