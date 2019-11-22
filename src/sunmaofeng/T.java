package sunmaofeng;

public class T {

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int length = nums.length;
        if (length == 1) {
            count = 1;
        }
        if (length > 1) {
            count += 1;
            int i = 0;
            for (int j = i; j < length; j++) {
                if (nums[i] != nums[j]) {
                    nums[count] = nums[j];
                    count += 1;
                    i = j;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2,2,3, 3};
        System.out.println(removeDuplicates(nums));


    }
}
