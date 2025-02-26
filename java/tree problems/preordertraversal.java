     

    class Node {
            private int val;
            private Node left;
            private Node right;

            public Node(int value){
                this.val=value;
                this.left=null;
                this.right=null;
            }
        
    }





    List<Integer> preorderTraversal(Node root) {
    List<Integer> list =new ArrayList<>();
    preorder(list,root);
    return list;

    } 
    void preorder( List<Integer> list ,Node root){
                if(root!=null){
               list.add(root.val);
                   preorder(list,root.left);
                   preorder(list,root.right); 
                }
                          
    }



void main(){
    preorderTraversal(null);

}
