package com.practice.dsa.problems;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};

        int k = 3;
        System.out.println("Value of K: "+k);
        System.out.println("Original Array:");
        printArray(nums);

        rotate(nums,k);
        System.out.println();

        System.out.println("Rotated Array:");
        printArray(nums);

    }

    private static void printArray(int[] nums) {

        for(Integer num: nums)
            System.out.print(num+" ");

        System.out.println();
    }

    private static void rotate(int[] nums, int k) {

        k = k % nums.length;

        if(nums == null || k < 0)
            throw new IllegalArgumentException("Illegal argument");

        int a = nums.length - k;

        reverse(nums, 0, a - 1);
        reverse(nums, a, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int left, int right) {

        if(nums == null || nums.length == 1)
            return;

        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
