class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> cSet = new HashSet<>();
        int mL = 0;
        for(char c : s.toCharArray()) {
            cSet.add(c);
        }
        for(char c : cSet) {
            int count = 0;
            int l = 0;
            for(int r = 0; r < s.length(); r++) {
                if(s.charAt(r) == c) {
                    count++;
                }

                while(r - l + 1 - count > k) {
                    if(s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }

                mL = Math.max(mL, r - l + 1);
            }
        }

        return mL;
    }
}
