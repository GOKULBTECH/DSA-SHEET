import java.util.Scanner;

public class Problem1 {
    public static int smallerelement(int[] arr, int low, int high, int x) {
        if (low > high) return -1;
        if (x >= arr[high]) return high;
 
        int mid = (low + high) / 2;
 
        if (arr[mid] == x) return mid;
 
        if (mid > 0 && arr[mid - 1] <= x && x < arr[mid]) return mid - 1;
 
        if (x < arr[mid]) return smallerelement(arr, low, mid - 1, x);
 
        return smallerelement(arr, mid + 1, high, x); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        System.out.println(smallerelement(nums, 0, n - 1, x));
        
        sc.close();
    }
}
 