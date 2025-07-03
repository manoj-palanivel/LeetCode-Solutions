class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int high = 0;
        int low = 0;

        int minsize = Integer.MAX_VALUE;
        int a = minsize;
        int sum = 0;

        while(high<arr.length){
            sum+=arr[high];
            high++;

            while(sum >= target){

                int currminsize = high - low;
                minsize = Math.min(currminsize,minsize);

                sum -= arr[low];
                low++;
            }
        }
        if(minsize == a){
            return 0;
        }
        else{
            return minsize;
        }
    }
}