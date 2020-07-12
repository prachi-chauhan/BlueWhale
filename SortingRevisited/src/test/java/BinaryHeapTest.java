import org.junit.Test;

import java.util.logging.Logger;

public class BinaryHeapTest {
    private static final Logger logger = Logger.getLogger(BinaryHeapTest.class.getName());
    
    @Test
    public void minHeapTest() {
        BinaryHeap minHeap = new BinaryHeap("1", 15);
        minHeap.insert(5);
        minHeap.insert(22);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(9);
        minHeap.minHeap();
    
        minHeap.print();
        System.out.println("The Min val is " + minHeap.remove());
    }
}
