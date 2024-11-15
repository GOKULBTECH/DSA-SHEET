import java.util.Arrays;
import java.util.Scanner;
public class MinimumHeights2 {
public static int minimumHeights(int arr[], int k, int n) {
Arrays.sort(arr);
int mini= arr[n-1] - arr[0];
for(int i=0; i<n; i++) {
if(arr[i]-k<0) {
continue;
}
mini=Math.min(mini, Math.max(arr[n-1]-k, arr[i-1]+k)-

Math.min(arr[0]+k, arr[i]+k ));

}
return mini;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of elements: ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the elements: ");
for(int i=0; i<n; i++) {
arr[i]= sc.nextInt();
}
System.out.println("Enter the value of k: ");
int k= sc.nextInt();
int output = minimumHeights(arr, k, n);
System.out.println("The Minimum Height is: " + output);
sc.close();
}
}