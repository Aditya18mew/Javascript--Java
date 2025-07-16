package java_datastructure;
import java.util.*;

public class lrucache {
      
      private final int capacity;
      private final Map<Integer,Node> map;
      private final Node head,tail; 

     public class Node{
        public Node next;
        public Node prev;
        public int data;
        public int key;

        public Node(int key,int value){
            this.key=key;
            this.data=value;
        }
     }

     public  lrucache(int capacity){
        this.capacity=capacity;
           map=new HashMap<>();
           head=new Node(0, 0);
           tail=new Node(0, 0);
           head.next=tail;
           tail.prev=head;
     }

     private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
     }

     private void insert(Node node){
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        node.prev=head;
     }

     public int get(int key){
        if(!map.containsKey(key)) return -1;
        Node node=map.get(key);
        remove(node);
        insert(node);
        return node.data;
     }

     public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            Node lru=tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
        Node newNode=new Node(key, value);
        insert(newNode);
        map.put(key, newNode);
     }


     public static void main(String[] args) {
        lrucache cache=new lrucache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
     }

}
