package java_datastructure;

public class queue_2 {
    private doubleylinkedlist queue;

    public queue_2(){
        this.queue=new doubleylinkedlist();
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
        System.out.println(queue.getSize());
        return queue.getSize();
    }
    public boolean isEmpty(){
        System.out.println(queue.isEmpty());
        return queue.isEmpty();
    }
    public void print(){
        queue.print();
    }


    public static void main(String[] args) {
        queue_2 q2=new queue_2();
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);
        q2.enqueue(5);
        q2.print();
        System.out.println(q2.dequeue());
        q2.print();
        q2.peek();

    }
    
}
