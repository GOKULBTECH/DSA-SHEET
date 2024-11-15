import java.util.HashSet;
import java.util.Scanner;
public class UnionOfArrays {
public static int findUnionCount(int[] a, int[] b) {
HashSet<Integer> unionSet = new HashSet<>();

for (int num : a) {
unionSet.add(num);
}
for (int num : b) {
unionSet.add(num);
}
return unionSet.size();
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements in the first array:");
int n = sc.nextInt();
int[] a = new int[n];
System.out.println("Enter the elements of the first array:");
for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
System.out.println("Enter the number of elements in the second array:");
int m = sc.nextInt();
int[] b = new int[m];
System.out.println("Enter the elements of the second array:");
for (int i = 0; i < m; i++) {
b[i] = sc.nextInt();
}
int result = findUnionCount(a, b);
System.out.println("The number of elements in the union is: " + result);
sc.close();
}
}