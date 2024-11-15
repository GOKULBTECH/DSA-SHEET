import java.util.Scanner;

class Problem1 {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1;
        int max = 0;
        while (j < prices.length) {
            if (prices[j] < prices[i]) {
                i = j;
            } else {
                max = Math.max(max, prices[j] - prices[i]);
            }
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the prices for each day:");
        for (int k = 0; k < n; k++) {
            prices[k] = scanner.nextInt();
        }
        Problem1 solution = new Problem1();
        int maxProfit = solution.maxProfit(prices);
        System.out.println("The maximum profit is: " + maxProfit);
        scanner.close();
    }
}
