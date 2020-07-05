package com.prachauhan;

import java.util.Stack;

/**
 * @author prachichauhan
 */
public class SplitStringIntoBalancedStrings {
    
    public int balancedStringSplit(String s) {
        int num = 0;
        int countR = 0, countL = 0;
        // basically find strings with equal num of R and L
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                countR += 1;
            else
                countL += 1;
            if (countL == countR)
                num++;
        }
        return num;
//        return stackImpl(s);
    }
    
    private int stackImpl(String s) {
        int num = 0;
        int c = 0;
        Stack stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.empty() && c>0 && s.charAt(i) == 'L')
                num+=1;
            if (!stack.empty() && stack.peek().equals('R') && s.charAt(i) == 'L') {
                stack.pop();
                num += 1;
            }
            if (!stack.empty() && stack.peek().equals('L') && s.charAt(i) == 'R') {
                stack.pop();
                c += 1;
            }
            stack.push(s.charAt(i));
        }
        return num;
    }
}
