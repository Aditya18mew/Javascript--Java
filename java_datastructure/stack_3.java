package java_datastructure;

public class stack_3 {
  private int size;
  private ListNode top;

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
    
    public void push(int value){
        ListNode node=new ListNode(value);
        if(isEmpty()){
          this.top=node;
        }else{
          node.next=top;
          this.top=node;
        }
        this.size++;
    }
   public int pop(){
     if(isEmpty()) throw new Error("stack is empty");
      if(this.top.next==null){
        ListNode curr=top;
        this.top=null;
        this.size--;
        return curr.data;
      }
       ListNode curr=top;
       this.top=curr.next;
       curr.next=null;
        this.size--;
       return curr.data;
   }

   public void print(){
     if(isEmpty()) throw new Error("stack is empty");
       ListNode curr=top;
       String result="";
       while (curr!=null) {
        result+=curr.data+" ";
        curr=curr.next;
       }
       System.out.println(result);
   }

   public int peek(){
   if(isEmpty()) throw new Error("stack is empty");
      ListNode curr=top;
      System.out.println(curr.data);
      return curr.data;
   }


  public static void main(String[] args) {
    stack_3 s3=new stack_3();
      s3.push(1);
        s3.push(2);
        s3.push(3);
        s3.push(4);
        s3.push(5);
        s3.print();
        s3.pop();
        s3.peek();
        s3.Size();
        s3.print();
  }  
}