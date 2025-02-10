

function numberofbadparis(nums){
    let totalpairs=nums.length*((nums.length-1)/2)
  let lmap=new Map()
  for(let i=0;i<nums.length;i++){
    lmap.set(i-nums[i],(lmap.get(i-nums[i]) || 0) +1)
  }
  for(let [key,value] of lmap){
   if(value>1){
    totalpairs-= value*((value-1)/2)
   }
  }
  return totalpairs
}
