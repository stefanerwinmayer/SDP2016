import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T> {
    private final List<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.add(0, item);
    }

    @Override
    public T pop() {
        if (list.isEmpty())
            throw new IndexOutOfBoundsException("Stack is empty - can't pop");
        return list.remove(0);
    }
}
