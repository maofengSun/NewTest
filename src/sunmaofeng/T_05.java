package sunmaofeng;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T_05 {

    public static int[] twoSumOne(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return nums;
        }
        int[] arr = new int[2];
        //无脑算法 双重for循环 遍历相加
        end:
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break end;
                }
            }
        }

        return arr;
    }

    public static int[] twoSumTwo(int[] nums, int target) {

        Map<Integer , Integer> arrMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (arrMap.containsKey(target - nums[i])){
                return new int[]{arrMap.get(target-nums[i]),i};
            }else{
                arrMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] ints = twoSumTwo(nums, target);
        for (int j:ints
             ) {
            System.out.println(j);
        }
        int[] sum = twoSumOne(nums, target);
        for (int i : sum
                ) {
            System.out.println(i);
        }
    }

}
