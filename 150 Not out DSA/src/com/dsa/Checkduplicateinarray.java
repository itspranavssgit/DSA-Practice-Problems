package com.dsa;

import java.util.Scanner;

public class Checkduplicateinarray {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		brute_hasduplicate arr= new brute_hasduplicate();
		
		int[] arr1= {1,1,2,1,2};
		int[] arr2= {1,2,3,4,5};
		
		System.out.println("Duplicates:"+arr.hasduplicate4(arr1));
		System.out.println("Arr2 has duplicates:"+arr.hasduplicate4(arr2));
	}

}
