package com.prachauhan;

import org.junit.Test;

public class LongestSubstringTest {
    
    @Test
    public void longestSubstring() {
        String s="abcabcbb";
        LongestSubsting longestSubsting = new LongestSubsting(s);
        System.out.println(longestSubsting.getLength());
    }
}
