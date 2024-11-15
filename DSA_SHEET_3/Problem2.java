import java.util.Scanner;

public class Problem2 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0, index = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                count += mat[i][j];
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return new int[]{index, max};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter the elements of the matrix (0 or 1):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        Problem2 solution = new Problem2();
        int[] result = solution.rowAndMaximumOnes(mat);
        System.out.println("Row index with the maximum number of ones: " + result[0]);
        System.out.println("Maximum number of ones: " + result[1]);
    }
}
