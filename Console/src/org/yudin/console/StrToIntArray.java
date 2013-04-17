package org.yudin.console;
import java.util.ArrayList;
import java.util.Scanner;


public class StrToIntArray {
	private static final Integer a[] = {1};
	
	public static Integer[] convert(String val){
		ArrayList<Integer> result = new ArrayList<Integer>();
		Scanner scan = new Scanner(val);
		while (scan.hasNextInt()){
			result.add(scan.nextInt());
		}
		return result.toArray(a);
	}
}
