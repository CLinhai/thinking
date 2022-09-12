package nowCoder;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by lh on 2022/9/10
 * 寻找第k大的元素
 * 思路，先使用快排进行排序,然后直接取nums[length - k]的元素即是第
 */
public class findKth {
    public int findKthLargest(int[] nums, int k) {
        // write code here
        if (k == 0) return 0;
        int left = 0, right = nums.length - 1;
        quickSort1(nums, left, right);
        return nums[right + 1 - k];
    }

    public int getMid(int[] nums, int left, int right) {
        int pivot = nums[left];
        int low = left;
        int high = right;
        while (left < right) {
            while (nums[right] >= pivot && left < right) right--;
            nums[left] = nums[right];
            while (nums[left] <= pivot && left < right) left++;
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }

    public void quickSort1(int nums[], int left, int right) {
        if (left < right) {
            int mid = getMid(nums, left, right);
            //对左边排序递归
            quickSort1(nums, left, mid - 1);
            //对右边排序递归
            quickSort1(nums, mid + 1, right);
        }
    }

    @Test
    public void test() {
        int[] nums = {1, 3, 5, 2, 2};
        quickSort1(nums, 0, nums.length - 1);
        int kth = findKthLargest(nums, 5);
        System.out.println(kth);
        System.out.println(Arrays.toString(nums));
    }

}
