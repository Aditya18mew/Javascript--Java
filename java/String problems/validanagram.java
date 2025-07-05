import java.util.Arrays;

public class validanagram {

public static boolean validAnagram(String s,String t){
if(s.length()!=t.length()){
    return false;
}

char[] sort1=s.toCharArray();
Arrays.sort(sort1);
char[] sort2=t.toCharArray();
Arrays.sort(sort2);
return Arrays.equals(sort1, sort2);
}


 public static void main(String[] args) {
      validAnagram(null, null);
 }
}