public class MyArrayList implements MyList{
    private int[] arr;
    private int size = 0;
    private int capacity = 5;
    public int size(){
        return size;
    }
    public void add(int el){
        if(size == capacity){
            increaseLength();
        }
        arr[size++] = el;
    }
}
