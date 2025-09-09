import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import itsc2214.*;

/**
 * Unit tests for the BinaryHeap class.
 * 
 * This test suite verifies the correctness of a max binary heap implementation,
 * ensuring that insert, remove, peek, size, clear, and empty-checking operations
 * work as expected. It also tests edge cases (such as removing or peeking from an
 * empty heap), confirms the maintenance of the max-heap property during bubble-up
 * and bubble-down operations, and validates behavior for both integer and string
 * heaps.
 * 
 * @author Cole Allan Francis Peterson
 * @version Apr 30, 2025
 */
public class BinaryHeapTest {

    private BinaryHeap<Integer> intHeap;
    private BinaryHeap<String> stringHeap;

    /**
     * Creating the Binary Heap with int and strings.
     */
    @Before
    public void setUp() {
        intHeap = new BinaryHeap<>();
        stringHeap = new BinaryHeap<>();
    }

    /**
     * Testing to see if the heap is empty.
     */
    @Test
    public void testIsEmptyInitially() {
        assertTrue(intHeap.isEmpty());
    }

    /**
     * Inserting an element and then seeing if its the peek.
     */
    @Test
    public void testInsertAndPeek() {
        intHeap.insert(49);
        assertEquals(Integer.valueOf(49), intHeap.peek());
    }

    /**
     * Testing to see if 49 remains the peek.
     */
    @Test
    public void testInsertMaintainsMaxHeap() {
        intHeap.insert(11);
        intHeap.insert(49);
        intHeap.insert(47);
        assertEquals(Integer.valueOf(49), intHeap.peek());
    }

    /**
     * Removing the peek and then testing the new peek.
     */
    @Test
    public void testRemove() {
        intHeap.insert(5);
        intHeap.insert(15);
        intHeap.insert(10);
        assertEquals(Integer.valueOf(15), intHeap.remove());
        assertEquals(Integer.valueOf(10), intHeap.peek());
    }

    /**
     * Testing the size of the heap.
     */
    @Test
    public void testSize() {
        assertEquals(0, intHeap.size());
        intHeap.insert(1);
        intHeap.insert(2);
        assertEquals(2, intHeap.size());
    }

    /**
     * Clearing the heap of elements.
     */
    @Test
    public void testClear() {
        intHeap.insert(100);
        intHeap.insert(200);
        intHeap.clear();
        assertTrue(intHeap.isEmpty());
        assertEquals(0, intHeap.size());
        assertNull(intHeap.peek());
    }

    /**
     * Testing remove is the heap is empty.
     */
    @Test
    public void testRemoveFromEmptyHeap() {
        assertNull(intHeap.remove());
    }

    /**
     * Testing the peek if it is empty.
     */
    @Test
    public void testPeekOnEmptyHeap() {
        assertNull(intHeap.peek());
    }

    /**
     * Testing the methods on a heap of strings.
     */
    @Test
    public void testStringHeapOrder() {
        stringHeap.insert("A");
        stringHeap.insert("Z");
        stringHeap.insert("M");
        assertEquals("Z", stringHeap.remove());
        assertEquals("M", stringHeap.remove());
        assertEquals("A", stringHeap.remove());
    }

    /**
     * Testing the bubble down.
     * Forcing the bubble down to occur.
     */
    @Test
    public void testRemoveTriggersBubbleDown() {
        intHeap.insert(100);
        intHeap.insert(50);
        intHeap.insert(75); 

        Integer removed = intHeap.remove();

        assertEquals(Integer.valueOf(100), removed);
        assertEquals(Integer.valueOf(75), intHeap.peek());
    }
}