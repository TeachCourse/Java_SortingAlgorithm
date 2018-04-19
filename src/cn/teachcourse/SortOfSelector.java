package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-3-27.
 */
public class SortOfSelector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 3, 2, 5, 1, 8, 0, 6 };

		designAlgorithmB(num);

		for (int p = 0; p < num.length; p++) {
			System.out.println("num[" + p + "]=" + num[p]);
		}

	}

	/**
	 * 常规的选择排序算法：查找最小元素的数组下标 1、其他元素与选择的元素比较，记录最小元素的数组下标， 2、并将最小元素作为新选择的元素
	 * 
	 * @param num
	 */
	public static void designAlgorithmA(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			int temp = num[i];// 临时变量
			int low = i;// 记录数组最小元素下标
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					low = j;
				}
			}
			// 将最小元素移动到左边i的位置
			if (i != low) {
				num[i] = num[low];
				num[low] = temp;
			}
		}
	}

	public static void designAlgorithmB(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			int temp = a[i];
			int large = i;
			for (int j = i - 1; j >= 0; j--) {
				if (a[large] < a[j])
					large = j;
			}
			a[i] = a[large];
			a[large] = temp;
		}
	}

}
