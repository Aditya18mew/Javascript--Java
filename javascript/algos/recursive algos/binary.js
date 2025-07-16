
//time complexcity O(log n)

function recursivebinary(arr,target){
   return search(arr,0,arr.length-1,target)
}







function search(arr,min,max,target){
    if(min<=max){
        let middle=Math.floor((max+min)/2)
        if(target===arr[middle]) return middle
        if(target<arr[middle])  return search(arr,min,middle-1,target)
        if(target>arr[middle])   return search(arr,middle+1,max,target)
    }else{
        return -1
    }
}