import java.util.ArrayList;
import java.util.List;


class Node {
  public int data;
  public Node left;
  public Node right;


 public Node(int value){
    this.data=value;
    this.left=null;
    this.right=null;
  } 
}





public class inordertraversal {

    public static List<Integer> inorderTraversal( Node root){
    List<Integer> list =new ArrayList<>();
    inorder(list, root);
    return list;
   }

  public static void inorder(List<Integer> list ,Node root){
    if(root!=null){
    inorder(list, root.left);
    list.add(root.data);
    inorder(list, root.right);
    }
   }

public static void main(String[] args) {
  inorderTraversal(null);
}
   
}