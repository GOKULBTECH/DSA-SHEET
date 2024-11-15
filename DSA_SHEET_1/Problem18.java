// Next Greater Element (NGE) for every element in given Array 
// Given an array, print the Next Greater Element (NGE) for every element.  
// import java.util.Scanner;

import java.util.*;

public class Problem18 {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1); 
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < 2 * n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                int idx = stack.pop();
                ans[idx] = nums[i % n];
            }
            stack.push(i % n);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the Elements of the Array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = nextGreaterElements(nums);
        System.out.println("Next Greater Elements:");
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();  
    }
}

// Time Complexity : O(N);
// Space Complexity : O(N);