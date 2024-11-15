import java.io.*;
import java.util.Scanner;

class Problem5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        int newLength = obj.removeDuplicates(nums);
        
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
