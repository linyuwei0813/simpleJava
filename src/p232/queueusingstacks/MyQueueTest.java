package p232.queueusingstacks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyQueueTest extends MyQueue{
    @Test
    public void test(){
        MyQueue q  = new MyQueue();
        q.push(1);
        q.push(2);
        Assertions.assertEquals(1,q.peek());
        Assertions.assertEquals(1,q.pop());
        Assertions.assertFalse(q.empty());
    }

}
