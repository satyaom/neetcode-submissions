class Solution {
    public String encode(List<String> strs) {
        String encodeStr = "";
        for(String s : strs) {
            encodeStr += s.length() + "#" + s;
        }
        return encodeStr;
    }

    public List<String> decode(String str) {
        char[] charArray = str.toCharArray();
        List<String> decodedStrs = new ArrayList<>();
        int k = 0;
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '#') {
                String lengthStr = "";
                while(k < i) {
                    lengthStr += charArray[k];
                    k++;
                }
                System.out.println(k);
                int length = Integer.parseInt(lengthStr);
                String decodedStr = "";
                for(int j = i + 1; j <= i + length; j++) {
                    decodedStr += charArray[j];
                }
                i += length;
                decodedStrs.add(decodedStr);
                k = i+1;
            }
        }
        return decodedStrs;
    }
}
