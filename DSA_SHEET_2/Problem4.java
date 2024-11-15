import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    ListNode frontPointer;
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return isPalindrome2Point0(head);
    }
    private boolean isPalindrome2Point0(ListNode currentNode) {
        if (currentNode != null) {
            if (!isPalindrome2Point0(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(head));
        sc.close();
    }
}
