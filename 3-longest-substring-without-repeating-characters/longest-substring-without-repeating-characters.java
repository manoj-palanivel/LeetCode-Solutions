class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0;
        int maxcount = 0;

        for(int i=0;i<n;i++){
            char b = s.charAt(i);
            while(set.contains(b)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(b);
            maxcount = Math.max(maxcount, i - left + 1);

        }
        return maxcount;
    }
}