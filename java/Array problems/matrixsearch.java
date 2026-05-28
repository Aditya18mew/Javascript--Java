public class matrixsearch {

      public static boolean matsearch(int[][] matrix,int search){
            int i=0;
            int j=matrix.length-1;
            while(i<matrix.length && j>=0){
                if(search==matrix[i][j]){
                    return true;
                }
                if(search>matrix[i][j]){
                    i++;
                }else{
                    j--;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            

          int[][]  matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
          int target = 3;
          System.out.println(matsearch(matrix, target));
        }
}
