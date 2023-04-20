public class MyLinkedList<T> implements MyList {
  class MyNode<T>{
        private MyNode<T> next;
        private T data;
        private MyNode(T data){
            this.data = data;
        }
    }
    private int size;
    private MyNode<T> head;
    private MyNode<T> tail;
    MyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
  @Override
    public T get(int index){
        MyNode<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
  @Override
    public void add(T el){
        MyNode<T> newNode = (MyNode<T>) new MyNode<>(el);
        if(head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
   @Override
    public int size(){
        return this.size; 
    }
   @Override
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
}
