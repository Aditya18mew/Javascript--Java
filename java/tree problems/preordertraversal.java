import java.util.ArrayList;
import java.util.List;

class Node {
            public int val;
            public Node left;
            public Node right;

            public Node(int value){
                this.val=value;
                this.left=null;
                this.right=null;
            }
        
    }

    public class preordertraversal {

        
  public static  List<Integer> preorderTraversal(Node root) {
    List<Integer> list =new ArrayList<>();
    preorder(list,root);
    return list;

    } 
  public static  void preorder( List<Integer> list ,Node root){
                if(root!=null){
               list.add(root.val);
                   preorder(list,root.left);
                   preorder(list,root.right); 
                }
                          
    }
    
        public static void main(String[] args) {
              preorderTraversal(null);
        }
    }








