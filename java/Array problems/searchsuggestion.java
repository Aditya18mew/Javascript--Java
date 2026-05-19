import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class searchsuggestion {

   public static List<List<String>> sani(String searchword, List<String> products){
    List<List<String>> res=new ArrayList<>();
   Collections.sort(products);
  int  l=0;
   int r=products.size()-1;

   for(int i=0;i<searchword.length();i++){
        Character c= searchword.charAt(i);
      
       while(l<=r && (products.get(l).length()<=i || products.get(l).charAt(i)!=c)){
         l++;
       }
       while(l<=r && (products.get(r).length()<=i || products.get(r).charAt(i)!=c)){
         r--;
       }
  List<String> newlist=new ArrayList<>();
      int remain=r-l+1;
    for(int j=0;j<Math.min(3, remain);j++){
       newlist.add(products.get(l+j));     
    }
 res.add(newlist);
   }

    return res;
   }


    public static void main(String[] args) {
        
List<String> products=new ArrayList<>();
products.add("mobile");
products.add("mouse");
products.add("moneypot");
products.add("monitor");
products.add("mousepad");

String searchword="mouse";

 List<List<String>> listoflist=sani(searchword, products);

 for(List<String> a:listoflist){
    for(String b:a){
        System.out.println(b);
    }
 }
    }


    
}
