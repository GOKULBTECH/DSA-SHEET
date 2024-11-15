// Trapping Rainwater Problem states that given an array of n non-negative integers arr[] 
// representing an elevation map where the width of each bar is 1, compute how much water it can 
// trap after rain. 


import java.util.Scanner;

public class Problem6 {
        public static int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int leftMax = height[left];
            int rightMax = height[right];
            int water = 0;
    
            while (left < right) {
                if (leftMax < rightMax) {
                    left++;
                    leftMax = Math.max(leftMax, height[left]);
                    water += leftMax - height[left];
                } else {
                    right--;
                    rightMax = Math.max(rightMax, height[right]);
                    water += rightMax - height[right];
                }
            }
    
            return water;        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(trap(arr));
        sc.close();
    }
}

// Time Complexity : O(n);
// Space Complexity : O(1);