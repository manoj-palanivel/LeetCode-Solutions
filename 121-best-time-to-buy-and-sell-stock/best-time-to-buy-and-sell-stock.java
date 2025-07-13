class Solution {
    public int maxProfit(int[] arr) {
        int count = 0;
        int low = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < low){
                low = arr[i];
            }
            else{
                int subcount = arr[i] - low;
                if(subcount > count){
                    count = subcount;
                }
            }

        }
        return count;
    }
}