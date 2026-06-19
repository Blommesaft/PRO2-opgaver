import java.util.ArrayList;

public class ArrayListStack implements StackI{

    ArrayList<Object> elements = new ArrayList<>();

    @Override
    public void push(Object element) {
        elements.addFirst(element);
    }

    @Override
    public Object pop() {
        Object temp = elements.getFirst();
        elements.removeFirst();

        return temp;
    }

    @Override
    public Object peek() {
        return elements.getFirst();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
