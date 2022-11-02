package p21.mergetwosortedlinklist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import model.ListNode;

class SolutionTest {
    @Test
    public void test1() {

        ListNode list1 = ListNode.createLinkedList(new int[]{1,3,3});
        ListNode list2 = ListNode.createLinkedList(new int[]{2,3,5});

        Assertions.assertTrue(checkList(new Solution().mergeTwoLists(list1, list2)));
    }

    private boolean checkList(ListNode list) {
        if (list == null || list.next == null) {
            return true;
        }
        ListNode node = list;
        while (node.next != null) {
            if (node.val > node.next.val) {
                return false;
            }
            node = node.next;
        }
        return true;
    }
}
