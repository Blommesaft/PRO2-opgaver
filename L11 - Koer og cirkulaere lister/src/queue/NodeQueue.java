package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructs an empty queue.
     */
    public NodeQueue()
    {
        // TODO: Assignment 1: Implement this constructor...
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(Object element)
    {
        // TODO: Assignment 1: Implement this method...
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = null;

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

        //throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Object dequeue()
    {
        // TODO: Assignment 1: Implement this method...
        if (isEmpty()) {
            throw new NoSuchElementException();
            //return null;    // eller kast en exception, afhængigt af QueueI
        }

        Object element = head.data;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return element;
        //throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int size()
    {
        // TODO: Assignment 1: Implement this method...
        return size;
        //throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean isEmpty()
    {
        // TODO: Assignment 1: Implement this method...
        if(this.head == null && this.tail == null) {
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Not implemented");
    }

    class Node {
        public Object data;
        public Node next;
    }
}
