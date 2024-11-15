import java.io.*;
import java.util.*;

class Problem4 extends Solution{
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Problem4 obj = new Problem4();
            System.out.println(obj.firstRepeated(arr));
            sc.close();
        }
    }

class Solution {
    public int firstRepeated(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
