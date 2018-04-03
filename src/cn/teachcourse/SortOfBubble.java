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

		designAlgorithmB(num);

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]=" + num[i]);
		}
	}

	private static void designAlgorithmA(int[] num) {
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
	}

	public static void designAlgorithmB(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a.length - 1; j >= 0; j--) {
				int temp;
				
				if (j - 1 >= 0 && a[j-1] > a[j]) {
					temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
				}
			}
		}
	}
}
