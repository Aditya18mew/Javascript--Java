

let res=[]
 
function subsets(nums){
    let subset=[]
dfs(0,nums,subset)
return res

}

function dfs(i,nums,subset){
   if(i>=nums.length){
    res.push([...subset])
    return;
   }
  subset.push(nums[i])
   dfs(i+1,nums,subset)

   subset.pop()
   dfs(i+1,nums,subset)
}





