

const distinctcolors=(queries,limit)=>{
     let map1=new Map()
     let map2=new Map()
     let arr=[]

     for(let i=0;i<queries.length;i++){
        let x=queries[i][0]
        let y=queries[i][1]

        if(map1.has(x)){
            let value=map1.get(x)
            map2.set(value,map2.get(value)-1)
            if(map2.get(value)===0){
                map2.delete(value)
            }
        }
        map1.set(x,y)
        map2.set(y,(map2.get(y) || 0)+1)
         arr[i]=map2.size
         }

         return arr
}


console.log(distinctcolors([[0,1],[1,4],[1,1],[1,4],[1,1]],4))