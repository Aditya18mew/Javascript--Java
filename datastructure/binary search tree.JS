


let queued=require("./queue")

class NODE{
 constructor(value){
        this.value=value
        this.right=null
        this.left=null           
    }
}


class binarytree{
    #root
    constructor(){
       this.#root=null
       
    }
    isempty(){
     
        return this.#root===null
    }
    insert(value){
        let node=new NODE(value)
        if(this.isempty()){
            this.#root=node
        }else{
            this.#deepdive(this.#root,node)
        }
    }
    #deepdive(root,node){
           if(node.value<root.value){
            if(root.left===null){
                root.left=node
            }else{
               return this.#deepdive(root.left,node)
            }
           }else{
            if(root.right===null){
                root.right=node
            }else{
             return   this.#deepdive(root.right,node)
            }
           }
    }


    search(value){
      return this.#deepsearch(this.#root,value)
    }
    #deepsearch(root,value){
        if(!root){
            return false
        }
        if(root.value===value){
            return true
        }
        if(value<root.value){
            return this.#deepsearch(root.left,value)
        }
        if(value>root.value){
            return this.#deepsearch(root.right,value)
        }
    }
   preorder(){
   this.#deepdfs(1,this.#root)
   }
   inorder(){
    this.#deepdfs(2,this.#root)
   }
   postorder(){
    this.#deepdfs(3,this.#root)
   }

   #deepdfs(order,root){
    if(order===1){
    if(root){
        console.log(root.value)
        this.#deepdfs(1,root.left)
        this.#deepdfs(1,root.right)
        
    }}
    if(order===2){
        if(root){
            this.#deepdfs(2,root.left)
            console.log(root.value)
            this.#deepdfs(2,root.right)
           
        }
    }
    if(order===3){
        if(root){
            this.#deepdfs(3,root.left)
            this.#deepdfs(3,root.right)
            console.log(root.value)
        }
    }
   }
     
     levelorder(){
       let newqueue=new queued() 
       newqueue.enqueue(this.#root)
       while(newqueue.size()){
        let curr=newqueue.dequeue()
        console.log(curr.value)
        if(curr.left){
            newqueue.enqueue(curr.left)
        }
        if(curr.right){
            newqueue.enqueue(curr.right)
        }
       }
     }
     


     maxdepth(){
        let curr=this.#root
       console.log( this.deepdepth(this.#root))
     }
     
     deepdepth(curr){
       if(curr===null){
        return 0;
       }
       let left=1+this.deepdepth(curr.left)
       let right=1+this.deepdepth(curr.right)

       return Math.max(left,right)
     }
         
    
    
    

     max(){
       console.log(this.#minmax(1,this.#root))
       
     }
     min(){
       console.log(this.#minmax(2,this.#root))
       
     }

     #minmax(order,root){
        if(order===1){
            let curr=root
            let prev=curr
           while(curr){
            prev=curr
            curr=curr.right
           }
           return prev.value
        }
   
     
     if(order===2){
        let curr=root
        let prev=curr
        while(curr){
            prev=curr
           curr=curr.left
        }
        return prev.value
        

    }
}

 //not working currently
 /*  delete(value){
    console.log(this.#deletenode(this.#root,value))
  }


  #deletenode(root,value){
if(root===null){
    return root
}
if(value<root.value){
    this.#deletenode(root.left,value)
}else if(value>root.value){
    this.#deletenode(root.right,value)
}else{
    if(!root.left && !root.right){
       return null
    }
    if(!root.left){
        return root.right
    } else  if(!root.right){
        return root.left
    }
} 
return root.value  
  }
 */
}
     
       





let bst=new binarytree()



bst.insert(10)
bst.insert(5)
bst.insert(15)
bst.insert(6)
bst.insert(7)
bst.insert(3)
bst.inorder()


// bst.preorder()     // 24,13,5,2,9,6,18,26
// bst.inorder()       //2,5,6,9,13,18,24,26
// bst.postorder()     //2,6,9,5,18,13,26,24
// bst.levelorder()
// bst.levelorder()
//  bst.levelorder()





