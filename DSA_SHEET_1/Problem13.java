// Check if given Parentheses expression is balanced or not 
// Given a string str of length N, consisting of „(„ and „)„ only, the task is to check whether it is 
// balanced or not. 


import java.util.Scanner;
import java.util.Stack;

public class Problem13 {
    public static boolean ispar(String s) {  
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i)); 
            } 
            else {
                if (!stk.empty() && 
                    ((stk.peek() == '(' && s.charAt(i) == ')') ||
                     (stk.peek() == '{' && s.charAt(i) == '}') ||
                     (stk.peek() == '[' && s.charAt(i) == ']'))) {
                    stk.pop(); 
                }
                else {
                    return false;
                }
            }
        }
        return stk.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ispar(str)? "Balanced" : "Unbalanced");
        sc.close();
    }
}

// Time Complexity : O(n);
// Space Complexity : O(n);