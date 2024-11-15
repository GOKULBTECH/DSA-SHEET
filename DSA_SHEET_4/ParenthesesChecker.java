import java.util.Scanner;
import java.util.Stack;
public class ParenthesesChecker {
public static boolean validPar(String s) {
Stack<Character> st = new Stack<>();
for (int i = 0; i < s.length(); i++) {
char ch = s.charAt(i);
if (ch == '(' || ch == '{' || ch == '[') {
    st.push(ch);
    }
    else {
    if (st.isEmpty()) {
    return false;
    }
    char top = st.peek();
    if ((top == '(' && ch == ')') ||
    (top == '{' && ch == '}') ||
    (top == '[' && ch == ']')) {
    st.pop();
    } else {
    return false;
    }
    }
    }
    return st.isEmpty();
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s = sc.nextLine();
    boolean output = validPar(s);
    if (output)
    System.out.println("true");
    else
    System.out.println("false");
    sc.close();
    }
    }