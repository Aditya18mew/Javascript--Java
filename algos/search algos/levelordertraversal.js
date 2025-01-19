
/* Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level). */



let  levelOrder = function(root) {
    if(root==null){
        return []
    }
  let array=[]
        let newarr=[]
        let i=1
       let queue=[]
       queue.push(root)
       while(queue.length){
        let temp=queue.shift()
        newarr.push(temp.val)
        i--
        if(temp.left){
            queue.push(temp.left)
        }
        if(temp.right){
            queue.push(temp.right)
        }
        if(i==0){
            array.push(newarr)
            newarr=[]
            i=queue.length
           }
       }
      return array
};