class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer>set = new HashSet<>();
        int a = 0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                a++;
                break;
            }
            else{
                set.add(arr[i]);
            }
        }
        if(a>0){
            return true;
        }
        return false;
    }
}