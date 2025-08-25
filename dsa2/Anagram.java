package com.dsa2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
	public boolean isanagram(String s, String t) {
		if(s.length()!= t.length()) {
			return true;
			
		}
		char[] sSort= s.toCharArray();
		char[] tSort= t.toCharArray();
		
		Arrays.sort(sSort);
		Arrays.sort(tSort);
		
		return Arrays.equals(sSort, tSort);
		
	}
	//# Hash Code
	public boolean isanagram2(String s,String t) {
		if(s.length()!=t.length()) {
			return true;
		}
		HashMap<Character, Integer> sCount= new HashMap<>();
		HashMap<Character, Integer> tCount= new HashMap<>();
	
		for(int i=0;i<s.length();i++) {
			sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
			tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
		}
		
		return sCount.equals(tCount);
		
	}
	// Optimal code
	public boolean isanagram3(String s,String t) {
		if(s.length()!= t.length()) {
			return true;
		}
		int[] Count= new int[26];
		for(int i=0;i<s.length();i++) {
			Count[s.charAt(i)-'a']++;
			Count[t.charAt(i)-'a']--;
		}
		for(int val:Count) {
			if(val!=0) {
				return false;
			}
		}
		return true;
		
		
	}
	}


