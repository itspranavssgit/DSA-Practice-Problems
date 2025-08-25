package com.dsa3;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		twosum sum= new twosum();
		
		int[] arr1= {1,2,3,4,5};
		System.out.println("Enter the Target:");
		int tar= sc.nextInt();
		
		int[] result= sum.istwosum(arr1, tar);
		
		System.out.println("Result:"+Arrays.toString(result));
		
		
	}

}
