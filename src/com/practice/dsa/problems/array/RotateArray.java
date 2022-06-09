package com.practice.dsa.problems.array;

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

        //STEP 1: reverse the 1st part till k elements
        reverse(nums, 0, a - 1);

        //STEP 2: reverse the 2nd part from kth position to the end of the array
        reverse(nums, a, nums.length - 1);

        //STEP 3: roatate the whole array now
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
