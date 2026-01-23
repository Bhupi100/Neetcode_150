package org.example;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        Product_Of_Array_Except_Self obj = new Product_Of_Array_Except_Self();
        int[] nums = {1,2,4,6};
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1;
        ans[0] = 1;
        for(int i = 1;i<nums.length;i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        for(int j = nums.length-1;j>=0;j--){
            ans[j] = ans[j]*prod;
            prod *= nums[j];
        }
        return ans;
    }
}
