package p206.reverselinklist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import model.ListNode;

class SolutionTest extends Solution{
    @Test
    public void test(){
        ListNode list = ListNode.createLinkedList(new int[]{1,2,3,4,5});
        Assertions.assertTrue(ListNode.isEqual(ListNode.createLinkedList(new int[]{5,4,3,2,1}),reverseList(list)));
    }

}
