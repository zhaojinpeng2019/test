package com.zjp.test.sort;
// 选择排序
public class TestSelectSort {
	public static void selectSort(int[] a) {
		for(int i = 0; i < a.length-1; i++) {
			// 最小值下标
			int minIndex = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			if(i != minIndex) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {5,4,9,1,7};
		selectSort(a);
		for(int x:a) {
			System.out.println(x);
		}
	}
}
