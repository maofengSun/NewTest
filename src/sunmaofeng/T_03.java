package sunmaofeng;


public class T_03 {
    public static void rotate(int[] nums, int k) {//2

        int length = nums.length;
        if(k !=0 ){
            for (int i = 0; i <k ; i++) {
                int last = nums[length-1];
                for (int j = length-1; j >0; j--) {
                    nums[j] = nums[j -1];
                }
                nums[0] = last;
            }
        }
        for (int num:nums
             ) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr,2);
    }
}
