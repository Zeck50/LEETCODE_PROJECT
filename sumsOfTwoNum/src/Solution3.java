import java.util.HashMap;

public class Solution3 {
    private final static int RESULT_LENGTH=2;
    public static void main(String[] args)
    {
        int[] test=new int[]{2,7,11,15};
        System.out.print(twoSum(test,9)[0]);
        System.out.print(twoSum(test,9)[1]);
    }
    public static int[]  twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)&&map.get(complement)!=i)
            {
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no sum");
    }
}
