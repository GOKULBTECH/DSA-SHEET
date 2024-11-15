// Maximum Product Subarray 
// Given an integer array, the task is to find the maximum product of any subarray. 

import java.util.Scanner;

public class Problem2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE, prod = 1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                prod *= arr[j];
                max = Math.max(prod, max);
            }
        }
        
        System.out.println(max);
        sc.close();
    }
}

// Input: arr[] = {-2, 6, -3, -10, 0, 2} 
// Output: 180 

// Time complexity : O(n**2);
// Space complexity : O(1);
