class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            List<String> anagrams = groupedAnagrams.get(sortedString);
            if(anagrams != null) {
                anagrams.add(strs[i]);
                groupedAnagrams.put(sortedString, anagrams);
            } else {
                anagrams = new ArrayList<>();
                anagrams.add(strs[i]);
                groupedAnagrams.put(sortedString, anagrams);
            }
        }

        List<List<String>> anagramsList = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()) {
            anagramsList.add(entry.getValue());
        }

        return anagramsList;
    }

}
