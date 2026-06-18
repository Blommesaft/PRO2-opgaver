import java.util.NoSuchElementException;

public class NodeStack implements StackI {

    private Node top;
    private int count;

    @Override
    public void push(Object element) {

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top;
        top = newNode;
        count++;
    }

    @Override
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        Node oldTop = top;
        Node newTop = top.next;
        top = newTop;

        count--;

        return oldTop.data;
        // Garbage collector, fjerner ikke gamle conenction
        // Node public = slet gamle connections
    }

    @Override
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0)
        {
            return true;
        }
        return false;
    }

    private class Node
    {
        public Object data;
        public Node next;
    }
}

