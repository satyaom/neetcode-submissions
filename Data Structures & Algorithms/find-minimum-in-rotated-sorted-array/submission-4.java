class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int minN = nums[l];
        int mid = 0;
        while(l < r) {
            mid = l + (r - l)/2;
            System.out.println(l + " " + r + " " + mid);
            if(nums[mid] < nums[r]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            minN = Math.min(minN, nums[mid]);
        }

        mid = l + (r - l)/2;
            System.out.println(l + " " + r + " " + mid);

        minN = Math.min(minN, nums[mid]);

        return minN;
    }
}
