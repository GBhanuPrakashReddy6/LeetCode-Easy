package com.easy.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {

        int i=1;

            for (int j = 1; j < nums.length; j++) {
                System.out.println(nums[j]+" "+nums[i-1]);
                if (nums[j] != nums[i - 1]) {
                    nums[i] = nums[j];
                    i++;
                }

            }


        return i;
    }
}
