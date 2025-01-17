   

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
 
   let gr=new graph(4)
   gr.addedge(0,1)
   gr.addedge(0,3)
   gr.print()
   
