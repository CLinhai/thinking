package offer;

/**
 * Created by lh on 2022/9/12
 * 二维数组中查找某数
 */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int x = matrix.length;//行的长度
        int y = matrix[0].length;//列的长度
        Boolean flag = false;
        if (matrix[0][0] > target && matrix[x - 1][y - 1] < target) return false;
        int i = 0;
        while (i < x && flag == false) {//二分法判断每一行
            int low = 0,high = y - 1;
            while (low <= high){
                int mid = (low + high) >> 1;
                if (matrix[i][mid] < target){
                    low = mid + 1;
                }else if (matrix[i][mid] > target){
                    high = mid - 1;
                }else {
                    flag = true;
                    break;
                }
            }
            i++;
        }
        return flag;
    }
}
