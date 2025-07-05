import java.util.ArrayList;
import java.util.List;

class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int value ){
        this.data=value;
        this.left=null;
        this.right=null;
    }
}


public class postordertraversal {

    public static List<Integer> postorderTraversal(Node root){
    List<Integer> list =new ArrayList<>();
    postorder(list ,root);
    return list;
}

    public static void postorder(List<Integer> list,Node root){
if(root!=null){
    postorder(list, root.left);
postorder(list, root.right);
list.add(root.data);
}
}

    public static void main(String[] args) {
        postorderTraversal(null);
    }
}