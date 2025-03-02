
class Node{
    constructor(value){
        this.val=value
        this.left=null
        this.right=null
    }
}


  function sameTree(p,q){
    return check(p,q)
  }

  function check(p,q){
     if(p==null && q==null){
        return true
     }
     if(p==null || q==null || p.val!==q.val){
        return false
     }
     return check(p.left,q.left) && check(p.right,q.right)
  }



  sameTree(null,null)