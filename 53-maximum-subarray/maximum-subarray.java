class Solution {
    public int maxSubArray(int[] arr) {

        int curr_max = 0;
        int final_max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(curr_max < 0){
                curr_max = 0;
            }
            curr_max = curr_max + arr[i];
            final_max = Math.max(curr_max,final_max);
        }
        return final_max;
    }
}