package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-3-27.
 */
public class SortOfQuick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int num[] = { 3, 2, 5, 1, 8, 0, 6 };
		int num[] = { 0,2,1 };
		
		SortOfQuick quick = new SortOfQuick();
		quick.sort(num, 0, num.length - 1);

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]=" + num[i]);
		}

	}

	/**
	 * 递归调用，直到排序完成
	 * 
	 * @param num
	 * @param low
	 * @param high
	 */
	public void sort(int[] num, int low, int high) {
		if (low < high) {
			int calMiddle = calMiddle(num, low, high);
			sort(num, low, calMiddle - 1);
			sort(num, calMiddle + 1, high);
		}
	}

	/**
	 * A从数组左边出发，B从数组右边出发，计算A、B相遇所在点的下标位置
	 * 
	 * @param num
	 * @param low
	 * @param high
	 * @return
	 */
	public int calMiddle(int[] num, int low, int high) {
		int key = num[low];
		while (low < high) {

			while (low < high && num[high] >= key) {
				high--;
			}
			System.out.println("high="+high);
			// 将小于key的值移动到左边
			num[low] = num[high];

			while (low < high && num[low] <= key) {
				low++;
			}
			System.out.println("low="+low);
			// 将大于key的值移动到右边
			num[high] = num[low];

		}
		num[low] = key;
		return low;
	}
}
