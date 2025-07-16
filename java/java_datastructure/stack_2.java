package java_datastructure;


public class stack_2 {
   private doubleylinkedlist stack;

   public stack_2(){
    this.stack=new doubleylinkedlist();
   }

   public void push(int value){
    stack.append(value);
   }
   public int pull(){
    return stack.removefromlast();
   }
   public int Size(){
    System.out.println(stack.getSize());
    return stack.getSize();
   }
   public boolean isEmpty(){
    System.out.println(stack.isEmpty());
    return stack.isEmpty();
   }
   public int peek(){
    System.out.println(stack.getstackelement());
    return stack.getstackelement();
   }
   public void print(){
    stack.print();
   }

    public static void main(String[] args) {
        stack_2 s2=new stack_2();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);
        s2.print();
        s2.pull();
        s2.peek();
        s2.Size();
        s2.print();
    }
    
}
