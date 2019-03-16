package com.zjp.test.sort;
// 冒泡排序
public class TestBubbleSort {
	public static void bubbleSort(int[] a) {
		int temp = 0;
		for(int i = 0; i < a.length-1; i++) {
			int flag = 0;
			for(int j = 0; j < a.length-i-1; j++) {
				if (a[j+1] < a[j]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {9, 2, 4, 1, 5};
		bubbleSort(a);
		for (int x : a) {
			System.out.println(x);
		}
		
	}
}
