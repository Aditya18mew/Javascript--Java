import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;






public class dsitinctcolors {

    public static int[] distinctcolors(int[][] queries,int limit){
    ArrayList<Integer> local=new ArrayList<>();
     Map<Integer,Integer> map1=new HashMap<>();
     Map<Integer,Integer> map2=new HashMap<>();
     for(int i=0;i<queries.length;i++){
        int x=queries[i][0];
        int y=queries[i][1];
        if(map1.containsKey(x)){
            int value=map1.get(x);
            map2.put(value, map2.get(value)-1);
            if(map2.get(value)==0){
                map2.remove(value);
            }
        }
        map1.put(x, y);
        map2.put(y, map2.getOrDefault(y, 0)+1);
        local.add(map2.size());
     }

     int[] arr=new int[local.size()]; 
     for(int j=0;j<local.size();j++){
         arr[j]=local.get(j);
     }

       return arr;
}

    public static void main(String[] args) {
         /*  example  */ int limit=4;
    int[][] queries={{0,1},{1,4},{1,1},{1,4},{1,1}};
 int[]arr= distinctcolors(queries, limit);
 for(int i:arr){
    System.out.println(i);
 }
    }
}