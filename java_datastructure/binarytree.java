package java_datastructure;

public class binarytree {
    public Node root;
     
    public class Node {
        public Node left;
        public Node right;
        public int data;

        public Node(int value){
          this.data=value;
          this.left=null;
          this.right=null;
        }
    }


    public boolean isEmpty(){
        return this.root==null;
    }

    public void Insert(int value){
        Node node=new Node(value);
       if(isEmpty()){
        this.root=node;
       }else{
           deepdive(this.root, node);
       }
    }

    private Node deepdive(Node root,Node node){
          if(node.data<root.data){
            if(root.left==null){
                root.left=node;
            }else{
             return  deepdive(root.left, node);
            }
          }else{
            if(root.right==null){
                root.right=node;
            }else{
             return  deepdive(root.right, node);
            }
          }
          return root;
    }


   public void preorder(){
   preorderprint(this.root);
   }

    public void Inorder(){
        bfsprint(this.root);;
    }
    public void Postorder(){
 postorderprint(this.root);
    }
      
    private void preorderprint(Node root){
       if(root!=null){
        preorderprint(root.left);
        preorderprint(root.right); 
        System.out.println(root.data);
      }
    }

    private void bfsprint(Node root){
        if(root!=null){
        bfsprint(root.left);
        System.out.println(root.data);
        bfsprint(root.right); 
      }
    }
   
    private void postorderprint(Node root){
          if(root!=null){
        System.out.println(root.data);
        postorderprint(root.left);
        postorderprint(root.right);
      }
    }
    


  public static void main(String[] args) {
     
    binarytree t1=new binarytree();
    t1.Insert(0);
    t1.Insert(1);
    t1.Insert(2);
    t1.preorder();
    t1.Inorder();
    t1.Postorder();
  }
     
}