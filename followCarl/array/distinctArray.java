package followCarl.array;

/**
 * Created by lh on 2022/8/7
 * []
 */
public class distinctArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums){
        int size = nums.length;
        if (size < 2){
            return 1;
        }
        int fast = 1, slow = 1;
        while (fast < size) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
