import java.util.Scanner;

class Problem3 {
    int transitionPoint(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (0s followed by 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Problem3 problem = new Problem3();
        int result = problem.transitionPoint(arr);

        System.out.println("Transition point index: " + result);
        scanner.close();
    }
}
