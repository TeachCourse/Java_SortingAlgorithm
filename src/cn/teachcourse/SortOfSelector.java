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

		for (int i = 0; i < num.length - 1; i++) {
			int temp = num[i];// 临时变量
			int low = i;// 记录数组最小元素下标
			for (int j = i + 1; j < num.length; j++) {
				if (num[low] > num[j]) {
					low = j;
				}
			}
			// 将最小元素移动到最左边

			num[i] = num[low];
			num[low] = temp;
		}

		for (int p = 0; p < num.length; p++) {
			System.out.println("num[" + p + "]=" + num[p]);
		}

	}

}
