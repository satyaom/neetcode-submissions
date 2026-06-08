class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lookup = new HashMap<>();
        int j = 0;
        int maxL = 0;
        for(int i = 0; i < s.length(); i++) {
            if(lookup.containsKey(s.charAt(i))) {
                j = Integer.max(lookup.get(s.charAt(i))+1, j);
            }
            lookup.put(s.charAt(i), i);
            maxL = Integer.max(maxL, i - j + 1);
        }

        return maxL;
    }
}
