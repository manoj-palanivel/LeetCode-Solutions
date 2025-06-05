class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int count=0;
        int str = arr[0];

        for(int i=0;i<n;i++){
             if(arr[i] < str){
                str = arr[i];
             }
             else{
                if(count < (arr[i] - str)){
                    count = arr[i] - str;
                }
                else{
                    continue;
                }
             }

        }
        return count;
    }
}