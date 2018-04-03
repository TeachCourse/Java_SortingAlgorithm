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
	 * �ݹ���ã�ֱ���������
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
	 * A��������߳�����B�������ұ߳���������A��B�������ڵ���±�λ��
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
			// ��С��key��ֵ�ƶ������
			num[low] = num[high];

			while (low < high && num[low] <= key) {
				low++;
			}
			System.out.println("low="+low);
			// ������key��ֵ�ƶ����ұ�
			num[high] = num[low];

		}
		num[low] = key;
		return low;
	}
}
