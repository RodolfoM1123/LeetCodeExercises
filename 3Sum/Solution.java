class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> solutionL = new ArrayList<>();
        int j;
        int k;
        int sum;

        for(int i = 0; i < nums.length - 2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            j = i + 1;
            k = nums.length -1;
            while(nums[i] <= 0 && j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    solutionL.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j < k) j++;
                }
                else if(sum > 0) k--;
                else if(sum < 0) j++;

            }

        }
       
        return solutionL;
    }
}
