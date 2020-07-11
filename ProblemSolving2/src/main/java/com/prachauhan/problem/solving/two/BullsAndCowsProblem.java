package com.prachauhan.problem.solving.two;

import java.util.HashMap;

/**
 * for a given guess, bulls are the number of digits that match in value
 * and position to the digits in the secret and cows are the digits in the
 * guess that match only in value and not in position
 */
public class BullsAndCowsProblem {
    
    /**
     * using a hashmap to store the non-bull digits from the secret and the number
     * of times they occur in the secret
     */
    public String getHint(String secret, String guess) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int bulls = 0;
        int cows = 0;
        //checking for bulls
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            
            if (c1 == c2) {
                bulls++;
            } else {
                if (map.containsKey(c1)) {
                    int freq = map.get(c1);
                    freq++;
                    map.put(c1, freq);
                } else {
                    map.put(c1, 1);
                }
            }
        }
        
        //checking for cows
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            
            // only need to check for cases with c1!=c2
            if (c1 != c2) {
                // if secret has the digit c2
                if (map.containsKey(c2)) {
                    //increment cows by 1
                    cows++;
                    // if the frequency of digit c2 in secret is 1, i.e. no duplicates
                    if (map.get(c2) == 1) {
                        //remove it because we've already counted cows for this digit
                        map.remove(c2);
                    } else {
                        //if there are duplicates of c2 in secret, decrement the freq of c2
                        int freq = map.get(c2);
                        freq--;
                        map.put(c2, freq);
                    }
                }
            }
        }
        return bulls + "A" + cows + "B";
    }
}
