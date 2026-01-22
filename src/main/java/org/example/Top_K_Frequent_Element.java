package org.example;

import java.util.*;

//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//
//The test cases are generated such that the answer is always unique.
//
//You may return the output in any order.
//
//        Example 1:
//
//Input: nums = [1,2,2,3,3,3], k = 2
//
//Output: [2,3]
//Example 2:
//
//Input: nums = [7,7], k = 1
//
//Output: [7]


public class Top_K_Frequent_Element {
    public static void main(String[] args) {
        Top_K_Frequent_Element obj = new Top_K_Frequent_Element();
        int k = 2;
        int[] nums = {21,23,4,2,32,412,12,124,4,3,1,4,532,1,21,4,3,32,1,1,2};

        System.out.println(Arrays.toString(obj.topKFrequent(nums,k)));
    }

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int num : nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        List<Integer>[] sortedList = new List[nums.length+1];
        for (int key : hashMap.keySet()){
            int freq = hashMap.get(key);
            if(sortedList[freq] == null) sortedList[freq] = new ArrayList<>();
            sortedList[freq].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int j = nums.length;j>0 && res.size()<k;j--){
            if (sortedList[j] != null) res.addAll(sortedList[j]);
        }
        int[] result = new int[k];
        for (int z = 0; z<k;z++){
            result[z] = res.get(z);
        }
        return result;
    }
}