package twosearch;

public class search {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Solution.search(nums,3));
    }
}

//二分查找
class Solution {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
