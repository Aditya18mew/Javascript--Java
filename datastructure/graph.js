   

   class graph{
      #adjmatrix
      constructor(nodes){
      this.#adjmatrix=new Array(nodes)
      for(let i=0;i<this.#adjmatrix.length;i++){
        this.#adjmatrix[i]=[]
        for(let j=0;j<nodes;j++){
            this.#adjmatrix[i][j]=0
        }
      }
      }
      addedge(u,v){
  this.#adjmatrix[u][v]=1
  this.#adjmatrix[v][u]=1
    } 
      print(){
        for(let i of this.#adjmatrix){
            let s=""
           for(let j of i){
           s+=j+" "
           }
           console.log(s)
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
  


   }


   
 

   
