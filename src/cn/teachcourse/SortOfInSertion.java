package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-3-24.
 */
public class SortOfInSertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num[] = { 4, 2, 5, 1, 9, 8, 6 };
		int j;// ��¼���Ԫ�ص��±�
		for (int i = 1; i < num.length; i++) {
			int tmp = num[i];// ��¼�������������Ԫ��

			for (j = i; j > 0 && tmp < num[j - 1]; j--) {
				num[j] = num[j - 1];// ��Ԫ�����ұ��ƶ�
			}
			// ������ѭ����˵���ҵ���Ԫ�ز����λ�ò�����
			num[j] = tmp;
		}
		//��������õ�����num
        int p=0;
		for (int i : num) {
			System.out.println("num["+p+"]="+i);
			p++;
		}
	}

}
