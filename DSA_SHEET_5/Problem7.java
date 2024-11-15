import java.util.Arrays;
import java.util.Scanner;

class Problem7 {
    public static void convertToWave(int[] arr) {
        int i = 0, n = arr.length;
        while (i < n - 1) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i += 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        convertToWave(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
