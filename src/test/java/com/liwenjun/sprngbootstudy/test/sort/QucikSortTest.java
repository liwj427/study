package com.liwenjun.sprngbootstudy.test.sort;

/**
 * @ClassName QucikSortTest
 * @Description 快速排序
 * @Author liwenjun
 * @Date 2021/8/18 10:50 上午
 * @Version: 1.0
 */
public class QucikSortTest {


    public static void main(String[] args) {
        int[] arr = {21, -3, 56, 32, 48, 42, 89, -5, 10, 90, 666, 54, 8};
        quickSort1(arr, 0, arr.length - 1);
        System.out.println("排序后");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }


    private static void quickSort(int[] arr, int low, int higt) {

        if (low < higt) {
            int index = getIndex(arr, low, higt);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, higt);
        }

    }

    /**
     * 获取索引
     *
     * @param arr
     * @param low
     * @param higt
     * @return
     */
    private static int getIndex(int[] arr, int low, int higt) {
        // 获取临时数据
        int temp = arr[low];
        while (low < higt) {
            while (low < higt && arr[higt] > temp) {
                higt--;
            }
            arr[low] = arr[higt];

            while (low < higt && temp > arr[low]) {
                low++;
            }
            arr[higt] = arr[low];
        }
        arr[low] = temp;
        return low;
    }


    private static void quickSort1(int[] arr, int low, int higt) {
        if (null == arr || arr.length <= 1) {
            return;
        }
        if (low > higt){
            return;
        }

        int i, j, temp;
        // 定义基准值
        temp = arr[low];
        i = low;
        j = higt;
        while (i < j) {
            while (i < j && arr[j] >= temp) {
                j--;
            }
            while (i < j && arr[i] <= temp) {
                i++;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort1(arr, low, i - 1);
        quickSort1(arr, i + 1, higt);
    }

    public static void quickSort2(int[] a, int left, int right) {
        if (left > right)
            return;
        int pivot = a[left];//定义基准值为数组第一个数
        int i = left;
        int j = right;

        while (i < j) {
            while (pivot <= a[j] && i < j)//从右往左找比基准值小的数
                j--;
            while (pivot >= a[i] && i < j)//从左往右找比基准值大的数
                i++;
            if (i < j)                     //如果i<j，交换它们
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[left] = a[i];
        a[i] = pivot;//把基准值放到合适的位置
        quickSort2(a, left, i - 1);//对左边的子数组进行快速排序
        quickSort2(a, i + 1, right);//对右边的子数组进行快速排序
    }
}
