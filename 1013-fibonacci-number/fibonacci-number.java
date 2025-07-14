class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        return ans(n);
    }

    static int ans(int n){
        if(n==1 || n==2){
            return 1;
        }
        else{
            return(ans(n-1) + ans(n-2));
        }
    }
}