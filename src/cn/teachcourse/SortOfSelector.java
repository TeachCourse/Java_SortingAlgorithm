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
	 * �����ѡ�������㷨��������СԪ�ص������±� 1������Ԫ����ѡ���Ԫ�رȽϣ���¼��СԪ�ص������±꣬ 2��������СԪ����Ϊ��ѡ���Ԫ��
	 * 
	 * @param num
	 */
	public static void designAlgorithmA(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			int temp = num[i];// ��ʱ����
			int low = i;// ��¼������СԪ���±�
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					low = j;
				}
			}
			// ����СԪ���ƶ������i��λ��
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
