class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int reverseProd = 1;
        List<Integer> prodArrays = new ArrayList<>();
        List<Integer> reverseProdArrays = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            reverseProd *= nums[nums.length - 1 - i];
            prodArrays.add(prod);
            reverseProdArrays.add(reverseProd);
        }
        Collections.reverse(reverseProdArrays);
        int[] productArrays = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                productArrays[0] = reverseProdArrays.get(1);
            } else if(i == nums.length - 1) {
                productArrays[nums.length - 1] = prodArrays.get(nums.length-2);
            } else {
                productArrays[i] = prodArrays.get(i-1) * reverseProdArrays.get(i+1);
            }
        }

        return productArrays;
    }
}  
