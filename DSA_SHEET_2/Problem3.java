import java.util.Scanner;

public class Problem3 {
    static int knapSack(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
        else
            return Math.max(knapSack(W, wt, val, n - 1), 
             val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] profits = new int[N];
        for (int i = 0; i < N; i++) {
            profits[i] = sc.nextInt();
        }

        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }
        
        System.out.println(knapSack(W, weights, profits, N)); 
        sc.close();
    }
}
