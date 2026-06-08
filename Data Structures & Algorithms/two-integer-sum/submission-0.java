class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dics = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(dics.get(target - nums[i]) != null) {
                return new int[]{dics.get(target - nums[i]), i};
            } else {
                dics.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
