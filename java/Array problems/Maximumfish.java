import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


/* You are given a 0-indexed 2D matrix grid of size m x n, where (r, c) represents:

A land cell if grid[r][c] = 0, or
A water cell containing grid[r][c] fish, if grid[r][c] > 0.
A fisher can start at any water cell (r, c) and can do the following operations any number of times:

Catch all the fish at cell (r, c), or
Move to any adjacent water cell.
Return the maximum number of fish the fisher can catch if he chooses his starting cell optimally, or 0 if no water cell exists.

An adjacent cell of the cell (r, c), is one of the cells (r, c + 1), (r, c - 1), (r + 1, c) or (r - 1, c) if it exists. */

class Maximumfish {


public int findMaxFish(int[][] grid) {
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        int maximumfish=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>0){
                    Stack<int[]> stack=new Stack<>();
                    int fishcollected=0;
                     int[] newarr={i,j};
                     stack.add(newarr);
                   
                    Set<String> visited=new HashSet<>();
                    while(!stack.empty()){
                     int[] temp=stack.pop();
                     String key=temp[0]+","+temp[1];
                     if(!visited.contains(key)){
                        fishcollected+=grid[temp[0]][temp[1]];
                        visited.add(key);
                     }
                     for(int k=0;k<4;k++){
                        int newx=temp[0]+directions[k][0];
                        int newy=temp[1]+directions[k][1];
                        if(newx>=0 && newy>=0 && newx<grid.length && newy<grid[i].length && grid[newx][newy]>0 && !visited.contains(newx+","+newy)){
                            int[] arr={newx,newy};
                            stack.add(arr);
                        }
                     }
                    }
                    maximumfish=Math.max(maximumfish,fishcollected);
                }
            }
        }
        return maximumfish;
    }

    public static void main(String[] args) {
        
    }
    
}