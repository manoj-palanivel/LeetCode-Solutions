class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int a = 0;

        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] == nums[i+1]){
                a++;
                break;
            }
            else{
                continue;
            }
        }
        if(a>0){
            return true;
        }
        return false;
    }
}