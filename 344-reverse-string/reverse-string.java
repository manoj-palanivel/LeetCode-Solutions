class Solution {
    public void reverseString(char[] arr) {
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}