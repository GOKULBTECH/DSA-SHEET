import java.io.*;
import java.util.*;

class Problem6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        
        Solution obj = new Solution();
        System.out.println(obj.minIndex(nums, pos));
        sc.close();
    }
}

class Solution {
    int minIndex(int arr[], int pos) {
        int low = 0;
        int high = pos;
        int i = pos;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] != arr[pos]) {
                low = mid + 1;
            } else {
                high = mid - 1;
                i = mid;
                if (mid > 0 && arr[mid - 1] != arr[pos]) {
                    break;
                }
            }
        }
        return i;
    }
}
