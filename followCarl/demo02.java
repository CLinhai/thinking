package followCarl;

/**
 * Created by lh on 2022/8/6
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 */
public class demo02 {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = findGtValueIndex(nums, target - 1);
        int lastIndex = findGtValueIndex(nums, target) - 1;
        if (firstIndex <= lastIndex && nums[firstIndex] == target)
        return new int[]{firstIndex,lastIndex};
        return new int[] {-1, -1};
    }

    //找出数组中大于某个数出现的第一个位置
    public static int findGtValueIndex(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] > target) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
