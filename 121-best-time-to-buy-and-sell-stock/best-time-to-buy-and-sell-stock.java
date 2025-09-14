class Solution {
    public int maxProfit(int[] arr) {
      int n = arr.length;
      int min = arr[0];
      int diff = 0;
      for(int i=1;i<n;i++){
        if(arr[i] < min){
            min = arr[i];
        }
        else{
            int siff = arr[i] - min;
            if(siff>diff){
                diff=siff;
            }
        }
      }
      return diff;
    }
}