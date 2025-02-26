import java.lang.classfile.instruction.ReturnInstruction;
import java.util.ArrayList;
import java.util.List;

class Node{
    private int data;
    private Node left;
    private Node right;

    public Node(int value ){
        this.data=value;
        this.left=null;
        this.right=null;
    }
}


List<Integer> postorderTraversal(Node root){
    List<Integer> list =new ArrayList<>();
    postorder(list ,root);
    return list;
}


void postorder(List<Integer> list,Node root){
if(root!=null){
    postorder(list, root.left);
postorder(list, root.right);
list.add(root.data);
}
}

void main(){
postorderTraversal(null);
 
}