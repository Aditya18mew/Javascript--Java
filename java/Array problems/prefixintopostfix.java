

public class prefixintopostfix {

    public static int[] productofarrayexceptself(int[] nums){
          int[] answer=new int[nums.length];
        int prefix=1;
        answer[0]=1;
        answer[nums.length-1]=1; 
        for(int i=0;i<nums.length;i++){    
          answer[i]=prefix;
          prefix=prefix*nums[i];
        }
       
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){   
            answer[i]=answer[i]*postfix;
            postfix=postfix*nums[i];
        }
        return answer;
    }


    public static void main(String[] args) {

        int[] nums={1,2,3,4};
      int[] answer=  productofarrayexceptself(nums);

      
    }
    
}
