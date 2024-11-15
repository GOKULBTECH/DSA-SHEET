import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static boolean arrayequal(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return Arrays.equals(nums1, nums2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        
        System.out.println(arrayequal(nums1, nums2));
        sc.close();
    }
}
