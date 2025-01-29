 class maxwater {
 
    int maxarea(int[] height) {
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
        
    }
}