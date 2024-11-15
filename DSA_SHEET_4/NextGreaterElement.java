import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement {
public static int[] findNextGreaterElements(int[] arr) {
int n = arr.length;
int[] result = new int[n];
Stack<Integer> stack = new Stack<>();
for (int i = n - 1; i >= 0; i--) {
while (!stack.isEmpty() && stack.peek() <= arr[i]) {
stack.pop();
}
if (!stack.isEmpty()) {
result[i] = stack.peek();
} else {
result[i] = -1;
}
stack.push(arr[i]);
}
return result;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
int[] result = findNextGreaterElements(arr);
System.out.println("The next greater elements are:");
for (int res : result) {
System.out.print(res + " ");
}
sc.close();
}
}