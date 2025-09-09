import itsc2214.*;
import java.util.*;

/**
 * A generic max binary heap implementation backed by an ArrayList.
 * 
 * This class represents the binary heap abstraction, where the largest element 
 * is always at the root. It supports efficient insertion and removal of elements 
 * while maintaining the max-heap property using bubble-up and bubble-down 
 * operations. Clients can insert comparable elements, peek at the maximum value 
 * without removal, remove the maximum value, query the current size, check if the 
 * heap is empty, and clear the heap. The heap can be used for priority-based 
 * retrieval and ordering tasks.
 * 
 * @author Cole Allan Francis Peterson
 * @version Apr 29, 2025
 * @param <T> the type of elements stored in the heap, which must be comparable
 */
public class BinaryHeap<T extends Comparable<T>> implements BinaryHeapADT<T> {
    private ArrayList<T> heap;
    private int size;

    /**
     * Creating the heap as a new array list.
     * initlizing the size to 0. 
     * 
     */
    public BinaryHeap() {
        heap = new ArrayList<>();
        size = 0;
    }

    /**
     * Insert is the bubble-up method. 
     * Adding a element and moving it up as needed. 
     */
    @Override
    public void insert(T element) {
        heap.add(element);
        size++;
        int index = size - 1;

        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) > 0) {
                T temp = heap.get(index);
                heap.set(index, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    /**
     * Remove is the bubble-down method.
     * Moving the element around and moving it down as needed.
     */
    @Override
    public T remove() {
        if (isEmpty())
            return null;

        T root = heap.get(0);
        T last = heap.remove(size - 1);
        size--;

        if (!isEmpty()) {
            heap.set(0, last);
            int index = 0;

            while (true) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                int largest = index;

                if (left < size && heap.get(left).compareTo(heap.get(largest)) > 0) {
                    largest = left;
                }

                if (right < size && heap.get(right).compareTo(heap.get(largest)) > 0) {
                    largest = right;
                }

                if (largest != index) {
                    T temp = heap.get(index);
                    heap.set(index, heap.get(largest));
                    heap.set(largest, temp);
                    index = largest;
                } else {
                    break;
                }
            }
        }

        return root;
    }

    /**
     * Peek method looking for the top of the heap.
     * 
     * @return top of heap.
     */
    @Override
    public T peek() {
        if (isEmpty())
            return null;
        return heap.get(0);
    }

    /**
     * Size of the heap.
     * 
     * @return size of the heap.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if the heap is empty.
     * 
     * @return size of 0.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Clears all the elements from the heap.
     */
    @Override
    public void clear() {
        heap.clear();
        size = 0;
    }
}