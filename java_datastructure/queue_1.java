package java_datastructure;

public class queue_1 {
    private singleylinkedlist queue;

    public queue_1(){
        this.queue=new singleylinkedlist();
    }

    public void enqueue(int value){
        queue.append(value);
    }
    public int dequeue(){
      return  queue.removefromfront();
    }
    public int peek(){
        System.out.println(queue.getqueueelement());
        return queue.getqueueelement();
    }
    public int size(){
        System.out.println(queue.getsize());
        return queue.getsize();
    }
    public boolean isEmpty(){
        System.out.println(queue.isEmpty());
        return queue.isEmpty();
    }
    public void print(){
        queue.print();
    }


    public static void main(String[] args) {
         queue_1 q1=new queue_1();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.print();
        System.out.println(q1.dequeue());
        q1.print();
        q1.peek();
    }
}
