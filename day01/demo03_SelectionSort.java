package day01;

/**
 * @Author: clh.
 * @Description: 选择排序
 * @Date Created in 2022-07-25 19:50
 * @Modified By:
 */
public class demo03_SelectionSort {

    //选择排序 每次选出最小值放在数组左边
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        //0~n-1
        //0~n-2
        for (int end = N - 1; end >= 0; end--) {
            //比较剩余的所有数
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    //插入排序
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newNumber = end;
            while (newNumber - 1 >= 0 && arr[newNumber - 1] > arr[newNumber]) {
                swap(arr, newNumber - 1, newNumber);
                newNumber--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 3, 5, 1, 9, 6};
        print(arr);
        insertSort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
