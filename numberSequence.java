import java.util.Scanner;
import java.util.*;

public class numberSequence {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()) {
			values.add(in.nextInt());
		}
		
		System.out.println("The user inputted numbers:");
		System.out.println(values);
		
		System.out.println("Sorted in ascending order:");

		Collections.sort(values);
		
		int perLine = 10;
		for(int i=0; i<values.size(); i++) {
			//If 10 ints already printed, then new line is printed
			if((i%perLine == 0) && (i>0)) {
				System.out.println();
			}
			System.out.print(values.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Minimum value:");
		System.out.println(values.get(0));
		
		System.out.println("Maximum value:");
		System.out.println(values.get(values.size()-1));
		
		System.out.println("Mean value:");
		double totalSum = 0.0;
		for(int i=0; i<values.size(); i++) {
			totalSum += values.get(i);
		}
		double meanValue = totalSum/values.size();
		
		System.out.printf("%.3f", meanValue);
		System.out.println();
		
		System.out.println("Median value:");
		
		int middle = values.size()/2;
		
		if(values.size()%2 == 0) {
			//Even
			double medEven = ((values.get(middle)+values.get(middle-1))/2.0);
			System.out.println(medEven);
		}
		else {
			//Odd
			int medOdd = values.get(middle);
			System.out.println(medOdd);
		}
		
	}
}
