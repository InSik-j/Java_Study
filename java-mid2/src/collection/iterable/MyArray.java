package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer>{
    private int[] numbers;

    public MyArray(int[] array) {
        this.numbers = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
