class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff = 0;

        Map<Integer, Integer> indexNums = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            
            if(indexNums.get(nums[i]) != null){
                return new int[] {indexNums.get(nums[i]),i};
            }
            else{
                diff = target - nums[i];
                indexNums.put(diff, i);
            }
            

        }

        return new int[] {};
    }
}
