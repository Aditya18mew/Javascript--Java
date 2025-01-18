import java.util.Arrays;

class validgridpath {

      public static int minCost(int[][] grid) {
        int[][] minchanges=new int[grid.length][grid[0].length];
  for(int i=0;i<minchanges.length;i++){
    for(int j=0;j<minchanges[i].length;j++){
      minchanges[i][j]=Integer.MAX_VALUE;
    }
  }
  minchanges[0][0]=0;
  while(true){
    int[][] prevState = new int[minchanges.length][minchanges[0].length];
            for (int row = 0; row < grid.length; row++) {
                prevState[row] = Arrays.copyOf(minchanges[row], grid[row].length);
            }
    for(int i=0;i<grid.length;i++){
      for(int j=0;j<grid[i].length;j++){
        if(i>0){
          minchanges[i][j]=Math.min(minchanges[i][j],minchanges[i-1][j]+(grid[i-1][j]==3? 0:1));
        }
        if(j>0){
          minchanges[i][j]=Math.min(minchanges[i][j],minchanges[i][j-1]+(grid[i][j-1]==1? 0:1));
        }
      }
  }
  for(int i=grid.length-1;i>=0;i--){
      for(int j=grid[i].length-1;j>=0;j--){
          if(i<grid.length-1){
              minchanges[i][j]=Math.min(minchanges[i][j],minchanges[i+1][j]+(grid[i+1][j]==4? 0:1));
          }
          if(j<grid[i].length-1){
              minchanges[i][j]=Math.min(minchanges[i][j],minchanges[i][j+1]+(grid[i][j+1]==2? 0:1));
          }
  }
  }
  if (Arrays.deepEquals(prevState, minchanges)) {
                break;
            }
  }
  return minchanges[minchanges.length-1][minchanges[0].length-1];
    }

    public static void main(String[] args) {
        
    }
    
}