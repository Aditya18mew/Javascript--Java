package java_datastructure;
import java.util.*;

public class mrucache {
    private final int capacity;
    private final Map<Integer,Node> map;
    private Node head,tail;

    public class Node {
       private Node next;
       private Node prev;
       private int value;
       private int key; 

       public Node(int key,int value){
         this.key=key;
         this.value=value;
       }
    }

    public mrucache(int capacity){
        this.capacity=capacity;
          map=new HashMap<>();
          head=new Node(0, 0);
          tail=new Node(0, 0);
          head.next=tail;
          tail.prev=head;
    }

    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insert(Node node){
      node.prev=tail.prev;
      tail.prev.next=node;
      tail.prev=node;
      node.next=tail;
    }


    public int get(int key){
      if(!map.containsKey(key)) return -1;
      Node node=map.get(key);
      remove(node);
      insert(node);
      return node.value;
    }

    public void put(int key,int value){
      if(map.containsKey(key)){
        remove(map.get(key));
      }
      if(map.size()==capacity){
        Node mru=tail.prev;
        remove(mru);
        map.remove(mru.key);
      }
      Node newnode=new Node(key, value);
      insert(newnode);
      map.put(key, newnode);
    }

    
    public static void main(String[] args) {
      mrucache m1=new mrucache(3);
      m1.put(1, 1);
      m1.put(2, 2);
      m1.put(3, 3);
      System.out.println(m1.get(2));
      m1.put(4, 4);
      System.out.println(m1.get(2) );
    }
}
