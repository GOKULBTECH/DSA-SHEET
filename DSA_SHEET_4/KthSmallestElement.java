import java.util.*;
public class KthSmallestElement {
public static int kthSmallest(int arr[], int k) {
Arrays.sort(arr);
return arr[k-1];
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n = sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter the elements:");
for(int i=0; i<n; i++) {
arr[i] = sc.nextInt();
}
System.out.println("Enter the value of k:");
int k = sc.nextInt();
int output = kthSmallest(arr, k);
System.out.println("The kth smallest element is " + output);
sc.close();
}
}