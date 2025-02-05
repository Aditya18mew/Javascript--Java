/* you are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false. */
 
 
 
 class swappossible {
    
     boolean areAlmostEqual(String s1, String s2) {
        int i=0;
        int j=0;
        int count=0;
        for(int k=0;k<s1.length();k++){
            if(s1.charAt(k)!=s2.charAt(k)){
                if(i==0){
                 i=k;
                }else{
                    j=k;
                }
                count++;
            }
        }
        if(count>2 || count==1){
            return false;
        }
        if(s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }

}
