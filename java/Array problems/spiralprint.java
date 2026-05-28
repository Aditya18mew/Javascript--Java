public class spiralprint {
    
      public static  void spiral(int[][] matrix,int r,int c){
                int l=0,k=0;
                int i=0;
                String sum=" ";
            while(k<r && l<c){
                for(i=l;i<c;i++){
                sum+=matrix[k][i]+" ";          
            }
                k++;
                for(i=k;i<r;i++){
                sum+=matrix[i][c-1]+" ";
            }
                c--;
                // this condition is for single row or single column becuase if it is not provide we continue printin g again and again in a loop 
                if(k<r){
                for(i=c-1;i>=l;i--){
                sum+=matrix[r-1][i]+" ";
                }
                r--;
            } 
                if(l<c){
                for(i=r-1;i>=k;i--){
                sum+=matrix[i][l]+" ";
                }
                l++;
            }
              
            }
            System.out.println(sum);
        }
       public static void main(String[] args) {
        
       }
}
