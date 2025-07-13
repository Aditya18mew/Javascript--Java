import java.util.HashSet;
import java.util.Set;


   
    public class construct {

        public static int[] constructDistancedSequence(int n) {
      int size=n*2-1;
      int[] res=new int[size];
      for(int i=0;i<res.length;i++){
         res[i]=0;
      }
      Set<Integer> used=new HashSet<>();
       backtrack(0,res,used,size,n);
       return res;
    }

     public static boolean backtrack(int index,int[] res, Set<Integer> used,int size,int n){
    if(index==size) return true;
    if(res[index]!=0) return backtrack(index+1,res,used,size,n);


    for(int num=n;num>0;num--){
        if(used.contains(num)==true) continue;
        if(num==1){
            res[index]=num;
            used.add(num);
            if(backtrack(index+1,res,used,size,n)==true) return true;
            res[index]=0;
            used.remove(num);
        } else{
            int nextposition=index+num;
            if(nextposition< size && res[nextposition]==0){
                res[index]=num;
                res[nextposition]=num;
                used.add(num);
                if(backtrack(index+1,res,used,size,n)==true) return true;
            res[index]=0;
                res[nextposition]=0;
                used.remove(num);
            }
        }
    }
return false;

}
    
        public static void main(String[] args) {
            int[] arr=constructDistancedSequence(3);
        }
    }

  


