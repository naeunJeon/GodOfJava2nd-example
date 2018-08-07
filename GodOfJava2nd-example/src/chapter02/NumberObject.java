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
}
