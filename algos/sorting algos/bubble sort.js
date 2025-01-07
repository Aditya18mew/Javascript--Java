let a=[]
for(let i=0;i<20;i++){
    a.push(Math.floor(Math.random()*100-50))
}
console.log(a)



// we can reduce time complexity by using do while loop (if the values are swaped re-run the for loop otherwise don,t)

function bubblesort(x){
for(let i=0;i<x.length;i++){
    for(let j=i+1;j<x.length;j++){
              if(x[i]>x[j]){
                let temp=x[i]
                x[i]=x[j]
                x[j]=temp
              }
    }
}

return x

}



console.log(bubblesort(a))


