package followCarl;

/**
 * Created by lh on 2022/8/5
 * 二分数组插入随机数
 */
public class demo01 {
    public static void main(String[] args) {
        int nums[] = {1,2,4,5,6,7};
        int target = 3;
        System.out.println(searchInsertLocation(nums, target));
    }

    /*
    * 存在四种情况
    * 1、2、数组中所有数都比target值大或者小
    * 3、刚好存在一个数等于target值
    * 4、插入到某一个位置
    * */
    public static int searchInsertLocation(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= target){
                right = mid - 1;
            }else if (nums[mid] <= target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return right + 1;
    }
}
