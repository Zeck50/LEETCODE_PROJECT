class Solution {
    private final int RESULT_ARRAY_SIZE = 2;
    private final int RESULT_INDEX_ZERO = 0;
    private final int RESULT_INDEX_ONE = 1;

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[RESULT_ARRAY_SIZE];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[RESULT_INDEX_ZERO] = i;
                    result[RESULT_INDEX_ONE] = j;

                }
            }
        }
        return result;
    }
}
