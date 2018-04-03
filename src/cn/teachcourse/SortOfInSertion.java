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
		int j;// 记录左边元素的下标
		for (int i = 1; i < num.length; i++) {
			int tmp = num[i];// 记录插入有序数组的元素

			for (j = i; j > 0 && tmp < num[j - 1]; j--) {
				num[j] = num[j - 1];// 将元素往右边移动
			}
			// 跳出了循环，说明找到了元素插入的位置并插入
			num[j] = tmp;
		}
		//遍历排序好的数组num
        int p=0;
		for (int i : num) {
			System.out.println("num["+p+"]="+i);
			p++;
		}
	}

}
