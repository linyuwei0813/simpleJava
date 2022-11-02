package p21.mergetwosortedlinklist;


import model.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (isListEmpty(list1)) {
            return list2;
        }
        if (isListEmpty(list2)) {
            return list1;
        }

        ListNode head;
        ListNode current;
        ListNode compared;

        if (list1.val <= list2.val) {
            head = list1;
            current = list1;
            compared = list2;
        } else {
            head = list2;
            current = list2;
            compared = list1;
        }

        while (current.next != null && compared != null) {
            if (current.next.val <= compared.val) {
                current = current.next;
            } else {
                ListNode tempListNode = current.next;
                current.next = compared;
                current = compared;
                compared = tempListNode;
            }
        }
        if(current.next == null && compared!=null){
            current.next = compared;
        }
        return head;
    }

    private boolean isListEmpty(ListNode list) {
        return list == null;
    }
}
