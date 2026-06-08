class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> lookup = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            lookup.put(t.charAt(i), lookup.getOrDefault(t.charAt(i), 0) + 1);
        }
        int rCount = lookup.size();
        int cCount = 0;

        String result = "";
        int minL = Integer.MAX_VALUE;
        int l = 0;
        Map<Character, Integer> window = new HashMap<>();
        for(int r = 0; r < s.length(); r++) {
            if(lookup.containsKey(s.charAt(r))) {
                window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) + 1);
                if(lookup.get(s.charAt(r)) == window.get(s.charAt(r))) {
                    cCount++;
                }
            }

            while(rCount == cCount) {
                if(minL > r - l + 1) {
                    minL = r - l + 1;
                    result = s.substring(l, r+1);
                }
                if(window.containsKey(s.charAt(l))) {
                    window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                    if(window.get(s.charAt(l)) < lookup.get(s.charAt(l))) {
                        cCount--;
                    }
                }
                l++;
            }
        }
        return result;
    }
}
