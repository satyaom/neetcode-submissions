class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int minN = nums[l];
        while(l < r) {
            if(nums[l] > nums[r]) {
                l++;
            } else {
                r--;
            }
            minN = Math.min(minN, nums[(l+r)/2]);
        }

        return minN;
    }
}
