
let a=[]
for(let i=0;i<20;i++){
    a.push(Math.floor(Math.random()*100-50))
}
console.log(a)



function insertionsort(x){
    
    for(let i=1;i<x.length;i++){
        let notoinsert=x[i]
        let j=i-1
        while(j>=0 && x[j]>notoinsert){
            x[j+1]=x[j]
            j--
        }
       x[j+1]=notoinsert
    }

    return x
}


console.log(insertionsort(a))