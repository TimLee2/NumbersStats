/*
 * Author: Tim Lee
 * File: numberSequence.java
 * Assignment: Assignment 1
 * Course: CSI 3130
 * Due Date: 9/11/2017
 * 
 * Description: This program will read a sequence of integers until a 
 * non-numeric character is entered. The program will then print:
 *     -The ascending order with 10 integers in a row
 *     -The maximum
 *     -The minimum
 *     -The mean
 *     -The median
 */

import java.util.Scanner;
import java.util.*;

public class numberSequence {

	public static void main(String[] args) {
		
		/*
		 * A List is used instead of an array due to the unknown amount
		 * of ints being read.
		 */
		List<Integer> values = new ArrayList<Integer>();
		
		Scanner in = new Scanner(System.in);
		
		//While next value entered is an int, scanner will keep reading
		while(in.hasNextInt()) {
			values.add(in.nextInt());
		}
		
		System.out.println("The user inputted numbers:");
		System.out.println(values);
		
		System.out.println("Sorted in ascending order:");
		/*
		 * Method from java.util.Collections class.
		 * Used to sort elements in a List.
		 */
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
		//Gets the value of last element of List
		System.out.println(values.get(values.size()-1));
		
		System.out.println("Mean value:");
		double totalSum = 0.0;
		for(int i=0; i<values.size(); i++) {
			totalSum += values.get(i);
		}
		double meanValue = totalSum/values.size();
		//Set precision to 3 decimal places
		System.out.printf("%.3f", meanValue);
		System.out.println();
		
		System.out.println("Median value:");
		//Gets the middle element in the List
		int middle = values.size()/2;
		/*
		 * If size of List is even, then add the "left-middle" and 
		 * "right-middle values together, and get average of the two.
		 * 
		 * If size of List is odd, then simply get the value of middle element.
		 */
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
