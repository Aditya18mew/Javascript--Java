/* You are given two 0-indexed integer permutations A and B of length n.
A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.
Return the prefix common array of A and B.
A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once. */

import java.util.HashSet;
import java.util.Set;

public class Commonprefix {
    
public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA=new HashSet<>() ;
        Set<Integer> setB=new HashSet<>() ;
        int[] C=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            setA.add(A[i]);
            setB.add(B[i]);
            if(setA.contains(B[i]) && A[i]!=B[i]){
               count++;
            }
            if(setB.contains(A[i])){
                count++;
            }
            C[i]=count;
        }
        return C;
    }

    public static void main(String[] args) {
        


    }
}
