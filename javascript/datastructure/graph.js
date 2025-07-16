   

   class graph{
      #adjmatrix
      constructor(nodes){
      this.#adjmatrix=new Array(nodes)
      for(let i=0;i<this.#adjmatrix.length;i++){
        this.#adjmatrix[i]=[]
      }
      }
      addedge(u,v){
  this.#adjmatrix[u].push(v)
  this.#adjmatrix[v].push(u)
    } 

    dfs(start){
      let stack=[start]
      let visited=new Set()
      while(stack.length>0){
        let node=stack.pop()
        if(!visited.has(node)){
          console.log(node)
          visited.add(node)
        }
        for(let i=this.#adjmatrix[node].length-1;i>=0;i--){
          if(!visited.has(this.#adjmatrix[node][i])){
            stack.push(this.#adjmatrix[node][i])
          }
        }
      }
    }
      print(){
        for(let i=0;i<this.#adjmatrix.length;i++){
           console.log(`${i}->${this.#adjmatrix[i]}`)
        }
      }
   }


   const linkedlist=require("./singleylinkedlist")
   
   class linkedgraph{
    #adjlist
constructor(nodes){
this.#adjlist=new Array(nodes)
for(let i=0;i<this.#adjlist.length;i++){
  let templist=new linkedlist()
  this.#adjlist[i]=templist
}

}

addedge(u,v){
  this.#adjlist[u].append(v)
  this.#adjlist[v].append(u)
}
print(){
  for(let i=0;i<this.#adjlist.length;i++){
    let curr=this.#adjlist[i].head
    let s=`${i}->`
    while(curr){
    s+=`${curr.value},`
    curr=curr.next
    }
    console.log(s)
  }
  }
   
dfs(start){
  let stack=[start]
  let visited=new Set()
  while(stack.length>0){
    let node=stack.pop()
    if(!visited.has(node)){
      console.log(node)
      visited.add(node)
    }
    
    let curr=this.#adjlist[node].head
    
    while(curr){
      if(!visited.has(curr.value)){
        stack.push(curr.value)
      }
      curr=curr.next
    }
  }
}


}



   let gr=new linkedgraph(4)
   gr.addedge(0,1)
   gr.addedge(1,2)
   gr.addedge(1,3)
   gr.addedge(2,0)
   gr.dfs(0)
   gr.print()


   
 

   
