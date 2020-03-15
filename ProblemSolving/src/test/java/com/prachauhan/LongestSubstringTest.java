package com.prachauhan;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class LongestSubstringTest {
    LongestSubsting longestSubsting = new LongestSubsting();
    
    @Test
    public void longestSubstring() {
        String s = "abcabcbb";
        String s1 = "aaaaa";
        String s2 = "pwwkew";
        String s3 = "dvdf";
        String s4 = " ";
        String s5 = "ckilbkd";
        String s6 = "ohvhjdml";
        String[] arr = {s, s1, s2, s3, s4, s5, s6};
        Assert.assertEquals(longestSubsting.getLengthOflongestSubstring(s), 3);
        Assert.assertEquals(longestSubsting.getLengthOflongestSubstring(s1), 1);
        Assert.assertEquals(longestSubsting.getLengthOflongestSubstring(s2), 3);
        Assert.assertEquals(longestSubsting.getLengthOflongestSubstring(s3), 3);
        Assert.assertEquals(longestSubsting.getLengthOflongestSubstring(s4), 1);
        Assert.assertEquals(longestSubsting.getLengthOflongestSubstring(s5), 5);
        Assert.assertEquals(longestSubsting.getLengthOflongestSubstring(s6), 6);
    }
}
