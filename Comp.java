import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lh on 2022/8/27
 */
public class Comp {

    //判断一个数组长度必须大于3,并且数组中至少存在两个不一致的数
    public static String test(int[] nums) {
        if (nums.length <= 3) {
            return "no";
        }
        //遍历数组,统计出现的每个数
        Arrays.sort(nums);
        int num = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                num++;
            }
        }
        if (num > 2) {
            return "yes";
        } else if (num == 2) {
            int flagCom = 1;
            int flagNo = 0;
            int firstNum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (firstNum != nums[i]) {
                    flagNo++;
                } else {
                    flagCom++;
                }
            }
            if (flagNo >= 2 && flagCom >= 2)
                return "yes";
            return "no";
        }
        return "no";
    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {//数组平方
            nums[i] = nums[i] * nums[i];
        }
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] >nums[r]){
                
            }else{

            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int[] nums = new int[arrayLength];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(test(nums));
        System.out.println(Arrays.toString(nums));
    }

}

class ArrayCountExample1 {
    public static int arraycount(int[] a) {
        //计算一维数组的长度
        int n = a.length;
        //将数组拷贝到新的地址，这样对新数组操作不会改变原数组
        int[] tmp = new int[n];
        System.arraycopy(a, 0, tmp, 0, n);
        //统计元素种类数
        int Num = 1;
        //将数组按元素大小重新排序
        Arrays.sort(tmp);
        for (int i = 1; i < n; i++) {
            if (tmp[i] != tmp[i - 1]) {
                Num++;
            }
        }
        return Num;
    }

    public static void main(String[] args) {
        // 数组a
        int[] a = {1, 2, 3, 2, 2, 3, 1, 3, 2, 1, 2, 3, 1, 2, 1, 2, 3, 2, 1};
        int aNum = arraycount(a);
        System.out.println("数组a的元素种类数为:" + aNum);

    }
}

