/**
 * @author Bang Pham
 * @version 1.0
 */
public class Node<T> {

    private T data;
    private Node<T> next;

    /**
     * 2 param constructor.
     * @param data 
     * @param next node
     */
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * 1 param Constructor
     * @param data
     */
    public Node(T data) {
        this(data, null);
    }

    /**
     * Set the data of this node.
     * @param data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * getter for data of this node
     * @return data of the node.
     */
    public T getData() {
        return data;
    }

    /**
     * @return the node next to this node.
     */
    public LinkedListNode<T> getNext() {
        return next;
    }

    /**
     * Set the node this node points to.
     * @param next node.
     */
    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data;
    }
}
