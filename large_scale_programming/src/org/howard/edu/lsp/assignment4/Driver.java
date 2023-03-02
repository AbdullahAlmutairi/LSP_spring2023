package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;

public class Driver {

	
	
	//Below is sample of how your Driver should look. 
	//Your driver contains your main method and its primary
	//function is to test your IntegerSet class. 
	//Every method in IntegerSet should be sufficiently tested
	//and your output easy to read.  Below is a small
	//example of the granularity of how your output should look. 
	//Each operation on a method should show the contents of your
	//IntegerSet before and after each operation.

	public static final ArrayList<Integer> List = null;

		public static void main(String[] args) throws IntegerSetException {
			IntegerSet set1 = new IntegerSet();
			set1.add(1);
			set1.add(2);
			set1.add(3);
			System.out.println("Value of first set is:" + set1.toString());
			System.out.println("Smallest value in the first set is:"+ set1.smallest());
			System.out.println("Largest value in the first set is:"+ set1.largest());
		
			IntegerSet set2 = new IntegerSet();
			set2.add(4);
			set2.add(5);
			System.out.println("Union of the first set and the second set ");
			System.out.println("Value of the first set is:" + set1.toString());
			System.out.println("Value of the second set:" + set2.toString());
			set1.union(set2);
			System.out.println("Result of union of first set and second set");
			set1.toString();
			
		}

	}