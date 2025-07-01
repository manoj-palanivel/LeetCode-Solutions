class Solution {
    public int maxSubArray(int[] arr) {
        int maxsofar = arr[0];
        int finalmax = arr[0];
        int n = arr.length;

        for(int i=1;i<n;i++){
            maxsofar = Math.max(arr[i],arr[i] + maxsofar);
            finalmax = Math.max(maxsofar,finalmax);
        }
        return finalmax;
    }
}