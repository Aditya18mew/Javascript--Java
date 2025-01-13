import java.util.HashMap;
import java.util.Map;

public class minimumlength {
    public static int minimum(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i))==3){
                map.put(s.charAt(i),1);
            }
        }
        int[] count={0};
        map.forEach((_,freq)->{
            count[0]+=freq;
        });
        return count[0];
    }
    public static void main(String[] args) {
        String s="ucvbutgkohgbcobqeyqwppbxqoynxeuuzouyvmydfhrprdbuzwqebwuiejoxsxdhbmuaiscalnteocghnlisxxawxgcjloevrdcj";
        System.out.println(minimum(s));
    }
}
