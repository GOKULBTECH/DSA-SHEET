// Print a given matrix in spiral form 
// Given an m x n matrix, the task is to print all elements of the matrix in spiral form. 


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem10 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int row=0 , rowls=matrix.length-1;
        int col=0 , colls=matrix[0].length-1;
        while(row<=rowls && col<=colls){
            for(int i=col; i<=colls; i++){
                ans.add(matrix[row][i]);
            }
            row++;
            for(int i=row; i<=rowls; i++){
                ans.add(matrix[i][colls]);
            }
            colls--;
            if(rowls>=row){
                for(int i=colls; i>=col; i--){
                    ans.add(matrix[rowls][i]);
                }
                
            }
            rowls--;
            if(col<=colls){
                for(int i=rowls; i>=row; i--){
                    ans.add(matrix[i][col]);

                }
                
            }
            col++;
        }
        return ans;
    }
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
        System.out.println(spiralOrder(matrix));
      sc.close();  
    }
}

// Time Complexity : O(n);
// Space Complexity : O(n);