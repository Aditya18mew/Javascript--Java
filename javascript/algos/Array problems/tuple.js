
function maximumtuple(nums){
let count=0
let map=new Map()
for(let i=0;i<nums.length;i++){
   for(let j=i+1;j<nums.length;j++){
      let product=nums[i]*nums[j]
      let pair=[nums[i],nums[j]].sort((a,b)=>a-b).toString()
      if(!map.has(product)){
       map.set(product,[])
      }
      map.get(product).push(pair)
   }
}

for(let [key,value] of map){
   count+=Math.floor((value.length*(value.length-1))/2)
}
return count*8
}