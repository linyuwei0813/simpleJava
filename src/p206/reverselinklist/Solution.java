package p206.reverselinklist;

import model.ListNode;


class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode current = head;
        ListNode next = current.next;
        while (current != null) {
            current.next = pre;
            pre = current;
            current = next;
            if (current != null) {
                next = current.next;
            }
        }
        return pre;
    }
}
