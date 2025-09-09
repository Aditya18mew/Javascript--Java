import java.util.*;

public class decodestring {
       
    public static String decodeString(String s) {
         Stack<String> stack=new Stack<>();
           
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){
              stack.push(s.substring(i, i+1));
            }else {
                String substring="";
                while(!stack.isEmpty() &&  !stack.peek().equals("[")){
                    substring=stack.pop()+substring;
                }
                stack.pop();
                String k="";
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    k=stack.pop()+k;
                }
                int multi=Integer.parseInt(k);
                String expanded=substring.repeat(multi);
                stack.push(expanded);
            }    
        }
          String res="";
        for(String t:stack){
            res=res+t;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
 } 
