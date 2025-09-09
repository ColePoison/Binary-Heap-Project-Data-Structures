/**
 * BinaryHeapADT defines the abstract behavior of a 
 * generic binary heap.
 * 
 * @param <T> the type of elements stored in the heap, 
 * which must be comparable
 */
public interface BinaryHeapADT<T extends Comparable<T>>
{

    /**
     * Inserts the specified element into the heap.
     *
     * @param element the element to be inserted
     */
    public void insert(T element);

    /**
     * Removes and returns the root element of the heap.
     * This routine does nothing and returns null if the
     * heap is empty.
     *
     * @return the removed root element
     */
    public T remove();

    /**
     * Returns, but does not remove, the root element of 
     * the heap. This routine does nothing and returns 
     * null if the heap is empty.
     *
     * @return the root element of the heap
     */
    public T peek();

    /**
     * Returns the number of elements currently
     * in the heap. You must keep track of this
     * number, do not count them when this is
     * called.
     *
     * @return the number of elements in the heap
     */
    public int size();

    /**
     * Checks whether the heap is empty.
     *
     * @return true if the heap contains no elements;
     * false otherwise
     */
    public boolean isEmpty();

    /**
     * Clears all elements from the heap.
     */
    public void clear();
}
/*
 * Copyright: This programming assignment specification and the provided sample
 * code are protected by copyright. The professor is the exclusive owner of
 * copyright of this material. You are encouraged to take notes and make copies
 * of the specification and the source code for your own educational use.
 * However, you may not, nor may you knowingly allow others to reproduce or
 * distribute the materials publicly without the express written consent of the
 * professor. This includes providing materials to commercial course material
 * suppliers such as CourseHero and other similar services. Students who
 * publicly distribute or display or help others publicly distribute or display
 * copies or modified copies of this material may be in violation of University
 * Policy 406, The Code of Student Responsibility
 * https://legal.charlotte.edu/policies/up-406.
 */
