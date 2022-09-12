package offer;

/**
 * Created by lh on 2022/9/11
 * 找出数组中重复的数字。
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
       int[] arr = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
           arr[nums[i]]++;
           if (arr[nums[i]] > 1) return nums[i];
       }
       return -1;
    }
}
