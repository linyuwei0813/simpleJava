package p141.linkedlistcycle;

import model.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && slow != null) {
            if (fast.next == null) {
                return false;
            } else {
                fast = fast.next.next;
                slow = slow.next;
            }

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
