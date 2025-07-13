class Solution {
    public int removeElement(int[] arr, int val) {
        int count = 0;
        int a = 0;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == val){
            continue;
        }
        else{
            arr[a++] = arr[i];
            count ++;
        }
    }
    return count;
    }
}