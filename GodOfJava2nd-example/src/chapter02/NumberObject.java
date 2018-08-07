package chapter02;

import java.awt.List;
import java.util.ArrayList;

public class NumberObject<E> {

	public long parseLong(String data) {
		long temp = -1;
		try {
			temp = Long.parseLong(data);
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return temp;
	}
	public String[] printOtherBase(long value) {
		ArrayList<String> arr = new ArrayList<>();
		
		String binary = Long.toBinaryString(value);
		String hex = Long.toHexString(value);
		String oct = Long.toOctalString(value);
		
		arr.add(binary);
		arr.add(hex);
		arr.add(oct);
		
		String[] strings = arr.toArray(new String[0]);
		
		return strings;
	}
}
