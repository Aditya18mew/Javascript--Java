package java_datastructure;

public class singleylinkedlist {
       private ListNode head;
       private ListNode tail;
        private int size;

    public static class  ListNode {
         private int data;
         private ListNode next;

         public ListNode(int value){
            this.data=value;
            this.next=null;
         }      
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public int getsize(){
        return this.size;
    }

    public void append(int value){
        ListNode node=new ListNode(value);
        if(isEmpty()){
          this.head=node;
          this.tail=node;
        }else{
           this.tail.next=node;
           this.tail=node;
           this.tail.next=null;
        }
        this.size++;
    }

    
     public int getstackelement(){
        if(isEmpty()) return 404;
        ListNode last=tail;
        return last.data;
     }
     public int getqueueelement(){
        if(isEmpty()) return 404;
        ListNode first=head;
        return first.data;
     }
    
    public void piepend(int value){
        ListNode node=new ListNode(value);
        if(isEmpty()){
          this.head=node;
          this.tail=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
        this.size++;
    }

    public void insert(int index,int value){
        if(index<0 || index>this.size){
            return;
        }
        if(index==0){
            piepend(value);
        }else{
            ListNode node =new ListNode(value);
        ListNode curr=head;
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        node.next=curr.next;
        curr.next=node;
       this.size++; 
        }   
    }

    public int removefromfront(){
        if(isEmpty()){
            return 404;
        }
        ListNode curr=head;
        head=head.next;
        curr.next=null;
        this.size--;
        return curr.data;
    }

    public int removefromindex(int index){
        if(index<0 || index>=this.size){
            return 404;
        }
        if(index==0){
         return removefromfront();
        }
        ListNode curr=head;
        ListNode another=curr.next;
        for(int i=1;i<index;i++){
            curr=curr.next;
            another=another.next;
        }
        curr.next=another.next;
        another.next=null;
        this.size--;
        return another.data;     
    }

    public int removefromlast(){
        if(isEmpty()){
            return 404;
        }
        ListNode curr=head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        this.tail=curr;
        curr=curr.next;
        tail.next=null;
        this.size--;
        return curr.data;
    }

    public String search(int value){
        if(isEmpty()) return "linkedlist is empty";
        if(this.head.data==value) return value+" is present on index 0";
        ListNode search=head;
        for(int i=0;i<this.size;i++){
            if(search.data==value) return value+" is present on index "+i;
            search=search.next;
        }
        return value+" is not present in linkedlist";
    }

    public void print(){
        ListNode curr=head;
        String result="";
       while(curr!=null){
        result+=curr.data + " ";
        curr=curr.next;
       }
       System.out.println(result);
    }





 public static void main(String[] args) {
singleylinkedlist list=new singleylinkedlist();
   list.append(1);
   list.append(2);
   list.append(3);
   list.piepend(0);
   list.piepend(-1);
   list.insert(5, 4);
   list.print();
   } 

}