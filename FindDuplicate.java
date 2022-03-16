/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: name: Ojas Jain, email: oj34@scarletmail.rutgers.edu, NETid: oj34
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

			int sum = 0;

			for(int i = 0; i < args.length; i++) {
				sum+= Integer.parseInt(args[i]);
			}

			int trueSum = ((args.length)*(args.length+1))/2;
			if (trueSum == sum) {
				System.out.println("false");
			}
			else {
				System.out.println("true");
			}

		

	}

}
