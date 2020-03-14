package com.prachauhan;

import java.util.ArrayList;

public class LongestSubsting {
    private static int length;
    
    LongestSubsting(String s) {
        setLength(lengthOfLongestSubstring(s));
    }
    
    public int getLength() {
        return length;
    }
    
    private void setLength(int length) {
        this.length = length;
    }
    
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> result = new ArrayList();
        ArrayList<Character> temp = new ArrayList();
        if (s.trim().length() == 0 || s == null) {
            return 0;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (temp.contains(s.charAt(i))) {
                    result = temp;
                    if (temp.size() > result.size()) {
                        temp = null;
                        continue;
                    } else {
                        temp.add(s.charAt(i));
                    }
                }
            }
        }
        return result.size();
    }
}
