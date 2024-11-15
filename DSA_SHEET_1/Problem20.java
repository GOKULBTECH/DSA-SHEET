// Maximum Depth or Height of Binary Tree 
// Given a binary tree, the task is to find the maximum depth or height of the tree. The height of the 
// tree is the number of vertices in the tree from the root to the deepest node. 

import java.util.LinkedList;
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

public class Problem20 {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        System.out.println(maxDepth(root));
    }

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
}

// Time compexity : O(N);
// space compexity : O(H);