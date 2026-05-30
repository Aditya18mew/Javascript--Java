import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class meetings {

   static class meet{
        int start;
        int end;

        meet(int start,int end){
            this.start=start;
            this.end=end;
        }
    }


    public static int Nmeetings(int[] start,int[] end){
      meet[] meeting=new meet[start.length];

      for(int i=0;i<start.length;i++){
        meeting[i]=new meet(start[i], end[i]);
      }

      Arrays.sort(meeting,(a,b)->a.end-b.end);

    int meets=1;
    int lastend=meeting[0].end;
    for(int i=1;i<meeting.length;i++){
        if(meeting[i].start>lastend){
            meets++;
            lastend=meeting[i].end;
        }
    }    
  return meets;
    }

    public static void main(String[] args) {
       int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

   

    }
    
}
