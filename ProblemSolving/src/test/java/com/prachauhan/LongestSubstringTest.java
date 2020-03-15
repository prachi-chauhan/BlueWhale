package com.prachauhan;

import org.junit.Test;

public class LongestSubstringTest {
    
    @Test
    public void longestSubstring() {
        String s="abcabcbb";
        String s1 ="aaaaa";
        String s2="pwwkew";
        String s3="dvdf";
        String s4=" ";
        String [] arr={s,s1,s2,s3, s4, "ckilbkd","ohvhjdml"};
        for (String i : arr){
            LongestSubsting longestSubsting = new LongestSubsting(i);
            System.out.println(longestSubsting.getLength());
        }
      
    }
}
