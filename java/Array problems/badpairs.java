import java.util.HashMap;
import java.util.Map;


public class badpairs {

  public static long numberofbadpairs(int[] nums){
    Map<Integer,Integer> map=new HashMap<>();
    int goodpairs=0;
    for(int i=0;i<nums.length;i++){
      map.put(i-nums[i],map.getOrDefault(i-nums[i],0)+1);
    }
    for( int  value:map.values()){
      if(value>1){
          goodpairs+=value*(value-1)/2;
      }
    }
    long badpairs=(long)nums.length*(nums.length-1)/2-(long)goodpairs;
 
 
    return badpairs;
}


  public static void main(String[] args) {
      int[] arr={4,1,3,3};
   numberofbadpairs(arr);
  }
}


