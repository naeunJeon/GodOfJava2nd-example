package chapter05;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
	private final int DATA_BOUNDARY = 50;
	
	Hashtable<Integer, Integer> hashtable = new Hashtable<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumberStatistics statistic = new RandomNumberStatistics();
		statistic.getRandomNumberStatistics();
	}
	
	public void getRandomNumberStatistics() {
		Random random = new Random();
		int rand = 0;
		
		for(int i=0; i<5000; i++) {
			rand = random.nextInt(50);
			putCurrentNumber(rand);
		}
		
		printStatistics();
	}
	
	public void putCurrentNumber(int tempNmber) {
		if(hashtable.containsKey(tempNmber)){
			hashtable.put(tempNmber, hashtable.get(tempNmber)+1);
		}else {
			hashtable.put(tempNmber, 1);
		}
		
	}
	
	public void printStatistics() {
		Set<Integer> set = hashtable.keySet();
		
		for(int num : set) {
			System.out.print(num + "=" + hashtable.get(num) + " ");
			if(num % 10 -1 == 0){
				System.out.println();
			}
		}
	}

}
