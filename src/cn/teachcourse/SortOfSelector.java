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
			int temp = num[i];// ��ʱ����
			int low = i;// ��¼������СԪ���±�
			for (int j = i + 1; j < num.length; j++) {
				if (num[low] > num[j]) {
					low = j;
				}
			}
			// ����СԪ���ƶ��������

			num[i] = num[low];
			num[low] = temp;
		}

		for (int p = 0; p < num.length; p++) {
			System.out.println("num[" + p + "]=" + num[p]);
		}

	}

}
