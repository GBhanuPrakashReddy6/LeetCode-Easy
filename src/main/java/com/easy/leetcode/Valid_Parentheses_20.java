package com.easy.leetcode;

import javax.swing.plaf.nimbus.State;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false
 */
public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for (char c: s.toCharArray()){
            if (map.containsValue(c)){
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.pop()){
                    return false;
                }
            }
        }
return stack.isEmpty();
    }
}
