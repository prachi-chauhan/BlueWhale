package com.prachauhan;

import java.util.ArrayList;
import java.util.List;

public class DecompressREList {
    public int[] decompressRLElist(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            //pair of adjacent elements
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq != 0) {
                temp.add(val);
                freq -= 1;
            }
            res.addAll(temp);
        }
        int[] resArr=new int[res.size()];
        for(int i=0;i<res.size();i++)
            resArr[i]=res.get(i);
        
        return resArr;
    }
}
