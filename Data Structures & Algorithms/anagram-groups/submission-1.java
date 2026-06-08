class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for(String s : strs) {
            String charFreq = freqVector(s);
            anagramsMap.putIfAbsent(charFreq, new ArrayList<>());
            anagramsMap.get(charFreq).add(s);
        }

        return new ArrayList<>(anagramsMap.values());
    }

    private String freqVector(String str) {
        int[] freqList = new int[26];
        char[] charStr = str.toCharArray();
        for(char c : charStr) {
            freqList[c - 'a']++;
        }
        return Arrays.toString(freqList);
    } 
}
