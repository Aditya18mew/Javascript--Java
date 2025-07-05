

class Node{
    public int val;
    public Node left;
    public Node right;

    Node(int value){
     this.val=value;
     this.left=null;
     this.right=null;
    }
}


public class sametree {
    public static boolean isSameTree(Node p, Node q) {
    return check(p,q);
}
public static boolean check(Node p, Node q){
   if(p==null && q==null){
    return true;
   }
   if(p==null || q==null || p.val!=q.val){
  return false;
   }
   return check(p.left,q.left) && check(p.right,q.right);
}

    public static void main(String[] args) {
        isSameTree(null, null);
    }
}





