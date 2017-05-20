package com.lw.code;

/**
 * —› æ√∞≈›≈≈–Ú
 * 
 * @author lw
 */
public class BubbleSort {

	// √∞≈›≈≈–Ú
	public static void bubbleSort(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	// ”≈ªØ∫Ûµƒ√∞≈›≈≈–Ú
	public static void improvedBubbleSort(int[] list) {
		boolean needNextPass = true;
		for (int k = 1; k < list.length && needNextPass; k++) {
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i] > list[i + 1]) {
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}

	public static void print(int[] items) {
		for (int i : items) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] items = { 4, 2, 3, 1, 11, 7, 8 };
		// bubbleSort(items);
		improvedBubbleSort(items);
		print(items);
	}

}
