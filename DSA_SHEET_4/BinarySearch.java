import java.util.Scanner;
public class BinarySearch {
public static int binarySearch(int[] arr, int k) {
int low = 0;
int high = arr.length - 1;
while (low <= high) {
int mid = (low + high) / 2;
if (arr[mid] == k) {
return mid;
}
else if (arr[mid] < k) {
low = mid + 1;
}
else {
high = mid - 1;
}
}
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements in sorted order:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.println("Enter the value of k:");
int k = sc.nextInt();
int output = binarySearch(arr, k);
if (output == -1)
System.out.println("Element is not present in the array");
else
System.out.println("The element " + k + " is present at index " + output);
sc.close();
}
}