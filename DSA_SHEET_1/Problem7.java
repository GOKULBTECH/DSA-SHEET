// Chocolate Distribution Problem 
// Given an array arr[] of n integers where arr[i] represents the number of chocolates in ith packet. 
// Each packet can have a variable number of chocolates. There are m students, the task is to 
// distribute chocolate packets such that:  
// Each student gets exactly one packet. 
// The difference between the maximum and minimum number of chocolates in the packets given 
// to the students is minimized. 


import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
    static int findMinDiff(int[] arr, int m) {
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the Childeren");
        int m = sc.nextInt();
        System.out.println(findMinDiff(nums, m));
        sc.close();
        
    }
}

// Time Complexity : O(n);
// Space Complexity : O(1);