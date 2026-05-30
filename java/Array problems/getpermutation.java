import java.util.ArrayList;
import java.util.List;

public class getpermutation {
    
     public String getPermutation(int n, int k) {
          List<Integer> list=new ArrayList<>();
          long[] fact=new long[n+1];
          fact[0]=1;
          for(int i=1;i<=n;i++){
              fact[i]=fact[i-1]*i;
          }

         for(int i=1;i<=n;i++){
            list.add(i);
         }
           int i=1;
           int swapcount=0;
         while(i<n){
            if(k==0) break;
            if(k>fact[n-i]){
                k=k-(int)fact[n-i];
                int temp=list.get(i+swapcount);
                list.set(i+swapcount,list.get(i-1));
                list.set(i-1,temp);
                swapcount++;
            }else{
                swapcount=0;
                i++;
            }
         }
         String str="";
         for(int j:list){
             str+=j;
         } 
         return str;
    }
    public static void main(String[] args) {
        
    }
}
