package com.prachauhan;

public class BinaryNumberInLinkedListToInt {
        int res=0;
        int len=0,exp=0;
        ListNode curr;
        public int getDecimalValue(ListNode head) {
            curr=head;
            while(curr!=null){
                len++;
                curr=curr.next;
            }
            curr=head;
            if(len<=30){
                while(len>0 && curr!=null){
                    if (curr.val==0 || curr.val==1){
                        exp=(int)Math.pow(2,len-1);
                        res+=curr.val*exp;
                    }
                    len--;
                    curr=curr.next;
                }
            }
            return res;
        }
}
