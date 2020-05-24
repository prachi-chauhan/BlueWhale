package com.prachauhan.problem.solving.two;

public class RearrangeString {
    public RearrangeString() {
    
    }
    
    public String reorganizeString(String S) {
        int count_rots = 0;
        for (int i = 0; ; i=0) {
            char ch;
            if ((S.charAt(i) == S.charAt(i + 1))) {
                ch = S.charAt(i);
                //rotate by 1 element
                S=S.substring(i+1);
                S=S.concat(String.valueOf(ch));
                count_rots++;
            }
            if (count_rots == S.length()/2)
                break;
        }
        if (count_rots > S.length()/2) {
            return "";
        } else {
            return S;
        }
    }
}
