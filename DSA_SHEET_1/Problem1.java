// 1. Maximum Subarray Sum – Kadane‟s Algorithm: 
// Given an array arr[], the task is to find the subarray that has the maximum sum and return its 
// sum. 

import java.util.Scanner;

public class Problem1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            max = Math.max(sum, max);
            if(sum < 0) sum=0;
        }
        System.out.println("Maximum Subarray sum is"+ " " + max);

        sc.close();
    }
}


// Output:
// arr = {1,2,3,4,5}
// Maximum Subarray sum is 15


// Time complexity : O(n);
// Space complexity : O(1);
