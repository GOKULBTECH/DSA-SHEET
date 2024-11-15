import java.util.Scanner;

public class Problem8 {
    public static int coinchange(int[] coins, int amount){
        if(amount < 1)  return 0;
        int[] arr = new int[amount+1];
        for(int i=1; i<=amount; i++){
            arr[i] = Integer.MAX_VALUE;
            for(int coin : coins){
                if((coin <= i)  && (arr[i - coin] != Integer.MAX_VALUE)){
                    arr[i] = Math.min(arr[i], arr[i - coin]+1);
                }
            }
        }
        if(arr[amount] == Integer.MAX_VALUE)    return -1;
        return arr[amount];
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int amount = sc.nextInt();
            System.out.println(coinchange(arr, amount));
            sc.close();
    }
}
