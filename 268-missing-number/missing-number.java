class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int a = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != a){
                return a;
            }
            else{
                a++;
            }


        }
        return a;
    }
}