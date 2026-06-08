class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            Integer val = mp.get(nums[i]);
            if(val != null) {
                mp.put(nums[i], ++val);
            } else {
                mp.put(nums[i], 1);
            }
        }

        System.out.println(mp);

        int[] lists = mp.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue(Collections.reverseOrder()))
            .mapToInt(Map.Entry::getKey)
            .limit(k)
            .toArray();

        return lists;
    }
}
