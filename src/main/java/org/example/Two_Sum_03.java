package org.example;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_03 {

    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;
        Two_Sum_03 obj = new Two_Sum_03();
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> arrList = new HashMap<>();

        for (int i = 0; i<nums.length;i++){
            int difference = target - nums[i];

            if(arrList.containsKey(difference)) return new int[] {arrList.get(difference),i};
            arrList.put(nums[i],i);
        }
        return new int[] {};
    }
}
