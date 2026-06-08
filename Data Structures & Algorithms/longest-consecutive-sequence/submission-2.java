class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> existance = new HashSet<>();
        for(int n : nums) {
            existance.add(n);
        }

        int maxLongLen = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!existance.contains(nums[i]-1)) {
                int curLongLen = 1;
                while(existance.contains(nums[i]+curLongLen)) {
                    curLongLen++;
                }
                maxLongLen = Math.max(curLongLen, maxLongLen);
            }
        }

        return maxLongLen;
    }
}
