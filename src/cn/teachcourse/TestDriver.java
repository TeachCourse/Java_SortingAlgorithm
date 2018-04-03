package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-3-27.
 */
public class TestDriver {

	public static void main(String args[]) {

		
	    int a[]={3,2,5,8,9,1};
	    
	    for(int i=0;i<a.length-1;i++){
	        int temp;//临时变量
	        int low = i;//记录数组最小元素的下标
	        for(int j=i+1;j<a.length;j++){
	            if(a[i]>a[j]){
	                low=j;
	            }
	        }
	        temp=a[i];
	        a[i]=a[low];//将最小元素的值移动到i位置
	        a[low]=temp;//将i位置的值移动到low位置
	    }
	    
	    for(int p=0;p<a.length;p++){
	        System.out.println("a["+p+"]="+a[p]);
	    }
	}

	public void quickSort(int a[], int i, int j) {
		if (i < j) {
			int meet = getMiddle(a, i, j);
			// 左边数组
			quickSort(a, i, meet - 1);
			// 右边数组
			quickSort(a, meet + 1, j);
		}
	}

	public int getMiddle(int a[], int i, int j) {
		// 选择基准元素
		int temp = a[i];
		while (i < j) {

			// 从右边开始移动数组下标
			while (i < j && a[j] >= temp) {
				j--;
			}
			// 将小于基准元素的值移动位置
			a[i] = a[j];

			while (i < j && a[i] <= temp) {
				i++;
			}
			// 将大于基准元素的值移动位置
			a[j] = a[i];
		}
		// 最后将基准元素放入腾出的空位
		a[i] = temp;
		// 返回相遇的数组下标
		return i;
	}

}
