package JAVASCRIPT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stringsubset{

 public static Map<Character,Integer> freqmap(String word){
    Map<Character,Integer> localmap=new HashMap<>();
    for(int i=0;i<word.length();i++){
        localmap.put(word.charAt(i),localmap.getOrDefault(word.charAt(i),0)+1);
    }
    return localmap;
}


  public static List<String> wordSubsets(String[] words1, String[] words2) {
        
    List<String> output=new ArrayList<>();
Map<Character,Integer> words2map=new HashMap<>();
for(int i=0;i<words2.length;i++){
Map<Character,Integer> localmap=freqmap(words2[i]);
localmap.forEach((key,value)->{
words2map.put(key,Math.max(words2map.getOrDefault(key,0),value));
});
}

for(int i=0;i<words1.length;i++){
Boolean[] universal={true};
Map<Character,Integer> localmap=freqmap(words1[i]);
words2map.forEach((key,value)->{
      if(!localmap.containsKey(key)){
     universal[0]=false;
      }else{
        if(localmap.get(key)<value){
            universal[0]=false;
        }
      }
});
if(universal[0]==true){
output.add(words1[i]);
}
}

return output;

  }
  
  public static void main(String[] args) {
    String[] words1 = {"amazon","apple","facebook","google","leetcode"}; 
   String[] words2={"lo","eo"};
List<String> subset=wordSubsets(words1, words2);
System.out.println(subset);
  }

    
}