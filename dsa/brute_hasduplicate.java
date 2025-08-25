package com.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class brute_hasduplicate {
//# brute force
	public boolean hasduplictes(int[] nums){
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	// # By Sorting
	public boolean hasduplicates1(int[] nums) {
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				return true;
			}
		}
		return false;
		
		
	}
	//#hash code
	
	public boolean hasduplicates3(int[] nums) {
		Set seen= new HashSet<>();
		for(int num: nums) {
			if(seen.contains(num)) {
				return true;
			}
			seen.add(num);
		}
		return false;
		
	}
	public boolean hasduplicate4(int[] nums) {
		return Arrays.stream(nums).distinct().count()<nums.length;		
		
	}
}
