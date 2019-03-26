package cn.teachcourse.search;

public class ArraySearch {

    /**
     * 顺序查找的平均复杂度O(n)
     *
     * @param a   要查找的数组
     * @param key 要查找的值
     * @return 查找结果（数组的下标）
     */
    public static int normal(int a[], int key) {
        if (a == null || a.length == 0) return -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    /**
     * 二分查找，要求数组是有序的
     *
     * @param a   要查找的数组
     * @param key 要查找的值
     * @return 查找结果（数组的下标）
     */
    public static int binarySearch(int a[], int key) {
        int low = 0;
        int high = a.length - 1;
        if (a == null || a.length == 0) return -1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (key == middle) return middle;
            else if (a[middle] > key)
                high = middle - 1;
            else
                low = middle + 1;
        }
        return -1;
    }


}
