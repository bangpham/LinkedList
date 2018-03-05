import java.util.Collection;

public interface SinglyLinkedListInterface<T> {

    /**
     * @param data
     * @throws java.lang.IllegalArgumentException
     */
    public void add(T data);


    /**
     * @param index of element to be added
     * @param data to add
     * @throws java.lang.IndexOutOfBoundsException to validate index bound
     * @throws java.lang.IllegalArgumentException
     */
    public void addIndex(int index, T data);


    /**
     * @param data to add
     * @throws java.lang.IllegalArgumentException
     */
    public void addFront(T data);


    /**
     * @param data The data to check in the Linked List
     * @return True if data is found. False otherwise.
     * @throws java.lang.IllegalArgumentException if data is null.
     */
    public boolean contains(T data);


    /**
     * @param index The index of the element
     * @return The object stored at that index.
     * @throws java.lang.IndexOutOfBoundsException if index < 0 or
     * index >= size.
     */
    public T get(int index);


    /**
     * @return The data from the last node or null.
     */
    public T remove();


    /**
     * @param index The index of the element.
     * @return The data that was formerly at that index.
     * @throws java.lang.IndexOutOfBoundsException if index < 0 or
     * index >= size.
     */
    public T removeIndex(int index);


    /**
     * @return The data from the front node or null.
     */
    public T removeFront();


    /**
     * @param index The index to replace to data.
     * @param data The new data to reaplce with.
     * @return The replaced data.
     * @throws java.lang.IndexOutOfBoundsException if index < 0 or
     * index >= size.
     * @throws java.lang.IllegalArgumentException if data is null.
     */
    public T setIndex(int index, T data);


    /**
     * @return An array of length {@code size} holding each element in the same
     * order as it is in the linked list.
     */
    public Object[] toArray();


    /**
     * @return if Linked List is empty
     */
    public boolean isEmpty();


    /**
     * Getter for size.
     * @return The size of the list.
     */
    public int size();


    /**
     * Clear the list.
     */
    public void clear();


    /**
     * getter for head.
     * @return head node
     */
    public LinkedListNode<T> getHead();


    /**
     * Getter for tail.
     * @return Node representing the tail of the linked list.
     */
    public LinkedListNode<T> getTail();
}
