class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int count = 0;
        int str = arr[0];
        int profit = 0;

        for(int i=1; i<n; i++){
            if(arr[i] < str){
                str = arr[i];
            }
            else{
                profit += arr[i] - str;
                str = arr[i];
            }
        }
        return profit;
    }
}