package java_datastructure;

public class stack_1 {
    private singleylinkedlist stack;
    
    public stack_1(){
        this.stack=new singleylinkedlist();
    }

    public void push(int value){
   stack.append(value);
    }
    public int pull(){
      return stack.removefromlast();
    }
    public int Size(){
    System.out.println(stack.getsize());
    return stack.getsize();
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

   stack_1 s1=new stack_1();

      s1.push(5);
      s1.push(4);
      s1.push(3);
      s1.push(2);
      s1.push(1);
      s1.print();
      s1.pull();
      s1.print();
      s1.Size();
      s1.peek();
        
    }
    
}
