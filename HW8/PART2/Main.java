import java.util.Random;
/**
 * This is the main test class.
 * 
 * @author ÞEYMA NUR CANBAZ 171044076
 *
 */
public class Main {
	/**@param args -*/
	public static void main(String[] args) {
		//different size of graphs
		Graph graph1 = new ListGraph(1000, true);
		Graph graph2 = new ListGraph(1000, true);
		Graph graph3 = new ListGraph(2000, true);
		Graph graph4 = new ListGraph(2000, true);
		Graph graph5 = new ListGraph(5000, true);
		Graph graph6 = new ListGraph(5000, true);
		Graph graph7 = new ListGraph(10000, true);
		Graph graph8 = new ListGraph(10000, true);
		
		//random number arrays (for vertices)
		Integer arr1[] = new Integer[500];
		Integer arr2[] = new Integer[500];
		Integer arr3[] = new Integer[1000];
		Integer arr4[] = new Integer[1000];
		Integer arr5[] = new Integer[2500];
		Integer arr6[] = new Integer[2500];
		Integer arr7[] = new Integer[5000];
		Integer arr8[] = new Integer[5000];
		
		Random rInt = new Random();
		
		//creates the random vertex values
		for(int i=0; i<500; i++) {
			int rand = rInt.nextInt(200);
			arr1[i] = rand;
			
			rand = rInt.nextInt(200);
			arr2[i] = rand;
		}
		
		for(int i=0; i<1000; i++) {
			int rand = rInt.nextInt(400);
			arr3[i] = rand;
			
			rand = rInt.nextInt(400);
			arr4[i] = rand;
		}
			
		for(int i=0; i<2500; i++) {
			int rand = rInt.nextInt(1000);
			arr5[i] = rand;
			
			rand = rInt.nextInt(1000);
			arr6[i] = rand;
		}	
		
		for(int i=0; i<5000; i++) {
			int rand = rInt.nextInt(2000);
			arr7[i] = rand;
			
			rand = rInt.nextInt(2000);
			arr8[i] = rand;
		}	
		
		
		//creates the graph
		for(int i=0; i<500; i++) {
			graph1.insert(new Edge(arr1[i], arr2[i]));
			graph2.insert(new Edge(arr2[i], arr1[i]));
		}
		for(int i=0; i<1000; i++) {
			graph3.insert(new Edge(arr3[i], arr4[i]));
			graph4.insert(new Edge(arr4[i], arr3[i]));
		}
		for(int i=0; i<2500; i++) {
			graph5.insert(new Edge(arr5[i], arr6[i]));
			graph6.insert(new Edge(arr6[i], arr5[i]));
		}
		for(int i=0; i<5000; i++) {
			graph7.insert(new Edge(arr7[i], arr8[i]));
			graph8.insert(new Edge(arr8[i], arr7[i]));
		}
		

		//calculates the breadth first search
		System.out.println("\n***Breadth First Search***");
		
		long startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph1, arr1[0]);
		System.out.println("Length 1000: " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph2, arr2[0]);
		System.out.println("Length 1000: " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph3, arr3[0]);
		System.out.println("Length 2000: " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph4, arr4[0]);
		System.out.println("Length 2000: " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph5, arr5[0]);
		System.out.println("Length 5000: " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph6, arr6[0]);
		System.out.println("Length 5000: " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph7, arr7[0]);
		System.out.println("Length 10 000: " + (System.nanoTime() - startTime) + " ns");
		
		startTime = System.nanoTime();
		BreadthFirstSearch.breadthFirstSearch(graph8, arr8[0]);
		System.out.println("Length 10 000: " + (System.nanoTime() - startTime) + " ns");
		
		
		
		//calculates the depth first search
		System.out.println("\n***Depth First Search***");
		
		DepthFirstSearch obj = new DepthFirstSearch(graph1);
		
		startTime = System.nanoTime();
		obj.depthFirstSearch(arr1[0]);
		System.out.println("Length 1000: " + (System.nanoTime() - startTime) + " ns");
		
		
		DepthFirstSearch obj2 = new DepthFirstSearch(graph2);
		
		startTime = System.nanoTime();
		obj2.depthFirstSearch(arr2[0]);
		System.out.println("Length 1000: " + (System.nanoTime() - startTime) + " ns");
		
		
		DepthFirstSearch obj3 = new DepthFirstSearch(graph3);

		startTime = System.nanoTime();
		obj3.depthFirstSearch(arr3[0]);
		System.out.println("Length 2000: " + (System.nanoTime() - startTime) + " ns");
		
		
		DepthFirstSearch obj4 = new DepthFirstSearch(graph4);

		startTime = System.nanoTime();
		obj4.depthFirstSearch(arr4[0]);
		System.out.println("Length 2000: " + (System.nanoTime() - startTime) + " ns");
		
		
		DepthFirstSearch obj5 = new DepthFirstSearch(graph5);

		startTime = System.nanoTime();
		obj5.depthFirstSearch(arr5[0]);
		System.out.println("Length 5000: " + (System.nanoTime() - startTime) + " ns");
		
		
		DepthFirstSearch obj6 = new DepthFirstSearch(graph6);

		startTime = System.nanoTime();
		obj6.depthFirstSearch(arr6[0]);
		System.out.println("Length 5000: " + (System.nanoTime() - startTime) + " ns");
		
		
		DepthFirstSearch obj7 = new DepthFirstSearch(graph7);

		startTime = System.nanoTime();
		obj7.depthFirstSearch(arr7[0]);
		System.out.println("Length 10 000: " + (System.nanoTime() - startTime) + " ns");
		
	
		DepthFirstSearch obj8 = new DepthFirstSearch(graph8);

		startTime = System.nanoTime();
		obj8.depthFirstSearch(arr8[0]);
		System.out.println("Length 10 000: " + (System.nanoTime() - startTime) + " ns");
		
		
	}


}
