class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> sym = new HashMap<>();
        sym.put('}', '{');
        sym.put(']','[');
        sym.put(')','('); 
        for(int i = 0; i < s.length(); i++) {            
            if(!st.isEmpty() && sym.get(s.charAt(i)) == st.peek()) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        if(st.isEmpty()) {
            return true;
        }

        return false;
    }
}
