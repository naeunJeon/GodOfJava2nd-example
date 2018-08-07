import java.lang.*;

public class MaxFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxFinder finder = new MaxFinder();
		finder.testGetMax();
	}
	
	public void testGetMax() {
		System.out.println(getMax(1, 2, 3));
		System.out.println(getMax(3, 1, 2));
		System.out.println(getMax(2, 3, 1));
		System.out.println(getMax("a", "b", "c"));
		System.out.println(getMax(1, 2, 3));
		System.out.println(getMax(1, 2, 3));
	}
	
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
