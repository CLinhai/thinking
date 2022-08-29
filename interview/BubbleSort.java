package interview;

import java.util.Arrays;

//经典冒泡
public class BubbleSort {
    /**
     * @param nums 被排序的数组
     * @return
     */
    public static void bubbleSort(int[] nums) {
        int size = nums.length;
        //外层遍历size - 1次
        for (int i = 1; i < size; i++) {
            //内层遍历
            for (int j = 0; j < size - i; j++) {
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println("第"+i+"次遍历的结果为" + Arrays.toString(nums));
        }
//        return nums;
    }

    public static void main(String[] args) {

       	        int[] data = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

       	        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));

       	        bubbleSort(data);

       	        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
       	    }

}
