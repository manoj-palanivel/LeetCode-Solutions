class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        int n = nums.length;
        int m = n/2;

        for(int i=0;i<n;i++){
            if(count == 0){
                element = nums[i];}

            if(element == nums[i]){
                count ++;
            }
            else{
                count--;
            }
        }
        return element;
            

    }
}