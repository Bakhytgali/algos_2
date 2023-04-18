public class MyArrayList implements MyList{
    private int[] arr;
    private int size = 0;
    private int capacity = 5;
    @Override
    public int size(){
        return size;
    }
    public void add(int el){
        if(size == capacity){
            increaseLength();
        }
        arr[size++] = el;
    }
    public void increaseLength(){
        capacity *= 2;
        int[] arr2 = new int[capacity];
        for(int i = 0; i < size; i++) {
            arr2[i] = arr[i];
        }
    }
}
