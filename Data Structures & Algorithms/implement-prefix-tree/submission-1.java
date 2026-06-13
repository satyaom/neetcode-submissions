class PrefixTree {
    Map<Character, PrefixTree> childrens;
    Boolean endingWord;

    public PrefixTree() {
        childrens = new HashMap<>();
        endingWord = false;
    }

    public void insert(String word) {
        PrefixTree pt = this;
        for(int i = 0; i < word.length(); i++) {
            if(!pt.childrens.containsKey(word.charAt(i))) {
                pt.childrens.put(word.charAt(i), new PrefixTree());                
            }
            pt = pt.childrens.get(word.charAt(i));
        }
        pt.endingWord = true;
    }

    public boolean search(String word) {
        PrefixTree pt = this;
        for(int i = 0; i < word.length(); i++) {
            if(pt.childrens.containsKey(word.charAt(i))) {
                pt = pt.childrens.get(word.charAt(i));
            } else {
                return false;
            }
        }
        return pt.endingWord;
    }

    public boolean startsWith(String prefix) {
        PrefixTree pt = this;
        for(int i = 0; i < prefix.length(); i++) {
            if(pt.childrens.containsKey(prefix.charAt(i))) {
                pt = pt.childrens.get(prefix.charAt(i));
            } else {
                return false;
            }
        }
        return true;    
    }
}
