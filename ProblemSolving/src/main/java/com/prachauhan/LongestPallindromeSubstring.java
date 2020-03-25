package com.prachauhan;

import java.util.ArrayList;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * @author prachichauhan
 */
public class LongestPallindromeSubstring {
    
    public String longestPalindrome(String s) {
        int len = s.length();
//        Case for len=0 or 1 -> return the string as is.
        if (0 <= len && len < 2)
            return s;
//        Case for len=2 -> if it's a pallindrome retrun it as it.
        else if (len == 2) {
            if (isPallindrome(s))
                return s;
            else {
//                if not a pallindrome, return the first character of the string --->applies to all substrings?
                return Character.toString(s.charAt(0));
            }
        } else
            return findSubstrings(s);
    }
    
    private String findSubstrings(String s) {
        String res="";
        int len = s.length();
        ArrayList<String> substringList = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                substringList.add(s.substring(i, j));
            }
        }
        
        for (String sub : substringList) {
            if (isPallindrome(sub)) {
                if (res.length() < sub.length()) {
                    res=sub;
                }
            }
        }
        return res;
    }
    
    private Boolean isPallindrome(String s) {
        StringBuilder rev = new StringBuilder(s);
        
        if (s.equals(rev.reverse().toString())) {
            return true;
        } else return false;
    }
    
}
