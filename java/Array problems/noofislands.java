import java.util.Stack;

class noofislands {


   static int numberofislands(int[][] grid){
    
      boolean[][] visited=new boolean[grid.length][grid[0].length];
      int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};

    int count=0;
     for(int i=0;i<grid.length;i++){
      for(int j=0;j<grid[i].length;j++){
         if(grid[i][j]==1 && !visited[i][j]){
          Stack<int[]> stack=new Stack<>();
          stack.push(new int[]{i,j});
          visited[i][j]=true;
          count++;
          while(!stack.isEmpty()){
            int[] arr=stack.pop();
            for(int k=0;k<directions.length;k++){
              int newi=arr[0]+directions[k][0];
              int newj=arr[1]+directions[k][1];
              if(newi>=0 && newj>=0 && newi<grid.length && newj<grid[0].length && grid[newi][newj]==1 && !visited[newi][newj]){
                visited[newi][newj] = true;
                stack.push(new int[]{newi,newj});
              }
            }
          }
         }
      }
     }
    return count;
    }

     
   public static void main(String[] args) {
    int[][] grid={{1,1,0,0},{1,0,0,0},{0,0,1,0},{0,0,0,1}};
    System.out.println(numberofislands(grid));
   }
    

}