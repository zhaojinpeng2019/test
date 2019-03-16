package com.zjp.test.sort;
// 插入排序
public class TestInsertSort {
	public void insertSort(int[] a) {
		int i, j;
		for(i = 1; i < a.length; i++) {
			int temp = a[i];
			for(j = i; j > 0 && temp < a[j-1]; j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}
}
