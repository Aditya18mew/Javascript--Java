

class Node{
    private int val;
    private Node left;
    private Node right;

    Node(int value){
     this.val=value;
     this.left=null;
     this.right=null;
    }
}




 boolean isSameTree(Node p, Node q) {
    return check(p,q);
}
 boolean check(Node p, Node q){
   if(p==null && q==null){
    return true;
   }
   if(p==null || q==null || p.val!=q.val){
  return false;
   }
   return check(p.left,q.left) && check(p.right,q.right);
}



void main(){
isSameTree(null, null);
}