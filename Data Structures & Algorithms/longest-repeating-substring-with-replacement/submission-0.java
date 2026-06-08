class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> lookup = new HashMap<>();
        int mFreq = 0;
        int mL = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                lookup.put(s.charAt(j), lookup.getOrDefault(s.charAt(j), 0) + 1);
                mFreq = Integer.max(mFreq, lookup.get(s.charAt(j)));
                if(j - i + 1 - mFreq <= k) {
                    mL = Integer.max(mL, j - i + 1);
                }
            }
            lookup.clear();
            mFreq = 0;
        }

        return mL;
    }
}
