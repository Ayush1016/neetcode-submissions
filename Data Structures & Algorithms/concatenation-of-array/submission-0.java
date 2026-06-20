class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[2*nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            res[i]=res[i+nums.length]=nums[i];
        } 
        return res;
    }
}