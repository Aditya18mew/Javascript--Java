let a=[]
for(let i=0;i<20;i++){
    a.push(Math.floor(Math.random()*100-50))
}


function timeoutsort(arr){
     for(let i=0;i<arr.length;i++){
        setTimeout(()=>{
          console.log(arr[i])
        },arr[i])
    }
  
}

timeoutsort(a)