package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-3-27.
 */
public class TestDriver {

	public static void main(String args[]) {

		
	    int a[]={3,2,5,8,9,1};
	    
	    for(int i=0;i<a.length-1;i++){
	        int temp;//��ʱ����
	        int low = i;//��¼������СԪ�ص��±�
	        for(int j=i+1;j<a.length;j++){
	            if(a[i]>a[j]){
	                low=j;
	            }
	        }
	        temp=a[i];
	        a[i]=a[low];//����СԪ�ص�ֵ�ƶ���iλ��
	        a[low]=temp;//��iλ�õ�ֵ�ƶ���lowλ��
	    }
	    
	    for(int p=0;p<a.length;p++){
	        System.out.println("a["+p+"]="+a[p]);
	    }
	}

	public void quickSort(int a[], int i, int j) {
		if (i < j) {
			int meet = getMiddle(a, i, j);
			// �������
			quickSort(a, i, meet - 1);
			// �ұ�����
			quickSort(a, meet + 1, j);
		}
	}

	public int getMiddle(int a[], int i, int j) {
		// ѡ���׼Ԫ��
		int temp = a[i];
		while (i < j) {

			// ���ұ߿�ʼ�ƶ������±�
			while (i < j && a[j] >= temp) {
				j--;
			}
			// ��С�ڻ�׼Ԫ�ص�ֵ�ƶ�λ��
			a[i] = a[j];

			while (i < j && a[i] <= temp) {
				i++;
			}
			// �����ڻ�׼Ԫ�ص�ֵ�ƶ�λ��
			a[j] = a[i];
		}
		// ��󽫻�׼Ԫ�ط����ڳ��Ŀ�λ
		a[i] = temp;
		// ���������������±�
		return i;
	}

}
