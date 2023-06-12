package java0608;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx04 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(Arrays.asList("MILK","BREAD","BUTTER"));
		
		list.add(1, "APPLE");
		list.set(2, "GRAPE");
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
