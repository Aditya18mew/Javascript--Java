class ascendingarr {

   int maximumsum(int[] nums){
    int maximumsum=nums[0];
    int sum=nums[0];
    for(int i=1;i<nums.length;i++){
       if(nums[i]>nums[i-1]){
        sum+=nums[i];
       }else{
        sum=nums[i];
       }
       maximumsum=Math.max(maximumsum,sum);
    }
    return maximumsum;
}  
 
   public static void main(String[] args) {

}

}