/* You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).

Return the bitwise XOR of all integers in nums3. */






function Xorallnums(nums1,nums2){
    let output=0
if(Math.floor(nums1.length%2)===0 && Math.floor(nums2.length%2)===0){
    return 0
}
if(Math.floor(nums1.length%2)!==0 && Math.floor(nums2.length%2)===0){
    for(let i of nums2){
        output^=i
    }
    return output
}
if(Math.floor(nums1.length%2)===0 && Math.floor(nums2.length%2)!==0){

    for(let i of nums1){
        output^=i
    }
    return output
}
if(Math.floor(nums1.length%2)!==0 && Math.floor(nums2.length%2)!==0){
    for(let i of nums1){
        output^=i
    }
    for(let i of nums2){
        output^=i
    }
    return output
}
}