class Solution {
    public int removeDuplicates(int[] arr) {
   HashSet <Integer> set = new HashSet<>();
   int count = 0;
   int a = 0;

   for(int i=0;i<arr.length;i++){
    if(set.contains(arr[i])){
        continue;
    }
    else{
        set.add(arr[i]);
        arr[a++] = arr[i];
        count++;
    }
   }
   return count;
}
}