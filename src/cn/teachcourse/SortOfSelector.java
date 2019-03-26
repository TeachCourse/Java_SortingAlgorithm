package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-3-27.
 */
public class SortOfSelector {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int num[] = {3, 2, 5, 1, 8, 0, 6, 8, 10, 3, 1, 3};

        designAlgorithmB(num);

        for (int p = 0; p < num.length; p++) {
            System.out.println("num[" + p + "]=" + num[p]);
        }

    }

    public static void designAlgorithmA(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int temp = num[i];
            int low = i;
            for (int j = i + 1; j < num.length && num[j] < temp; j++) {
                low = j;
            }
            num[i] = num[low];
            num[low] = temp;

        }
    }

    public static void designAlgorithmB(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            int large = i;
            int temp = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[large] < a[j])
                    large = j;
            }
            a[i] = a[large];
            a[large] = temp;
        }
    }

}
