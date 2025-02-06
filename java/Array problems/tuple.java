import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class tuple {

   static int maximumtuple(int[] nums){
            Map<Integer,ArrayList<String>> map =new HashMap<>();
     for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        int product=nums[i]*nums[j];
        String pair="";
        if(nums[i]>nums[j]){
          int[] arr={nums[i],nums[j]};
         pair=arr.toString();
        }else{
          int[] arr={nums[j],nums[i]};
         pair=arr.toString();
        }
        if(!map.containsKey(product)){
             map.put(product, new ArrayList<>());
        }
        map.get(product).add(pair);
      }
     }

int[] arr={0};
     map.forEach((key,value)->{
  arr[0]+=value.size()*(value.size()-1)/2;
     });

     return arr[0]*8;
    }

    public static void main(String[] args) {


    }
}