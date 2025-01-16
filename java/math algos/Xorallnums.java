/* You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. There exists another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).

Return the bitwise XOR of all integers in nums3. */



class Xorallnums {
    
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int output=0;
        if(nums1.length%2==0 && nums2.length%2==0){
            output=0;
        }
        if(nums1.length%2!=0 && nums2.length%2==0){
           for(int i:nums2){
            output^=i;
           }
        }
        if(nums1.length%2==0 && nums2.length%2!=0){
            for(int i:nums1){
            output^=i;
           }
        }
        if(nums1.length%2!=0 && nums2.length%2!=0){
             for(int i:nums1){
            output^=i;
           }
           for(int i:nums2){
            output^=i;
           }
        }
        return output;
    }
public static void main(String[] args) {
    
}
}
