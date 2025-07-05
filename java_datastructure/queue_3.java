package java_datastructure;

public class queue_3 {
  private int size;
  private ListNode start;

  public class ListNode {
     private int data;
     private ListNode next;

     public ListNode(int value){
        this.data=value;
     }
  }

  public boolean isEmpty(){
        return this.size==0;
    }

    public int Size(){
        return this.size;
    }
    
    public void enqueue(int value){
        ListNode node=new ListNode(value);
        if(isEmpty()){
          this.start=node;
        }else{
         ListNode curr=start;
         while (curr.next!=null) {
            curr=curr.next;
         }
         curr.next=node;
        }
        this.size++;
    }

   public int dequeue(){
     if(isEmpty()) throw new Error("stack is empty");
      if(this.start.next==null){
        ListNode curr=start;
        this.start=null;
        this.size--;
        return curr.data;
      }
       ListNode curr=start;
       start=curr.next;
       curr.next=null;
       this.size--;
       return curr.data;
   }

    public void print(){
     if(isEmpty()) throw new Error("stack is empty");
       ListNode curr=start;
       String result="";
       while (curr!=null) {
        result+=curr.data+" ";
        curr=curr.next;
       }
       System.out.println(result);
   }

   public int peek(){
   if(isEmpty()) throw new Error("stack is empty");
      ListNode curr=start;
      System.out.println(curr.data);
      return curr.data;
   }


  public static void main(String[] args) {
    queue_3 q3=new queue_3();
      q3.enqueue(1);
        q3.enqueue(2);
        q3.enqueue(3);
        q3.enqueue(4);
        q3.enqueue(5);
        q3.print();
        q3.dequeue();
        q3.peek();
        q3.Size();
        q3.print();
  }  
}
 

