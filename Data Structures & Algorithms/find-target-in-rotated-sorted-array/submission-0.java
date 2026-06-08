class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int pivot = 0;
        while(l <= r) {
            int m = l + (r - l)/2;
            if(nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m - 1;
            }

            if(nums[pivot] > nums[m]) {
                pivot = m;
            }
        }


        if(pivot != 0 && target > nums[nums.length -1]) {
            l = 0; 
            r = pivot - 1;
        } else {
            l = pivot;
            r = nums.length -1;
        }
        while(l <= r) {
            int m = l + (r - l)/2;
            if(target == nums[m]) {
                return m;
            } else if(target > nums[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}
