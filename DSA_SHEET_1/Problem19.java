// Print Right View of a Binary Tree 
// Given a Binary Tree, the task is to print the Right view of it. The right view of a Binary Tree is a 
// set of rightmost nodes for every level. 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Problem19 {
    public static TreeNode createTree() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the root value: ");
            int rootval = sc.nextInt();

            if (rootval == -1) return null;
            TreeNode root = new TreeNode(rootval);
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                System.out.println("Enter the left child of " + curr.val + ": ");
                int leftval = sc.nextInt();
                if (leftval != -1) {
                    curr.left = new TreeNode(leftval);
                    queue.add(curr.left);
                }
                System.out.println("Enter the right child of " + curr.val + ": ");
                int rightval = sc.nextInt();
                if (rightval != -1) {
                    curr.right = new TreeNode(rightval);
                    queue.add(curr.right);
                }
            }
            return root;
        } finally {
            sc.close(); 
        }
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightView(root, result, 0);
        return result;
    }

    public static void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(curr.val);
        }

        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }
}

// Time compexity : O(N);
// space compexity : O(H);