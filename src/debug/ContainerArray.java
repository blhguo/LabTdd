package debug;

import java.util.ArrayList;

public class ContainerArray<E> {
    private int currentSize = 0;
    private int initialCap = 10;
    private ArrayList<Object> internalArray;

    public ContainerArray () {
        this(10);
    }

    public ContainerArray (int initialCapacity) {
    	initialCap = initialCapacity;
        internalArray = new ArrayList<Object>();
    }

    public void add (E element) {
        internalArray.add(element);
        currentSize++;
    }

    public int size () {
        return internalArray.size();
    }

    public void remove (E objectToRemove) {
        currentSize--;
        int ind = internalArray.indexOf(objectToRemove);
        internalArray.remove(ind);
    }
    
    public boolean contains(E obj) {
    	return internalArray.indexOf(obj)>=0;
    }

    @SuppressWarnings("unchecked")
    public E get (int index) {
        return (E) internalArray.get(index);
    }
}
