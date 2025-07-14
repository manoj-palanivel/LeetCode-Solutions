class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return fact(n);
    }

    static boolean fact(int n){
        if(n==1){
        return true;
        }
       if(n%2 != 0){
        return false;
       }
       else{
        return fact(n/2);
       }
    }
}