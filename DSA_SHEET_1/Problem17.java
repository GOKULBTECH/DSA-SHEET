// Delete middle element of a stack 
// Given a stack with push(), pop(), and empty() operations, The task is to delete the middle element 
// of it without using any additional data structure. 

import java.util.*;

public class Problem17 {
    public static void del(Stack<Integer> stack) {
        int size = stack.size();
        int mid = size / 2;
        delete(stack, mid);
    }

    private static void delete(Stack<Integer> stack, int middleIndex) {
        if (middleIndex == 0) {
            stack.pop();
            return;
        }

        int top = stack.pop();
        delete(stack, middleIndex - 1);
        stack.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        System.out.println("Enter the size of the stack:");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < n; i++) {
            stk.push(sc.nextInt());
        }

        System.out.println("Stack before deleting middle element: " + stk);
        
        del(stk); 

        System.out.println("Stack after deleting middle element: " + stk);
        sc.close();
    }
}


// Time Complexity : O(n);
// Space Complexity : O(1);
