 class maxwater {
 
  static  int maxarea(int[] height) {
        int maxwater=0;
        int x=0;
        int y=height.length-1;
        while (x<y) {
            maxwater=Math.max(maxwater,Math.min(height[x], height[y])*(y-x));
            if(height[x]<=height[y]){
                x++;
            }else{
                y--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
   System.out.println(maxarea(height));
    }
}