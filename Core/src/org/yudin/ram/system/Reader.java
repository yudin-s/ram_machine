package org.yudin.ram.system;

public class Reader {
	private static Integer array[];
	private static int curr;

	public static int readNext() {
		int result = array[curr];
		curr = curr + 1;
		return result;

	}

	public static Integer[] getArray() {
		return array;
	}

	public static void setArray(Integer[] array2) {
		Reader.array = array2;
	}
}
