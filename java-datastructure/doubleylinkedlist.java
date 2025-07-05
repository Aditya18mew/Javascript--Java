public class doubleylinkedlist {
    private ListNode head;
    private ListNode tail;
    private int size;

    public static class ListNode {
        public int data;
        public ListNode next;
        public ListNode prev;


        public ListNode(int value){
            this.data=value;
            this.next=null;
            this.prev=null;
        }

    }

     public boolean isEmpty(){
        return this.size==0;
      }
     public int getSize(){
        return this.size;
     }

     public void append(int value){
        ListNode node=new ListNode(value);
        if(isEmpty()){
            this.head=node;
            this.tail=node;
        }else{
            node.prev=this.tail;
            this.tail.next=node;
            this.tail=node;
            this.tail.next=null;
        }
        this.size++;
     }
     public int removefromlast(){
        if(isEmpty()) return 404;
        ListNode curr=this.tail;
        this.tail=curr.prev;
        this.tail.next=null;
        curr.prev=null;
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
        if(index==this.size-1){
            return removefromlast();
        }
        if(index<=this.size/2){
            ListNode curr=head;
        ListNode remove=curr.next;
        for(int i=1;i<index;i++){
            curr=curr.next;
            remove=remove.next;
        }
        ListNode another=remove.next;
        curr.next=another;
        another.prev=curr;
        remove.next=null;
        remove.prev=null;
        this.size--;
        return remove.data;   
        }else{
            ListNode curr=tail;
            ListNode remove=curr.prev;
            for(int i=1;i<this.size-1-index;i++){
                curr=curr.prev;
                remove=remove.prev;
            }
            ListNode another=remove.prev;
              System.out.println("he0lo");
            curr.prev=another;
            another.next=curr;
            remove.next=null;
            remove.prev=null;
            this.size--;
           return remove.data; 
        } 
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


    public int removefromfront(){
        if(isEmpty()) return 404;
        ListNode curr=this.head;
        this.head=curr.next;
        this.head.prev=null;
        curr.next=null;
        this.size--;
        return curr.data;
    }

     public void piepend(int value){
       ListNode node=new ListNode(value);
       if(isEmpty()){
        this.head=node;
        this.tail=node;
       }else{
           node.next=this.head;
           this.head.prev=node;
           this.head=node;
           this.head.prev=null;
       }
       this.size++;
     }

     public void print(){
        ListNode curr=head;
        String result="";
        while(curr!=null){
            result+=curr.data+" ";
            curr=curr.next;
        }
        System.out.println(result);
     }

     public static void main(String[] args) {
        doubleylinkedlist list=new doubleylinkedlist();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);
        System.out.println(list.getSize());
        list.removefromindex(4);
        list.removefromindex(7);
        list.print();
     }
          
    
}
