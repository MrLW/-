package com.lw.code;

/**
 *  ��ʾ���ֲ���
 * @author lw
 */
public class BinarySearch {

	/**
	 * ���ַ����ҷ�,���ÿ�������ż��
	 * 
	 * @param items
	 *            Ҫ���ҵ�����,�������Ѿ��Ź����,����1, 3, 5, 6, 9, 11, 15,19
	 * @param key
	 *            Ҫ���ҵ�����
	 * @return
	 */
	public static int binarySearch(int[] items, int key) {
		int start = 0;
		int end = items.length - 1;
		int mid = -1;
		while (start <= end) {
			mid = (start + end) / 2;
			if (items[mid] == key) {
				return mid; // �Ѿ��ҵ�
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