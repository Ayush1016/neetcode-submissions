class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>ans=new HashMap<>();
        int rem;
        for(int i=0;i<nums.length;i++){
            rem=target-nums[i];
            if(ans.containsKey(rem)){
                return new int[] {ans.get(rem),i};
            }
            ans.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
