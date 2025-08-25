package com.dsa3;

import java.util.Arrays;
import java.util.Comparator;

public class twosum {
//# BruteForce
	public int[] istwosum(int[] nums,int target) {
		for(int i=1;i<nums.length;i++) {
			for(int j=i-1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[]{i,j};
				}
			}
		}
		return new int[0];
	}
	
	public int[] istwosum2(int[] nums, int target) {
		int[][] A = new int[nums.length][2];
		for(int i=0;i<nums.length;i++) {
			A[i][0]=nums[i];
			A[i][1]=i;
		}

        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            if (cur == target) {
                return new int[]{Math.min(A[i][1], A[j][1]), 
                                 Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
