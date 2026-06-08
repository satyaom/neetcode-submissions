class Solution {
    public boolean isPalindrome(String s) {
        char[] ca = s.toCharArray();
        int i = 0, j = ca.length - 1;
        while(i < j) {
            if(!(ca[i] >= 'a' && ca[i] <= 'z' ||
            ca[i] >= 'A' && ca[i] <= 'Z' || 
            ca[i] >= '0' && ca[i] <= '9')) {
                i++;
            } else if(!(ca[j] >= 'a' && ca[j] <= 'z' ||
            ca[j] >= 'A' && ca[j] <= 'Z' || 
            ca[j] >= '0' && ca[j] <= '9')) {
                j--;
            } else if(Character.toLowerCase(ca[i]) == Character.toLowerCase(ca[j])) {
                i++;
                j--;
            } else {
                return false;
            }
            
        }

        return true;
    }
}
