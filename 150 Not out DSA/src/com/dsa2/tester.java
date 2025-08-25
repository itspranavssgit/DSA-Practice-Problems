package com.dsa2;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		Anagram a= new Anagram();
		System.out.println("Enter the First Word:");
		String w1= sc.next();
		System.out.println("Enter the Second Word:");
		String w2= sc.next();
		
		System.out.println("It is Anagram:"+a.isanagram2(w1, w2));
	}

}
