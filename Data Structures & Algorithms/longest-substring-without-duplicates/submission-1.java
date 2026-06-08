class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lookup = new HashMap<>();
        int ml = 0;
        int maxL = 0;
        char[] charArray = s.toCharArray();
        int i = 0;
        while(i < charArray.length) {
            if(lookup.get(charArray[i]) != null) {
                i = lookup.get(charArray[i])+1;
                ml = 0;
                lookup.clear();
            }
            lookup.put(charArray[i], i);
            ml++;
            maxL = Integer.max(maxL, ml);
            i++;
        }

        return maxL;
    }
}
