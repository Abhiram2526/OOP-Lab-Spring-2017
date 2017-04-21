/**
* (Fibonacci Series) The Fibonacci series
*
* 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
*
* begins with the terms 0 and 1 and has the property that each succeeding term is the sum of
* the two preceding terms.
*
* 1. Write a method fibonacci(n) that calculates the nth Fibonacci number. Incorporate
* this method into an application that enables the user to enter the value of n.
* 2. Determine the largest Fibonacci number that can be displayed on your system.
*/


import java.util.Scanner;

public class FibonacciNumber {		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter the value of N : ");
		long n = input.nextLong();

		System.out.println("Nth fibonacci number is : " + fibonacciSeries(n));

		largestFibonacci();
	}

	public static long fibonacciSeries(long n) {
		long i = -1, j = 1, fsum = 0;
		for(int count = 0; count < n; count++) {
			fsum = i+j;
			i = j;
			j = fsum;

			if(count == n-1)
				break;
		}
		return fsum;
	}

	public static void largestFibonacci() {
		long count = 2, largestFibonacci = 0;
		
		while(fibonacciSeries(count)>=0) {
			largestFibonacci = fibonacciSeries(count);
			++count;
		}
		System.out.println("Largest Fibonacci Number possible : " + largestFibonacci);
	}
}