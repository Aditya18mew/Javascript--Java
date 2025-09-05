package graph;

import java.util.HashSet;
import java.util.Set;

public class rotatematrix {

     public static void rotate(int[][] matrix) {
        int n=matrix.length;
        Set<String> swapped=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                  if(!swapped.contains(i+","+j)){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                    swapped.add(i+","+j);
                    swapped.add(j+","+i);
                  }
            }
        }
         
         swapped.clear();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                  if(!swapped.contains(i+","+j)){
                    int temp=matrix[i][j];
                    int t=n-1-j;
                    matrix[i][j]=matrix[i][t];
                    matrix[i][t]=temp;
                    swapped.add(i+","+j);
                    swapped.add(i+","+t);
                  }
            }
        }
    }
      

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
         rotate(matrix);
    }
}
