import java.util.Arrays;
/* Given an m x n grid. Each cell of the grid has a sign pointing to the next cell you should visit if you are currently in this cell. The sign of grid[i][j] can be:

1 which means go to the cell to the right. (i.e go from grid[i][j] to grid[i][j + 1])
2 which means go to the cell to the left. (i.e go from grid[i][j] to grid[i][j - 1])
3 which means go to the lower cell. (i.e go from grid[i][j] to grid[i + 1][j])
4 which means go to the upper cell. (i.e go from grid[i][j] to grid[i - 1][j])
Notice that there could be some signs on the cells of the grid that point outside the grid.

You will initially start at the upper left cell (0, 0). A valid path in the grid is a path that starts from the upper left cell (0, 0) and ends at the bottom-right cell (m - 1, n - 1) following the signs on the grid. The valid path does not have to be the shortest.

You can modify the sign on a cell with cost = 1. You can modify the sign on a cell one time only.

Return the minimum cost to make the grid have at least one valid path. */



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