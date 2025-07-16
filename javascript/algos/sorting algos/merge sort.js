// time complexcity O(nlogn)
let a=[]
for(let i=0;i<20;i++){
    a.push(Math.floor(Math.random()*100-50))
}



function mergesort(arr){
    if(arr.length<2){
        return arr
    }
    let mid=Math.floor(arr.length/2)
    let left=arr.slice(0,mid)
    let right=arr.slice(mid)
    return merge(mergesort(left),mergesort(right))
}

function merge(left,right){
    let sortedarr=[]
while(left.length && right.length){
    if(left[0]<=right[0]){
        sortedarr.push(left.shift())
    }else 
    {
        sortedarr.push(right.shift())
    }
    
}
return [...sortedarr,...left,...right]
}



