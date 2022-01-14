package cursor_education_JB;

public interface MyList <T>{

    void add(T element);

    void add(int index,T element);

    T get(int index);

    boolean remove(int i);

    void set(int index, T element);

    int size();

    void clear();

    boolean isEmpty();

}
