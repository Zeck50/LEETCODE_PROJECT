import java.util.HashMap;

public class Solution2 {
    private final static int RESULT_LENGTH=2;
    public static void main(String[] args)
    {
        int[] test=new int[]{2,7,11,15};
        System.out.print(twoSum(test,9)[0]);
        System.out.print(twoSum(test,9)[1]);
    }
    public static int[]  twoSum(int[] nums, int target) {
        int[] result=new int[RESULT_LENGTH];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement=target-nums[i];
            if(map.containsKey(complement)&&map.get(complement)!=i)
            {
                result=new int[]{i,map.get(complement)};
                return result;
            }
        }
        throw new IllegalArgumentException("No Illegal Int");
    }
}
