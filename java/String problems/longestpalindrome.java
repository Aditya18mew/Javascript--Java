/* Given a string s, return the longest palindromic substring in s. */

public class longestpalindrome {
    public static String longestPalindrome(String s) {
        String str="";
        int[] index=getindex(s);
        for(int i=index[0];i<=index[1];i++){
            str+=s.charAt(i);
        }
        return str;   
    }

    public static int[] getindex(String s){
        int[] index={0,0};
        for(int i=0;i<s.length();i++){
            int startindex=i;
            int endindex=i;
            while(startindex>=0 && endindex<s.length() && s.charAt(startindex)==s.charAt(endindex)){
                if(endindex-startindex>index[1]-index[0]){
                    index[0]=startindex;
                    index[1]=endindex;
                }
                startindex--;
                endindex++;
            }
            startindex=i;
            endindex=i+1;
            while(startindex>=0 && endindex<s.length() && s.charAt(startindex)==s.charAt(endindex)){
                if(endindex-startindex>index[1]-index[0]){
                    index[0]=startindex;
                    index[1]=endindex;
                }
                startindex--;
                endindex++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
      String str=longestPalindrome("abcba");
      System.out.println(str);
    }
}
