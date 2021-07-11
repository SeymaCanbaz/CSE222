import java.util.Random;
/**
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 *Main class
 */
public class Main {
	/**
	 * Main class
	 * @param args - 
	 */
	public static void main(String[] args) {

		BSTHeapTree<Integer> o = new BSTHeapTree<Integer>();

		Random rand = new Random();
		Integer[] arr = new Integer[300];
		for(int i =0;i<300;++i) {
			arr[i] = rand.nextInt(200);
			o.add(arr[i]);
		}
		System.out.println(o.toString());
		System.out.println("Mode: " + o.findMode());

		System.out.println("Number of " + arr[15]+ ": " + o.find(arr[15]));
		System.out.println("Number of " + arr[25]+ ": " + o.find(arr[25]));
		System.out.println("Number of " + arr[48]+ ": " + o.find(arr[48]));
		System.out.println("Number of " + arr[52]+ ": " + o.find(arr[52]));
		System.out.println("Number of " + arr[85]+ ": " + o.find(arr[85]));
		System.out.println("Number of " + arr[100]+ ": " + o.find(arr[100]));
		System.out.println("Number of " + arr[1]+ ": " + o.find(arr[1]));
		System.out.println("Number of " + arr[12]+ ": " + o.find(arr[12]));
		System.out.println("Number of " + arr[21]+ ": " + o.find(arr[21]));
		System.out.println("Number of " + arr[63]+ ": " + o.find(arr[63]));
		
		System.out.println("Number of -1: " + o.find(-1));
		System.out.println("Number of 250: " + o.find(250));
		System.out.println("Number of 300: " + o.find(300));
		System.out.println("Number of 350: " + o.find(350));
		System.out.println("Number of 400: " + o.find(400));
		
		/*	
		System.out.println(o.add(84));
		System.out.println(o.toString());
		System.out.println(o.add(42));
		System.out.println(o.toString());
		System.out.println(o.add(27));
		System.out.println(o.toString());
		System.out.println(o.add(55));
		System.out.println(o.toString());
		System.out.println(o.add(84));
		System.out.println(o.toString());
		System.out.println(o.add(84));
		System.out.println(o.toString());
		System.out.println(o.add(42));
		System.out.println(o.toString());
		System.out.println(o.add(96));
		System.out.println(o.toString());
		System.out.println(o.add(88));
		System.out.println(o.toString());
		System.out.println(o.add(62));
		System.out.println(o.toString());
		System.out.println(o.add(17));
		System.out.println(o.toString());
		
		System.out.println(o.add(62));
		System.out.println(o.toString());
		System.out.println(o.add(28));
		System.out.println(o.toString());
		System.out.println(o.add(51));
		System.out.println(o.toString());
		System.out.println(o.add(24));
		System.out.println(o.toString());
		System.out.println(o.add(4));
		System.out.println(o.toString());
		System.out.println(o.add(12));
		System.out.println(o.toString());
		System.out.println(o.add(36));
		System.out.println(o.toString());
		System.out.println(o.add(88));
		System.out.println(o.toString());
		System.out.println(o.add(92));
		System.out.println(o.toString());
		System.out.println(o.add(57));
		System.out.println(o.toString());
		
		System.out.println(o.add(84));
		System.out.println(o.toString());
	
		
		System.out.println(o.find(88));
		
		System.out.println(o.add(57));
		System.out.println(o.toString());
		
		System.out.println(o.find(1));
		
		System.out.println(o.find(88));
		System.out.println("----");
		System.out.println(o.findMode());
		
	*/	
		

	}
	
	/**
	 * Sorts the given array largest to smallest.
	 * @param arr Array to be sorted.
	 */
	public void sort(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					//swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
