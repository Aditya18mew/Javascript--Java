

public class dividetwonumbers {
    
public static int divide(int dividend, int divisor){
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
    return Integer.MAX_VALUE;
}
       int quotient=0;

    long a=Math.abs((long) dividend);
    long b=Math.abs((long) divisor);

          while(a>=b){
               long temp=b;
               long multiple=1;
               while(a>=(temp<<1)){
              temp= temp<<1;
             multiple= multiple<<1;
               }
                a-=temp;
        quotient+=multiple;
        }
       

     return  ((dividend < 0) ^ (divisor < 0)) ? -quotient : quotient;
}
   public static void main(String[] args) {
        System.out.println(divide(20, 6));
    }
 
}
