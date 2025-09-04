package graph;
import java.util.*;

public class allwords {

     static class Node {
    int x,y;
    String word;
    Set<String> visited;

    public Node(int x,int y,String word,Set<String> visited){
        this.x=x;
        this.y=y;
        this.word=word;
        this.visited=visited;
    }
        
    }


    public static void printallwords(){
          
         Scanner sc=new Scanner(System.in);

        System.out.println("number of rows");
        int n=sc.nextInt();

        Character[][] graph=new Character[n][];
           for(int i=0;i<n;i++){
            System.out.println("no of elements in column");
               int m=sc.nextInt();
               graph[i]=new Character[m];
            for(int j=0;j<m;j++){
                graph[i][j]=sc.next().charAt(0);
            }
        }
        sc.close();

         ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                multidirection(i, j, list, graph);
            }
        }

        for(String s:list){
            System.out.println(s);
          }
    }
        public static void multidirection(int startx,int starty,ArrayList<String> list,Character[][] graph){
        int n=graph.length;
        int[][] direction={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,1},{-1,1},{1,-1}};

        Set<String> set=new HashSet<>();
        Stack<Node> stack=new Stack<>();
          stack.push(new Node(startx, starty, ""+graph[startx][starty],set));

          while(!stack.isEmpty()){
              Node newnode=stack.pop();
              String word=newnode.word;
              int x=newnode.x;
              int y=newnode.y;


              if(newnode.visited.contains(x+","+y)){
                continue;
              }else{
               newnode.visited.add(x+","+y);
                 list.add(word);
                for(int[] neigh:direction ){
                    int newx=x+neigh[0];
                    int newy=y+neigh[1];

                    if(newx>=0 && newx<n && newy>=0 && newy<graph[newx].length && !newnode.visited.contains(newx+","+newy)){
                        Set<String> newvisited=new HashSet<>(newnode.visited);
                        stack.push(new Node(newx, newy, word+graph[newx][newy], newvisited));
                    }
                }
              }
          }  
    }


    public static void main(String[] args) {
        printallwords();
    }

}