/* You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false. */

const  areAlmostEqual = (s1, s2)=> {
    let arr=[]
    for(let i=0;i<s1.length;i++){
        if(s1[i]!==s2[i]){
            arr.push(i)
        }
    }
    if(arr.length>2 || arr.length===1){
        return false
    }
    if(s1[arr[0]]===s2[arr[1]] && s1[arr[1]]===s2[arr[0]]){
        return true
    }
    return false
};