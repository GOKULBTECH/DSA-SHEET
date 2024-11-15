// Longest Common Prefix using Sorting 
// Given an array of strings arr[]. The task is to return the longest common prefix among each and 
// every strings present in the array. If there‟s no prefix common in all the strings, return “-1”.

import java.util.Scanner;

public class Problem16 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline
        String[] nums = new String[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLine();
        }
        System.out.println(longestCommonPrefix(nums));
        sc.close();
    }
}


// Time Complexity : O(n**2);
// Space Complexity : O(1);
