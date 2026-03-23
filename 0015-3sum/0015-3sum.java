class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            Set<Integer> set = new HashSet<>();

            for(int j = i + 1; j < nums.length; j++){
                int target = -nums[i] - nums[j];

                if(set.contains(target)){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], target);
                    Collections.sort(triplet); // to avoid duplicates
                    res.add(triplet);
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(res);

    }
}