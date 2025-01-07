// time complexcity O(log n)
//works on sorted arrays only
function binary(arr,target){
    let min=0
    let max=arr.length-1
   if(arr.length===0){
    return -1
   }
  while(min<=max){
    let middle=Math.floor((max+min)/2)
    if(arr[middle]===target){
        return middle
    }
    if(target<arr[middle]){
        max=middle-1
    }                                      
    if(target>arr[middle]){
     min=middle+1
    }
  }

return -1
}


