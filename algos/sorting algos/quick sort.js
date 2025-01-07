//worst case time complexcity is O(n2) average complexcity O(nlogn)
let a=[]
for(let i=0;i<20;i++){
    a.push(Math.floor(Math.random()*100-50))
}
console.log(a)


function quicksort(arr){
    if(arr.length>1){
        let left=[]
        let right=[]
        let pivot=arr[arr.length-1]
    
    for(let i=0;i<arr.length-1;i++){
       if(arr[i]<pivot){
left.push(arr[i])
       }
       if(arr[i]>pivot){
right.push(arr[i])
       }
    }
    return [...quicksort(left),pivot,...quicksort(right)]
}
return arr
}


console.log(quicksort(a))