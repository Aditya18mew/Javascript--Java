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

     public void validate(){
        if(root==null){
            return;
        }
        else{
            boolean check=validating(root);
            System.out.println(check);
        }
     }

    private boolean validating(Node root){
    if(root.left!=null){
        if(root.left.data>root.data){
        return false;
        }else{
            validating(root.left);
        }
    }
    if(root.right!=null){
        if(root.right.data<root.data){  
            return false;
        }else{
            validating(root.right);
        }
    }
    return true;
     }


     
    public int findmax(){
        if(root==null){
            throw new Error("binary tree is empty");
        }else{
            int max= findminmax(root,1);
            System.out.println(max);
            return max;
        }
     }
     public int findmin(){
        if(root==null){
            throw new Error("binary tree is empty");
        }else{
            int min= findminmax(root,2);
            System.out.println(min);
            return min;
        }
     }

     private int findminmax(Node root,int order){
        if(order==1){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
            int left=findminmax(root.left, 1);
            int right=findminmax(root.right, 1);
            if(left>result){
                result=left;
            }
            if(right>result){
                result=right;
            }
            return result;
        }
        if(order==2){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int result=root.data;
       
            int left=findminmax(root.left, 2);
            int right=findminmax(root.right, 2);
            if(left<result){
                result=left;
            }
            if(right<result){
                result=right;
            }
            return result;
        }else{
            throw new Error("you will not see this message");
        }
     }

      public boolean checksymmetry(){
    if(root==null){
        return false;
    }else{
    boolean check=symmetry(root.left,root.right);
    return check;
    }
    }

    private boolean symmetry(Node left,Node right){
        if(left!=null || right!=null){     
            if(right!=null && left!=null){ 
            if(left.data!=right.data){
      return false;
            }
           boolean check1=  symmetry(left.left, right.right);
           boolean check4=  symmetry(left.right, right.left);
           return check1==true && check4==true;
    
        }else{
            return false;
        }
        }else{
            return true;
        }
       }
        
         public void csatotree(int[] arr){
    
   root=convert( arr,0, arr.length-1);
    }

    private Node convert(int[] arr,int start,int end){
         if(start>end){
            return null;
         }
         int middle=start+(end-start)/2;

         Node node=new Node(arr[middle]);
         node.left=convert(arr, start, middle-1);
         node.right=convert(arr, middle+1, end);

         return node;  
       }
    


  public static void main(String[] args) {
     
    binarytree t1=new binarytree();
    t1.Insert(0);
    t1.Insert(1);
    t1.Insert(2);
  }
     
}