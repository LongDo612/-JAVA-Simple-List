import java.util.Arrays;

public class MyList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        int newSize = elements.length*2 + 1;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(T t) {
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++] = t;
    }

    public T get(int i){
        if (i>=elements.length || i<0){
            throw new IndexOutOfBoundsException("Index " +i+ ", Size "+size);
        }
        return (T) elements[i];
    }
}
