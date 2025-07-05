public class validpalindrome {

     public static  boolean isPalindrome(String s) {
       String  newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       int left=0;
       int right=newS.length()-1;
       boolean ispalindrome=true;
       while(left<=right){
        if(newS.charAt(left)!=newS.charAt(right)){
            ispalindrome=false;
            break;
        }
        left++;
        right--;
       }
       return ispalindrome;
    }


 public static void main(String[] args) {
    
 }
}