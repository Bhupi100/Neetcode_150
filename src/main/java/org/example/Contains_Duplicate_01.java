package org.example;

import java.util.HashSet;

public class Contains_Duplicate_01 {

    public static void main(String args[]){
        Contains_Duplicate_01 obj = new Contains_Duplicate_01 ();
        int[] nums = {1,243324,412,213,3,4,214,4,123,213,4,1,3};
        System.out.print(obj.hasDuplicate(nums));
    }
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int num : nums) {
            if (hashset.contains(num)) return true;
            hashset.add(num);
        }
        return false;
    }
}