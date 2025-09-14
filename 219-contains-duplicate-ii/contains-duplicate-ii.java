class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer,Integer>set = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(set.containsKey(arr[i])){
                if(i - set.get(arr[i]) <= k){
                    return true;
                }
                else{
                    set.remove(arr[i]);
                    set.put(arr[i],i);
                }
            }
            else{
                set.put(arr[i],i);
            }
        }
        return false;

    }
}