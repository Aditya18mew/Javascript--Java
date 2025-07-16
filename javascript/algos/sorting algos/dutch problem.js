let a=[]
for(let i=0;i<20;i++){
    a.push(Math.floor(Math.random()*3))
}

console.log(a)
function sort(arr){
let count=[0,0,0]
for(let i=0;i<arr.length;i++){
    if(arr[i]===0){
        count[0]+=1
    }
    if(arr[i]===1){
        count[1]+=1
    }
    if(arr[i]===2){
        count[2]+=1
    }
}
let currentnumber=0
for(let i=0;i<arr.length;i++){
    if(!count[currentnumber]){
        currentnumber+=1
    }
    arr[i]=currentnumber
    count[currentnumber]-=1
}
return arr
}

console.log(sort(a))

