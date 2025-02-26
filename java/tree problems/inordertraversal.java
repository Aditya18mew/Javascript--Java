import java.util.List;

class Node {
  private int data;
  private Node left;
  private Node right;


 public Node(int value){
    this.data=value;
    this.left=null;
    this.right=null;
  } 
}


   List<Integer> inorderTraversal( Node root){
    List<Integer> list =new ArrayList<>();
    inorder(list, root);
    return list;
   }

   void inorder(List<Integer> list ,Node root){
    if(root!=null){
    inorder(list, root.left);
    list.add(root.data);
    inorder(list, root.right);
    }
   }


void main(){
inorderTraversal(null);

}
