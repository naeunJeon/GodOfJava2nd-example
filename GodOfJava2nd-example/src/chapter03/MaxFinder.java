package chapter03;
import java.lang.*;

public class MaxFinder {

	public <T extends Comparable<T>> T getMax(T ... a) {
		T maxT = a[0];
		for(T tempT : a) {
			if(maxT.compareTo(tempT)<0) {
				maxT = tempT;
			}
		}
		return maxT;
	}

}
