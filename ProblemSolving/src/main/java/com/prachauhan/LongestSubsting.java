package com.prachauhan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Cases covered: "aaaa","abcabc",""," "
 *
 * @author prachichauhan
 */
public class LongestSubsting {
    private static int length;
    LongestSubsting() {
    }
    
    public int getLength() {
        return length;
    }
    
    private void setLength() {
        this.length = length;
    }
    
    private static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> result = new ArrayList();
        ArrayList<Character> temp = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.charAt(i));
        }
        if (s.length() == 0 || s == null) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        } else {
            int index;
            for (int i = 0; i < s.length(); i++) {
                if (!result.contains(temp.get(i))) {
                    result.add(temp.get(i));
                } else {
                    index=result.indexOf(temp.get(i));
                    if (result.get(0) == temp.get(i)) {
                        result.remove(0);
                        result.add(temp.get(i));
                    } else {
//                        case where the duplicate character is in the middle of the string consecutively :"abccdefg" "pwwkew"
//                        substring from index of last occurrence to include cases like "ohvhjdml" and "wobgrovw"
                        String substring = s.substring(index);
                        //                        case where the duplicate character is in the middle of the string non-consecutively :"ckilbkd"
                        int res = lengthOfLongestSubstring(substring);
                        if (res > result.size()) {
                            return res;
                        }
                        break;
                    }
                }
            }
        }
        return result.size();
    }
    
    public int getLengthOflongestSubstring(String s){
        length= lengthOfLongestSubstring(s);
        return length;
    }
}
