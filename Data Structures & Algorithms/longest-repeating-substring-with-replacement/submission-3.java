class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int mL = 0;
        int l = 0;
        Map<Character, Integer> lookup = new HashMap<>();
        for(int r = 0; r < s.length(); r++) {
            lookup.put(s.charAt(r), lookup.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, lookup.get(s.charAt(r)));

            while(r - l + 1 - maxFreq > k) {
                lookup.put(s.charAt(l), lookup.get(s.charAt(l)) - 1);
                maxFreq = Math.max(maxFreq, lookup.get(s.charAt(r)));
                l++;
            }

            mL = Math.max(mL, r - l + 1);
        }

        return mL;
    }
}
