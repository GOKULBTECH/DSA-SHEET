import java.util.ArrayList;
import java.util.Scanner;

class Problem2 {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int left = 0, right = n - 1;
        list.add(-1); 
        list.add(-1); 
        
        while (left <= right) {
            if (arr[left] == x && arr[right] == x) {
                list.set(0, left);
                list.set(1, right);
                break;
            }
            if (arr[left] != x) left++;
            if (arr[right] != x) right--;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int x = scanner.nextInt();

        Problem2 problem = new Problem2();
        ArrayList<Integer> result = problem.find(arr, x);

        System.out.println("First and last occurrences of " + x + ": " + result);
        scanner.close();
    }
}
