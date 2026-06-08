class Solution {
    public boolean isAnagram(String s, String t) {
        int[] anagram1 = new int[26];
        int[] anagram2 = new int[26];
        char[] anagram1Char = s.toCharArray();
        char[] anagram2Char = t.toCharArray();
        for(char c : anagram1Char) {
            anagram1[c - 'a']++;
        }
        for(char c : anagram2Char) {
            anagram2[c - 'a']++;
        }
        return Arrays.toString(anagram1).equals(Arrays.toString(anagram2));
    }
}
