import java.util.HashSet;
import java.util.Scanner;

class Problem4 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) {
            return 1; 
        }
        
        int max = 0;
        HashSet<Integer> a = new HashSet<>(); 
        
        for (int n : nums) {
            a.add(n); 
        }
        
        for (int num : a) {
            if (!a.contains(num - 1)) {
                int h = num;
                int c = 1;
                
                while (a.contains(h + 1)) {
                    h++;
                    c++;
                }
                max = Math.max(max, c);
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
    
        Problem4 solution = new Problem4();
        int result = solution.longestConsecutive(nums);
        
        System.out.println("The length of the longest consecutive sequence is: " + result);
        
        scanner.close();
    }
}
