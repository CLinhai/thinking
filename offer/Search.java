package offer;

/**
 * Created by lh on 2022/9/11
 * 二分查找数组指定元素出现个数
 */
public class Search {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        //确定tar右边界
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
        }
        //记录右边界
        int j = left;
        if (right > 0 && nums[right] != target) return 0;
        left = 0; right = nums.length - 1;
        //确定tar左边界
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target)left = mid + 1;
            else right = mid - 1;
        }
        //记录左边界
        int i = right;
        return j - i -1;
    }
}
