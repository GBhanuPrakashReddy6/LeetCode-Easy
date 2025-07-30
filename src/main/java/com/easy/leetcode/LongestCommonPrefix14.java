package com.easy.leetcode;
/*
14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        Arrays.sort(strs);
        char[] fist=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for (int i = 0; i < fist.length; i++) {
            if (fist[i]!=last[i]){
                break;
            }
            s.append(fist[i]);
        }
        return s.toString();
    }
}
