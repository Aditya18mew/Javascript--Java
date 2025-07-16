/* You are given two 0-indexed integer permutations A and B of length n.
A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.
Return the prefix common array of A and B.
A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once. */



let findThePrefixCommonArray = function(A, B) {
    let setA=new Set()
  let setB=new Set()
  let C=[]
  let count=0
  for(let i=0;i<A.length;i++){
      setA.add(A[i],1)
      setB.add(B[i],1)
     
      if(setA.has(B[i]) && A[i]!==B[i]){
          count++;
      }
      if(setB.has(A[i])){
          count++
      }
      C.push(count)
  }

  
  return C
};