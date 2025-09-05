package graph;
import java.util.*;



public class wallsandgates {
    
      public static int[][] find(int[][] graph){
        int[][] directions={{-1,0},{1,0},{0,1},{0,-1}};
        Queue<int[]> qu=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                   if(graph[i][j]==0){
                    int[] arr={i,j};
                    qu.offer(arr);
                   }
            }
        }

        while(!qu.isEmpty()){
            int[] arr=qu.poll();
            int x=arr[0];
            int y=arr[1];

              for(int[] i:directions){
                 int newx=x+i[0];
                 int newy=y+i[1];
                 if(newx>=0 && newx<graph.length && newy>=0 && newy<graph[newx].length && graph[newx][newy]!=-1){
                    if(graph[newx][newy]==Integer.MAX_VALUE){
                      graph[newx][newy]=graph[x][y]+1;
                      int[] newarr={newx,newy};
                      qu.add(newarr);
                    }
                 }
                
            }
        }
        return graph;
      }

    public static void main(String[] args) {
       
      int[][] graph= {
  {2147483647, -1, 0, 2147483647},
  {2147483647, 2147483647, 2147483647, -1},
  {2147483647, -1, 2147483647, -1},
  {0, -1, 2147483647, 2147483647}
      };

   int[][] result=  find(graph);
   for(int[] i:result){
    for(int j:i){
      System.out.println(j);
    }
   }

    }
}
