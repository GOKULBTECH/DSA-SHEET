import java.util.Scanner;

public class Problem9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (rows and columns):");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    int ind = i - 1;
                    while (ind >= 0) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i + 1;
                    while (ind < rows) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind = j - 1;
                    while (ind >= 0) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }
                    ind = j + 1;
                    while (ind < cols) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j] = 1;
                }
            }
        }

        System.out.println("Modified Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// Time complexity : O(N^2);
// Space Complexity : O(1);