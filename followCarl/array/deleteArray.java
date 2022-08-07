package followCarl.array;

/**
 * Created by lh on 2022/8/7
 */
public class deleteArray {
    public static void main(String[] args) {
      /*  int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));*/

    }

    private static int removeElement(int[] nums, int val) {
        int slowIndex;
        int fastIndex = 0;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    public static int removeElement1(int[] nums, int val) {
        int sum = nums.length;
        for (int i = 0; i < sum; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < sum; j++) {
                    nums[j - 1] = nums[j];
                }
                sum--;
                i--;
            }
        }
        return sum;
    }


}
