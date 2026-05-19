import java.util.ArrayList;
import java.util.List;

public class subsets {
 static List<List<Integer>> res=new ArrayList<>();
    public static List<List<Integer>> subsettt(List<Integer> nums){
       
           List<Integer> subset=new ArrayList<>();
           dfs(0, subset, nums);
         return res;
    }

    public static void dfs(int i,List<Integer> subset ,List<Integer> nums){
             if(i>=nums.size()){
                res.add(new ArrayList<>(subset));
                  return;
             }

             subset.add(nums.get(i));
             dfs(i+1, subset, nums);

             subset.remove(subset.size()-1);
             dfs(i+1, subset, nums);
    }
    

    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

      List<List<Integer>> result=subsettt(nums);

      for(List<Integer> a:result){
              String c="";
        for(Integer b:a){
            c+=b+" ";
        }
        System.out.println(c);
      }
    }
}
