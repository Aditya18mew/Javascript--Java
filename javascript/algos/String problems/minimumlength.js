/* You are given a string s.

You can perform the following process on s any number of times:

Choose an index i in the string such that there is at least one character to the left of index i that is equal to s[i], and at least one character to the right that is also equal to s[i].
Delete the closest character to the left of index i that is equal to s[i].
Delete the closest character to the right of index i that is equal to s[i].
Return the minimum length of the final string s that you can achieve. */

let s="ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj"
let minimumLength = function(s) {
    let map=new Map()
 for(let i=0;i<s.length;i++){
     map.set(s[i],(map.get(s[i]) || 0)+1)
     if(map.get(s[i])===3){
         map.set(s[i],1)
     }
 }
 let count=0
 for(let [key,freq] of map){
     count+=freq
 }
 return count
 } 

 console.log(minimumLength(s))