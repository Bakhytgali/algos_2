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
    public void get(){

    }
  @Override
    public void add(T el){
        MyNode<T> newNode = new MyNode<>(el);
        if(head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}
