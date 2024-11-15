import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;
    Node(int data) { this.data = data; }
}

class Tree {
    boolean ans = true;
    
    int solve(Node root) {
        if (root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        if (Math.abs(left - right) > 1) ans = false;
        return Math.max(left, right) + 1;
    }
    
    boolean isBalanced(Node root) {
        solve(root);
        return ans;
    }
}

public class Problem5 {
    public static Node buildTree() {
        try (Scanner sc = new Scanner(System.in)) {
            int data = sc.nextInt();
            if (data == -1) return null;
            Node root = new Node(data);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                int leftData = sc.nextInt();
                if (leftData != -1) {
                    current.left = new Node(leftData);
                    queue.add(current.left);
                }
                int rightData = sc.nextInt();
                if (rightData != -1) {
                    current.right = new Node(rightData);
                    queue.add(current.right);
                }
            }
            return root;
        }
    }
    
    public static void main(String[] args) {
        Node root = buildTree();
        Tree tree = new Tree();
        System.out.println(tree.isBalanced(root));
    }
}
