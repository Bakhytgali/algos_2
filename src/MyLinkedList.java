public class MyLinkedList<T> implements MyList {
   class MyNode<T>{
        T data;
        MyNode next;
        MyNode(T data){
            this.data = data;
            next = null;
        }
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
}
