
public class traprainwater {
      

    public static int trap(int[] nums){
         int[] leftmax=new int[nums.length];
         int[] rightmax=new int[nums.length];
         int left=0;
         int right=0;
         for(int i=0;i<nums.length;i++){
            left=Math.max(left, nums[i]);
            leftmax[i]=left;
         }
         for(int i=nums.length-1;i>=0;i--){
            right=Math.max(right, nums[i]);
            rightmax[i]=right;
         }
            int water=0;
         for(int i=0;i<nums.length;i++){
            water=water+Math.min(leftmax[i],rightmax[i])-nums[i];
         }
         return water;
    } 

    public static void main(String[] args) {
        int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};

           System.out.println(trap(nums));
    }
}
