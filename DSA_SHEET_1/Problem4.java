// container with Most Water 

import java.util.Scanner;

public class Problem4 {
    static int maxwater(int[] arr){
        int left= 0, right = arr.length-1, maxarea =0;
        while(left < right){
            int area = Math.min(arr[left], arr[right]) * (right - left);
            maxarea = Math.max(area, maxarea);
            if(arr[left] < arr[right])  left++;
            else    right--;
        }
        return maxarea;
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
        System.out.println(maxwater(nums));
        sc.close();  
    }
}

// Time complexity : O(n)
// Space complexity : O(1)