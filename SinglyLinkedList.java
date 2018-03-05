import java.util.Collection;

/**
 * @author Bang
 * @version 1.0
 */
public class LinkedList<T> implements SinglyLinkedListInterface<T> {

    // DO NOT ALTER OR ADD INSTANCE VARIABLES
    private Node<T> head;
    private Node<T> tail;
    private int size;


    @Override
    public void add(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Input data is null.");
        }
        Node<T> node = new Node<T>(data);
        if (isEmpty()) {
            head = node;
            tail = head;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public void addIndex(int index, T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Input data is null");
        }
        if (index < 0 || index > size) {
            throw new 
            java.lang.IndexOutOfBoundsException("Index is out of bound");
        }
        if (index == size) {
            add(data);
        } else if (index == 0) {
            addFront(data);
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node<T> node 
                = new Node<T>(data, temp.getNext());
            temp.setNext(node);
            size++;
        }
    }

    @Override
    public void addFront(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Input data is null");
        }
        Node<T> node = new Node<T>(data);
        if (isEmpty()) {
            head = node;
            tail = head;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    @Override
    public boolean contains(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("input data is null");
        }
        if (isEmpty()) {
            return false;
        }
        if (head.getData().equals(data)
            || tail.getData().equals(data)) {
            return true;
        } else {
            Node<T> temp = head.getNext();
            for (int i = 0; i < size - 2; i++) {
                if (temp.getData().equals(data)) {
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new 
                java.lang.IndexOutOfBoundsException("Index is out of bound");
        }
        if (index == 0) {
            return head.getData();
        } else if (index == size - 1) {
            return tail.getData();
        } else {
            Node<T> temp = head.getNext();
            for (int i = 1; i < index; i++) {
                temp = temp.getNext();
            }
            return temp.getData();
        }
    }

    @Override
    public T remove() {
        if (size == 0) {
            return null;
        }
        T temp = tail.getData();
        if (size == 1) {
            clear();
        } else {
            Node<T> temp = head;
            for (int i = 1; i < size - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail = temp;
            size--;
        }
        return temp;
    }

    @Override
    public T removeIndex(int index) {
        if (index < 0 || index >= size) {
            throw new java.lang.IndexOutOfBoundsException("Index is out of Bound");
        }
        Node<T> temp = null;
        if (index == 0) {
            return removeFront();
        } else if (index == size - 1) {
            return remove();
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            temp = temp.getNext();
            temp.setNext(temp.getNext().getNext());
            size--;
            return temp.getData();
        }
    }

    /**
     * Remove the front node from the list and return the data from it. If the
     * list is empty, return {@code null}.
     *
     * Must be O(1).
     *
     * @return The data from the front node or null.
     */
    @Override
    public T removeFront() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            Node<T> temp = head;
            clear();
            return temp.getData();
        } else {
            Node<T> temp = head;
            head = head.getNext();
            size--;
            return temp.getData();
        }
    }


    @Override
    public T setIndex(int index, T data) {
        if (index < 0 || index >= size) {
            throw new 
            java.lang.IndexOutOfBoundsException("Index is out of bound");
        }
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Input data is null");
        }
        T temp = null;
        if (index == 0) {
            temp = head.getData();
            head.setData(data);
            return temp;
        } else if (index == size - 1) {
            temp = tail.getData();
            tail.setData(data);
            return temp;
        } else {
            Node<T> temp = head.getNext();
            for (int i = 1; i < index; i++) {
                temp = temp.getNext();
            }
            temp = temp.getData();
            temp.setData(data);
            return temp;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            array[i] = temp.getData();
            temp = temp.getNext();
        }
        return array;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

     * @return The size of the list.
     */
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }


    @Override
    public Node<T> getHead() {
        return head;
    }

    @Override
    public Node<T> getTail() {
        return tail;
    }
}
