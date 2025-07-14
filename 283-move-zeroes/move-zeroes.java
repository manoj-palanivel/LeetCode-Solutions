class Solution {
    public void moveZeroes(int[] arr) {
        int a = 0;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                a = i;
                b++;
                break;
            }
        }
        if(b==0){
            return;
        }


        for(int i=a+1;i<arr.length;i++){
            if(arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
                a++;
            }
        }

    }
}