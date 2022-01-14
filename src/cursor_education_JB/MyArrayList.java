package cursor_education_JB;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private static final int INITIAL_CAPACITY = 20;
    private static final double LOAD = 0.7;
    private int pointer = 0;

    private T[] arr;

    public MyArrayList() {
        arr = (T[]) new Object[INITIAL_CAPACITY];
    }

    public MyArrayList(int capacity) {
        arr = (T[]) new Object[capacity];
    }

    @Override
    public void add(T element) {
        increaseArrayLength();
        arr[pointer++] = element;
    }

    private void increaseArrayLength() {
        if ((double) pointer / (double) arr.length > LOAD) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
    }

    @Override
    public void add(int index, T element) {
        if (!isCorrectRange(index)) {
            throw new ArrayIndexOutOfBoundsException();
        }

        increaseArrayLength();
        pointer++;
        if (pointer - index >= 0) {
            System.arraycopy(arr, index, arr, index + 1, pointer - index);
        }
        arr[index] = element;
    }

    @Override
    public T get(int index) {
        if (!isCorrectRange(index)) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return arr[index];
    }

    @Override
    public boolean remove(int index) {
        if (pointer - index >= 0) {
            System.arraycopy(arr, index + 1, arr, index, pointer - index);
        }
        pointer--;
        return true;
    }

    @Override
    public void set(int index, T element) {
        if (!isCorrectRange(index)) {
            throw new ArrayIndexOutOfBoundsException();
        }

        arr[index] = element;
    }

    private boolean isCorrectRange(int index) {
        return index >= 0 && index < pointer;
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[INITIAL_CAPACITY];
        pointer =0;
    }
    @Override
    public boolean isEmpty() {
        return pointer ==0;
    }

}
