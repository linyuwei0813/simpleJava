package p141.linkedlistcycle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import model.ListNode;

class SolutionTest extends Solution{
    @Test
    public void test(){
        ListNode cycledLinkedList = ListNode.createCycledLinkedList(new int[]{1}, -1);
        Assertions.assertFalse(hasCycle(cycledLinkedList));
    }

    @Test
    public void test1(){
        ListNode cycledLinkedList = ListNode.createCycledLinkedList(new int[]{3,2,0,-4}, 1);
        Assertions.assertTrue(hasCycle(cycledLinkedList));
    }
}
