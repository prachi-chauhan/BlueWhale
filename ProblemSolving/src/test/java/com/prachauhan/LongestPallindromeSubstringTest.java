package com.prachauhan;

import org.junit.Test;

public class LongestPallindromeSubstringTest {
    
    LongestPallindromeSubstring longestPallindromeSubstring = new LongestPallindromeSubstring();
    
    enum Tests {
        ABC, ABA, AA, A, redisdvider, redivider, madamchuff;
    }
    
    @Test
    public void longestPallindromeSubstringTest() {
        
        String longestPallindrome = longestPallindromeSubstring.longestPalindrome("azwdzwmwcqzgcobeeiphemqbjtxzwkhiqpbrprocbppbxrnsxnwgikiaqutwpftbiinlnpyqstkiqzbggcsdzzjbrkfmhgtnbujzszxsycmvipjtktpebaafycngqasbbhxaeawwmkjcziybxowkaibqnndcjbsoehtamhspnidjylyisiaewmypfyiqtwlmejkpzlieolfdjnxntonnzfgcqlcfpoxcwqctalwrgwhvqvtrpwemxhirpgizjffqgntsmvzldpjfijdncexbwtxnmbnoykxshkqbounzrewkpqjxocvaufnhunsmsazgibxedtopnccriwcfzeomsrrangufkjfzipkmwfbmkarnyyrgdsooosgqlkzvorrrsaveuoxjeajvbdpgxlcrtqomliphnlehgrzgwujogxteyulphhuhwyoyvcxqatfkboahfqhjgujcaapoyqtsdqfwnijlkknuralezqmcryvkankszmzpgqutojoyzsnyfwsyeqqzrlhzbc");
        System.out.println("Longest Pall: "+longestPallindrome);
    }
    
}
