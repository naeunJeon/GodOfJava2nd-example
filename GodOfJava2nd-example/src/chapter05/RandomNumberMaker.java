package chapter05;
import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomNumberMaker maker = new RandomNumberMaker();
		for(int i =0; i<10; i++) {
			System.out.println(maker.getSixNumber());
		}
	}
	
	public HashSet<Integer> getSixNumber(){
		HashSet<Integer> set = new HashSet<>();
		Random random = new Random();
		int temp = 0;
		
		while(set.size()<6) {
			temp = random.nextInt(45);
			set.add(temp);
		}
		return set;
	}
}
