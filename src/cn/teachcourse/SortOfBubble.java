package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-3-25.
 */
public class SortOfBubble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int num[] = { 4, 6, 2, 5, 8, 9 };
		int num[] = { 6, 1, 2, 5, 4, 3, 9, 7, 10, 8 };

		for (int i = 0; i < num.length - 1; i++) {
			int tmp;// ÁÙÊ±±äÁ¿
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]=" + num[i]);
		}
	}

}
