class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<n;i++){
            int ne = target - arr[i];

            if(map.containsKey(ne)){
                ans[0] = map.get(ne);
                ans[1] = i;
                break;

            }
            else{
                map.put(arr[i],i);
            }
        }
        return ans;

    }
}