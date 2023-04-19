public class MyArrayList<T> implements MyList{ /* Class MyArrayList implement the interface MyList */
    private Object[] array; /* Creating an object class array */
    private int size = 0; /* Size of my array */
    private int capacity = 5; /* Max. size of an array */
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
   @Override
    public void add(Object el){
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
    @Override
    public boolean contains(Object el){
        boolean doesContain = true;
        for(int i = 0; i < size; i++){
            if(array[i] == el){
                doesContain = false;
                break;
            }
        }
        return doesContain;
    }
}
