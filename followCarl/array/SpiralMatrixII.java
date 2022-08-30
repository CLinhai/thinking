package followCarl.array;

//打印螺旋矩阵

public class SpiralMatrixII {
    /*
     * 返回二维数组,依次排列得到对应矩阵
     * 顺时针依次打印
     * 边界每次留最后一个给下一组打印,
     *
     * */
    public int[][] generateMatrix(int n) {
        int start = 0;//每次循环的开始点
        int[][] res = new int[n][n];//初始化二维数组
        int i, j;
        int count = 1;//定义填充的数字
        int loop = 0;//控制循环的次数

        while (loop++ < n / 2) {//控制外围圈数
            for (j = start; j < n - loop; j++) {//上边:从左往右
                res[start][j] = count++;
            }

            for (i = start; i < n - loop; i++) {//右边:从上往下
                res[i][j] = count++;
            }

            for (; j >= loop; j--) {//下边:从右往左
                res[i][j] = count++;
            }

            for (; i >= loop; i--) {//左边:从下往上
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }
        return res;
    }

}
