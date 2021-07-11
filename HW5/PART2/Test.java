import java.util.Random;
/**
 * Driver class.
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 */
public class Test {
	/**
	 * Main class
	 * @param args -
	 */
	public static void main(String args[]) {
		
		Integer[] small1 = new Integer[10];
		Integer[] small2 = new Integer[10];
		
		Integer[] medium1 = new Integer[100];
		Integer[] medium2 = new Integer[100];
		
		Integer[] large1 = new Integer[1000];
		Integer[] large2 = new Integer[1000];
		
		Random rand = new Random(3000);
		
		HashTableChain <Integer, Integer> hashTableMap = new HashTableChain<Integer, Integer>();
		TreeSetChain<Integer, Integer> treeSetMap = new TreeSetChain<Integer, Integer>();
		CoalescedHashMap<Integer, Integer> chMap = new CoalescedHashMap<Integer, Integer>();
		
		for(int i=0; i<small1.length; i++) {
			small1[i] = rand.nextInt();
			small2[i] = rand.nextInt();
		}
		
		System.out.println("*** Inserting Time ***");
		
		long startTime = System.nanoTime();
		for(int i=0; i<small1.length; i++) {
			hashTableMap.put(small1[i], small2[i]); 
		}
		System.out.println("HashTableChain (length 10) is " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<small1.length; i++) {
			treeSetMap.put(small1[i], small2[i]); 
		}
		System.out.println("TreeSetChain (length 10) is " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<small1.length; i++) {
			chMap.put(small1[i], small2[i]); 
		}
		System.out.println("CoalescedHasphMap (length 10) is " + (System.nanoTime() - startTime) + " ns");
	
		
		System.out.println();
		System.out.println("*** Existing Time ***");
		
		startTime = System.nanoTime();
		hashTableMap.get(small1[2]); 
		System.out.println("HashTableChain (length 10): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		treeSetMap.get(small1[2]); 
		System.out.println("TreeSetChain (length 10): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		chMap.get(small1[2]); 
		System.out.println("CoalescedHasphMap (length 10): " + (System.nanoTime() - startTime) + " ns");
		
		
		System.out.println();
		System.out.println("*** Non-existing Time ***");
		
		startTime = System.nanoTime();
		hashTableMap.get(10000); 
		System.out.println("HashTableChain (length 10): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		treeSetMap.get(10000); 
		System.out.println("TreeSetChain (length 10): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		chMap.get(10000); 
		System.out.println("CoalescedHasphMap (length 10): " + (System.nanoTime() - startTime) + " ns");		
		
		
		
		System.out.println();	
		System.out.println("*** Removing time ***");
		
		startTime = System.nanoTime();
		for(int i=0; i<small1.length; i++) {
			hashTableMap.remove(small1[i]);
		}
	//	hashTableMap.remove(small1[5]);
		System.out.println("HashTableChain (length 10): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<small1.length; i++) {
			treeSetMap.remove(small1[i]);
		}
	//	treeSetMap.remove(small1[5]);
		System.out.println("TreeSetChain (length 10): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<small1.length; i++) {
			chMap.remove(small1[i]);
		}
	//	chMap.remove(small1[5]);
		System.out.println("CoalescedHasphMap (length 100): " + (System.nanoTime() - startTime) + " ns");
				

		
		System.out.println();
		System.out.println("*** Inserting Time ***");
		
		for(int i=0; i<medium1.length; i++) {
			medium1[i] = rand.nextInt();
			medium2[i] = rand.nextInt();
		}
		
		startTime = System.nanoTime();
		for(int i=0; i<medium1.length; i++) {
			hashTableMap.put(medium1[i], medium2[i]); 
		}
		System.out.println("HashTableChain (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<medium1.length; i++) {
			treeSetMap.put(medium1[i], medium2[i]); 
		}
		System.out.println("TreeSetChain (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<medium1.length; i++) {
			chMap.put(medium1[i], medium2[i]); 
		}
		System.out.println("CoalescedHasphMap (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		System.out.println();
		System.out.println("*** Existing Time ***");
		
		startTime = System.nanoTime();
		hashTableMap.get(medium1[2]); 
		System.out.println("HashTableChain (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		treeSetMap.get(medium1[2]); 
		System.out.println("TreeSetChain (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		chMap.get(medium1[2]); 
		System.out.println("CoalescedHasphMap (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		
		System.out.println();
		System.out.println("*** Non-existing Time ***");
		
		startTime = System.nanoTime();
		hashTableMap.get(10000); 
		System.out.println("HashTableChain (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		treeSetMap.get(10000); 
		System.out.println("TreeSetChain (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		chMap.get(10000); 
		System.out.println("CoalescedHasphMap (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		
		
		System.out.println();	
		System.out.println("*** Removing time ***");
		
		startTime = System.nanoTime();
		for(int i=0; i<medium1.length/10; i++) {
			hashTableMap.remove(medium1[i]);
		}
//		hashTableMap.remove(medium1[5]);
		System.out.println("HashTableChain (length 100): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<medium1.length/10; i++) {
			treeSetMap.remove(medium1[i]);
		}
//		treeSetMap.remove(medium1[5]);
		System.out.println("TreeSetChain (length 100): " + (System.nanoTime() - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<medium1.length/10; i++) {
			chMap.remove(medium1[i]);
		}
	//	chMap.remove(medium1[5]);
		System.out.println("CoalescedHasphMap (length 100): " + (System.nanoTime() - startTime) + " ns");
		

		
		System.out.println();	
		System.out.println("*** Inserting Time ***");
		
		for(int i=0; i<large1.length; i++) {
			large1[i] = rand.nextInt();
			large2[i] = rand.nextInt();
		}
		
		startTime = System.nanoTime();
		for(int i=0; i<large1.length; i++) {
			hashTableMap.put(large1[i], large2[i]); 
		}
		System.out.println("HashTableChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<large1.length; i++) {
			treeSetMap.put(large1[i], large2[i]); 
		}
		System.out.println("TreeSetChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<large1.length; i++) {
			chMap.put(large1[i], large2[i]); 
		}
		System.out.println("CoalescedHasphMap (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		
		System.out.println();
		System.out.println("*** Existing Time ***");
		
		startTime = System.nanoTime();
		hashTableMap.get(large1[2]); 
		System.out.println("HashTableChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		treeSetMap.get(large1[2]); 
		System.out.println("TreeSetChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		chMap.get(large1[2]); 
		System.out.println("CoalescedHasphMap (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		
		System.out.println();
		System.out.println("*** Non-existing Time ***");
		
		startTime = System.nanoTime();
		hashTableMap.get(10000); 
		System.out.println("HashTableChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		treeSetMap.get(10000); 
		System.out.println("TreeSetChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		chMap.get(10000); 
		System.out.println("CoalescedHasphMap (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		
		
		
		System.out.println();
		System.out.println("*** Removing time ***");
		
		startTime = System.nanoTime();
		for(int i=0; i<large1.length/100; i++) {
			hashTableMap.remove(large1[i]);
		}
//		hashTableMap.remove(large1[5]);
		System.out.println("HashTableChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<large1.length/100; i++) {
			treeSetMap.remove(large1[i]);
		}
//		treeSetMap.remove(large1[5]);
		System.out.println("TreeSetChain (length 1000): " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<large1.length/100; i++) {
			chMap.remove(large1[i]);
		}
//		chMap.remove(large1[5]);
		System.out.println("CoalescedHasphMap (length 100): " + (System.nanoTime() - startTime) + " ns");
		

		System.out.println();
		
		
		
/*		
		//DRIVER CODE
		//1.part
		System.out.println("**** HASH TABLE CHAIN ******\n");
		HashTableChain <Integer, String> hashTableMap2 = new HashTableChain<Integer, String>();
		
		//test1
		if(hashTableMap2.isEmpty())
			System.out.println("The map is empty");
		else
			System.out.println("The map is not empty");
		
		//test2
		hashTableMap2.put(1, "A");
		System.out.println(hashTableMap2);
		
		//test3
		if(hashTableMap2.isEmpty())
			System.out.println("The map is empty.");
		else
			System.out.println("The map is not empty.");
		
		hashTableMap2.put(2, "C");
		System.out.println(hashTableMap2);
		
		hashTableMap2.put(3, "D");
		System.out.println(hashTableMap2);
		
		//test4
		hashTableMap2.put(1, "a");
		System.out.println(hashTableMap2);
		
		//test5
		System.out.print("The value of key(2): ");
		System.out.println(hashTableMap2.get(2));
		
		//test6
		System.out.print("The value of key(4): ");
		System.out.println(hashTableMap2.get(4));
		
		//test7
		System.out.print("The value of removed key(3): ");
		System.out.println(hashTableMap2.remove(3));
		
		System.out.println(hashTableMap2);
		
		//test8
		System.out.print("The value of removed key(4): ");
		System.out.println(hashTableMap2.remove(4));
		
		System.out.println("Size: " + hashTableMap2.size());
		System.out.println("Table size: " + hashTableMap2.tableSize());
		
		hashTableMap2.put(1, "a");
		System.out.println(hashTableMap2);
		
		hashTableMap2.put(1, "X");
		System.out.println(hashTableMap2);
		
		
		//2.part
		System.out.println("**** TREE SET CHAIN ******\n");
		TreeSetChain<Integer, String> treeSetMap2 = new TreeSetChain<Integer, String>();
		
		if(treeSetMap2.isEmpty())
			System.out.println("The map is empty.");
		else
			System.out.println("The map is not empty.");
		
		//test2
		treeSetMap2.put(1, "A");
		System.out.println(treeSetMap2);
		
		//test3
		if(treeSetMap2.isEmpty())
			System.out.println("The map is empty.");
		else
			System.out.println("The map is not empty.");
		
		treeSetMap2.put(2, "C");
		System.out.println(treeSetMap2);
		
		treeSetMap2.put(3, "D");
		System.out.println(treeSetMap2);
		
		//test4
		treeSetMap2.put(1, "a");
		System.out.println(treeSetMap2);
		
		//test5
		System.out.print("The value of key(2): ");
		System.out.println(treeSetMap2.get(2));
		
		//test6
		System.out.print("The value of key(4): ");
		System.out.println(treeSetMap2.get(4));
		
		//test7
		System.out.print("The value of removed key(3): ");
		System.out.println(treeSetMap2.remove(3));
		
		System.out.println(treeSetMap2);
		
		//test8
		System.out.print("The value of removed key(4): ");
		System.out.println(treeSetMap2.remove(4));
		
		System.out.println("Size: " + treeSetMap2.size());
		System.out.println("Table size: " + treeSetMap2.tableSize());
		
		
		
		//3.part
		System.out.println("**** COALESCED HASH MAP ******\n");
		CoalescedHashMap<Integer, Integer> chMap2 = new CoalescedHashMap<Integer, Integer>();
	
		chMap2.put(3, 3);
		System.out.println("Add 3\n" + chMap2.toString());
		
		chMap2.put(12, 12);
		System.out.println("Add 12\n" + chMap2.toString());
		
		chMap2.put(13, 13);
		System.out.println("Add 13\n" + chMap2.toString());
		
		chMap2.put(25, 25);
		System.out.println("Add 25\n" + chMap2.toString());
		
		chMap2.put(23, 23);
		System.out.println("Add 23\n" + chMap2.toString());
		
		chMap2.put(51, 51);
		System.out.println("Add 51\n" + chMap2.toString());
		
		chMap2.put(42, 42);
		System.out.println("Add 42\n" + chMap2.toString());
		
		
		System.out.println("Key: 23 - Value: " + chMap2.get(23));
		
		System.out.println("\nRemove 13 ");
		chMap2.remove(13);
		System.out.println(chMap2.toString());
*/	
	}
}
