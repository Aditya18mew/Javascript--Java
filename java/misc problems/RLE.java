

 class RLE {
    static String findRLE(int n){
        String ogstr="1";
        for(int i=1;i<n;i++){
            String newstr="";
            int count=1;
            for(int j=0;j<ogstr.length();j++){
                if(j+1<ogstr.length() && ogstr.charAt(j+1)==ogstr.charAt(j)){
                    count++;
                }else{
                    newstr+=count+""+ogstr.charAt(j);
                    count=1;
                }
            }
            ogstr=newstr;
        }
        return ogstr;
    }

    public static void main(String[] args) {

        
    }
}
