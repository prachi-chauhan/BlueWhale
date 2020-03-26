package com.prachauhan;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
//         lookup time reduced to O(1) from O(n) in the array
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

//         putting all elements into a map so that lookup becomes easy
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        System.out.println(map);
//         now looking for the complement in the Map
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val) && map.get(val)!=i){
                result[0]=i;result[1]=map.get(val);
            }
        }
        return result;
    }
}
