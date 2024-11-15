// Search in a sorted and rotated Array 
// Given a sorted and rotated array arr[] of n distinct elements, the task is to find the index of given 
// key in the array. If the key is not present in the array, return -1. 

import java.util.Scanner;

public class Problem3 {
    static int findelement(int[] nums, int target){
        int n = nums.length;
        if(nums[n-1] >= target){
            for(int i = n-1; i>=0; i--){
                if(nums[i] == target)   return i;
            }
        }
        else{
            for(int i=0; i<n-1; i++){
                if(nums[i] == target)   return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the Target Element");
        int target = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(findelement(nums, target));
        sc.close();
    }
}

// Input  : arr[] = {4, 5, 6, 7, 0, 1, 2}, key = 0 
// Output : 4 

// Time complexity : O(n);
// Space complexity : O(1);