package com.lw.code;

/**
 *  演示二分查找
 * @author lw
 */
public class BinarySearch {

	/**
	 * 二分法查找法,不用考虑奇数偶数
	 * 
	 * @param items
	 *            要查找的数组,必须是已经排过序的,例如1, 3, 5, 6, 9, 11, 15,19
	 * @param key
	 *            要查找的数字
	 * @return
	 */
	public static int binarySearch(int[] items, int key) {
		int start = 0;
		int end = items.length - 1;
		int mid = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (items[mid] == key) {
				return mid; // 已经找到
			} else if (items[mid] > key) {
				end = mid - 1;
			} else if (items[mid] < key) {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int items[] = { 1, 3, 5, 6, 9, 11, 15, 19 };
		int position = binarySearch(items, 9);
		System.out.println(position);
	}
}
