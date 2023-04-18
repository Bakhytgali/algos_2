public class MyArrayList<T> implements MyList{
    private Object[] array;
    private int size = 0;
    private int capacity = 5;
    public MyArrayList(){
        array = new Object[capacity];
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public T get(int index){
        return (T) array[index];
    }
    public void add(int el){
        if(size == capacity){
            increaseLength();
        }
        array[size++] = el;
    }
    public void increaseLength(){
        capacity = (int) capacity * 2;
        Object[] array2 = new Object[capacity];
        for(int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }
}
